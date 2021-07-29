package sant2san.queries;

import java.io.File;
import java.util.Iterator;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.modelspartiti.formalisms.san.sant.SANT;
import org.modelspartiti.formalisms.san.sant.SANTPackage;
import org.modelspartiti.infrastructure.tmdl.core.AssignmentArray;
import paramlist.ParamlistPackage;

public class Sant2SanMain {

	public static void main(String[] args) throws ExecutionException {

		SANT sant;
		// inizializzazione sant
		SANTPackage.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource santRes = resSet.getResource(URI.createFileURI("src/user.sant"),true);
		sant = (SANT) santRes.getContents().get(0);

		EList<AssignmentArray> params = new BasicEList<AssignmentArray>();
		
		// inizializzazione params
		loadParamsFromXMI(URI.createFileURI(new File("src/sant2san/params/ParamList_batch.xmi").getAbsolutePath()), params);

		Sant2San trasformation = new Sant2San(URI.createFileURI("src/san_file.xmi"));
		trasformation.concretize(sant, params);

	}

	private static void loadParamsFromXMI(URI uri, EList<AssignmentArray> params) {
		ParamlistPackage.eINSTANCE.eClass();
		
		System.out.println("file--"+uri.toFileString());
		// TODO il model instance della EList<Assignment> vuole href relativo ma senza
		// puntini
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource paramsRes = resSet.getResource(uri,true);
		EcoreUtil.resolveAll(resSet);
		System.out.println(resSet.toString());


		// TODO fare semplicementa la add, togliere codice di debug
		for (Iterator it = paramsRes.getContents().get(0).eAllContents(); it.hasNext();) {
			System.out.println("---");
			Object assign = it.next();
			if (assign instanceof AssignmentArray) {
				
				String name = ((AssignmentArray) assign).getParameter().getName();
				System.out.println("name: " + name + " ,value: " + ((AssignmentArray) assign).getValues().toString());
				params.add((AssignmentArray) assign);
			}
		}

	}

}
