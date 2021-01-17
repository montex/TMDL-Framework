package sant2san.queries;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.modelspartiti.formalisms.san.san.SAN;
import org.modelspartiti.formalisms.san.san.SANFactory;
import org.modelspartiti.formalisms.san.sant.SANT;
import org.modelspartiti.formalisms.san.sant.SANTPackage;
import org.modelspartiti.infrastructure.tmdl.core.AssignmentArray;
import org.modelspartiti.infrastructure.tmdl.core.CorePackage;

import paramlist.ParamlistPackage;



public class Sant2SanMain {

	public static void main(String[] args) throws ExecutionException {
		
		ViatraQueryEngine engine = null;
		Sant2SanTransformation transformation = null;
		SANT sant = null;
		SAN san = null;
		EList<AssignmentArray> params = new BasicEList<AssignmentArray>();

		SANTPackage.eINSTANCE.getName();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("sant", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

		ResourceSet santResSet = new ResourceSetImpl();
		URI uri = URI.createFileURI("/ViatraSANT2SAN/src/sant2san/user.sant");
		santResSet.getResource(uri, true);
		
		san = SANFactory.eINSTANCE.createSAN();

		loadParamsFromXMI(URI.createFileURI("/ViatraSANT2SAN/src/sant2san/params/ParamList.xmi"), params);
		Resource sanRes = createXMI(URI.createFileURI("/ViatraSANT2SAN/src/san_file.xmi"));

		if (engine == null) {
			try {
				engine = ViatraQueryEngine.on(new EMFScope(santResSet));
				transformation = new Sant2SanTransformation(san, params, engine);

			} catch (ViatraQueryException e) {
				throw new ExecutionException(e.getMessage(), e);
			}
		}
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

	}

	private static Resource createXMI(URI uri) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("key", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		return resSet.createResource(uri);
	}

	private static void loadParamsFromXMI(URI uri, EList<AssignmentArray> params) {
		ParamlistPackage.eINSTANCE.eClass();
		SANTPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		// TODO il model instance della EList<Assignment> vuole href relativo ma senza puntini
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource paramsRes = resSet.createResource(uri);
		try {
			paramsRes.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resSet);

//        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//        Map<String, Object> m = reg.getExtensionToFactoryMap();
//        m.put("key", new XMIResourceFactoryImpl());
//        ResourceSet resSet = new ResourceSetImpl();
//        Resource paramsRes = resSet.getResource(uri, true);
//        
//        try {
//        	paramsRes.load(null);
//		} catch (IOException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//        EcoreUtil.resolveAll(resSet);

		for (Iterator it = paramsRes.getContents().get(0).eAllContents(); it.hasNext();) {
			Object assign = it.next();
			if (assign instanceof AssignmentArray) {
				String name = ((AssignmentArray) assign).getParameter().getName();
				System.out.println(name);
				params.add((AssignmentArray) assign);
			}
		}

	}

}
