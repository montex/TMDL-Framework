package sant2san.queries;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.modelspartiti.formalisms.san.san.SAN;
import org.modelspartiti.formalisms.san.san.SANFactory;
import org.modelspartiti.formalisms.san.sant.SANT;
import org.modelspartiti.infrastructure.tmdl.core.AssignmentArray;

public class Sant2San {

	private Sant2SanTransformation transformation;
	private SAN san;
	private Resource sanRes;

	public Sant2San(URI uri) {
		this.san = SANFactory.eINSTANCE.createSAN();
		this.sanRes = createXMI(uri);
	}

	public void concretize(SANT sant, EList<AssignmentArray> params) throws ExecutionException {
		ResourceSet santResSet = sant.eResource().getResourceSet();
		System.out.println("sant engine: " + santResSet.toString());
		transformation = new Sant2SanTransformation(sant, san, params);
		transformation.execute();
		saveSanToFile();
	}

	private void saveSanToFile() {
		sanRes.getContents().add(san);
		try {
			sanRes.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(sanRes.getURI());
	}

	private Resource createXMI(URI uri) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("key", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		return resSet.createResource(uri);
	}

}
