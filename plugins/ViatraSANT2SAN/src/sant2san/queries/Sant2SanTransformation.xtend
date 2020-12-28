package sant2san.queries

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.emf.ecore.resource.Resource
import org.modelspartiti.formalisms.san.sant.SANTPackage
import org.modelspartiti.formalisms.san.san.SANPackage
import org.modelspartiti.formalisms.san.sant.SANT
import org.modelspartiti.formalisms.san.san.SAN

class Sant2SanTransformation {
	/** VIATRA Query Pattern group **/
	val extension Sant2SanQueries sant2san = Sant2SanQueries.instance
	
	/** EMF metamodels **/
	val extension SANTPackage santPackage = SANTPackage.eINSTANCE
	val extension SANPackage sanPackage = SANPackage.eINSTANCE
	
    extension IModelManipulations manipulation

    protected ViatraQueryEngine engine
    protected Resource resource

	val SANT sant
	val SAN san
	
    new(SANT sant, SAN san, ViatraQueryEngine engine) {
        this.sant = sant
        this.san = san
	    resource = sant.eResource
        val scope = new EMFScope(resource)
        this.engine = ViatraQueryEngine.on(scope)
        this.manipulation = new SimpleModelManipulations(engine)
        //execute
    }

    public def execute() {
    	
//    	san.name = sant.name
		san.set(SAN_Name,sant.name)
		
		val places = engine.getMatcher(placeInstance).allMatches
		
		
		for (match : places) {
			val place = match.place
//			san.places.add(place)
			san.createChild(SAN_Places, sanPackage.place) => [
				set(namedElement_Name,place.name)
				set(place_Type, place.type)
				set(place_Marking, place.marking)
			]
		}
		
		val activities = engine.getMatcher(instantActivityInstance).allMatches

		for (match : activities) {
			val activity = match.activity
			
			san.createChild(SAN_Activities, sanPackage.instantaneousActivity) => [
				set(namedElement_Name,activity.name)
				it.createChild(activity_Cases, sanPackage.^case) => [
					set(case_ID,match.cases.ID)
					set(case_P,match.cases.p)
				]
			]
		}
		
		val inputArcs = engine.getMatcher(inputArcInstance).allMatches

		for (match : inputArcs) {
			val source = san.places.findFirst[it.name == match.arc.source.name ] 
			val target = san.activities.findFirst[it.name == match.arc.target.name ]
			
			san.createChild(SAN_Arcs, sanPackage.inputArc) => [
				set(sanPackage.inputArc_Source,source)
				set(sanPackage.inputArc_Target,target)
			]
		}
		
		val outputArcs = engine.getMatcher(outputArcInstance).allMatches

		for (match : outputArcs) {
			val source = san.activities.findFirst[it.name == match.arc.source.name].cases.get(0)
			val target = san.places.findFirst[it.name == match.arc.target.name ] 
			
			san.createChild(SAN_Arcs, sanPackage.outputArc) => [
				set(sanPackage.outputArc_Source,source)
				set(sanPackage.outputArc_Target,target)
			]
		}
		
    }

}
