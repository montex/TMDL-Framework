package sant2sanplugin.handlers;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.modelspartiti.formalisms.san.san.SAN;
import org.modelspartiti.formalisms.san.san.SANFactory;
import org.modelspartiti.formalisms.san.sant.SANT;
import org.modelspartiti.infrastructure.tmdl.core.AssignmentArray;
import paramlist.ParamlistPackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import sant2san.queries.Sant2SanTransformation;

import org.eclipse.jface.viewers.IStructuredSelection;

public class Sant2SanTransformationHandler extends AbstractHandler implements IHandler {

	ViatraQueryEngine engine;
	Sant2SanTransformation transformation;
	SANT sant;
	SAN san;
	EList<AssignmentArray> params = new BasicEList<AssignmentArray>();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("plugin avviato");

		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);

		sant = (SANT) selection.getFirstElement();
		
		san = SANFactory.eINSTANCE.createSAN();

		loadParamsFromXMI(URI.createPlatformResourceURI("/org.modelspartiti.formalisms.san.concretize/src/sant2san/params/ParamList.xmi", true), params);
		Resource sanRes = createXMI(URI.createPlatformResourceURI("/org.modelspartiti.formalisms.san.concretize/src/san_file.xmi", true));

		// if (engine == null){
//		ResourceSet santResSet = sant.eResource().getResourceSet();
//		System.out.println("sant engine: " + santResSet.toString());
		try {
			//engine = ViatraQueryEngine.on(new EMFScope(santResSet));
			transformation = new Sant2SanTransformation(sant, san, params);

		} catch (ViatraQueryException e) {
			throw new ExecutionException(e.getMessage(), e);
		}
		// }
		transformation.execute();

		// salvataggio file xmi dopo aver effettuato la trasformazione
		sanRes.getContents().add(san);
		try {
			sanRes.save(Collections.EMPTY_MAP);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(sanRes.getURI());
		return null;
	}

	private Resource createXMI(URI uri) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("key", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		return resSet.createResource(uri);
	}

	private void loadParamsFromXMI(URI uri, EList<AssignmentArray> params) {
		ParamlistPackage.eINSTANCE.eClass();
		
		// TODO il model instance della EList<Assignment> vuole href relativo ma senza
		// puntini
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource paramsRes = resSet.getResource(uri,true);

		EcoreUtil.resolveAll(resSet);

		// TODO fare semplicementa la add, togliere codice di debug
		for (Iterator it = paramsRes.getContents().get(0).eAllContents(); it.hasNext();) {
			System.out.println("---");
			Object assign = it.next();
			if (assign instanceof AssignmentArray) {
				String name = ((AssignmentArray) assign).getParameter().getName();
				System.out.println("name: " + name);
				params.add((AssignmentArray) assign);
			}
		}

	}
	
	

}
