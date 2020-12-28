package sant2sanplugin.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.modelspartiti.formalisms.san.san.SAN;
import org.modelspartiti.formalisms.san.san.SANFactory;
import org.modelspartiti.formalisms.san.san.SANPackage;
import org.modelspartiti.formalisms.san.san.util.SANResourceFactoryImpl;
import org.modelspartiti.formalisms.san.sant.SANT;
import org.modelspartiti.infrastructure.tmdl.core.Assignment;
import org.modelspartiti.infrastructure.tmdl.core.AssignmentArray;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import sant2san.queries.Sant2SanTransformation;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

public class Sant2SanTransformationHandler extends AbstractHandler implements IHandler {

    ViatraQueryEngine engine;
    Sant2SanTransformation transformation;
    SANT sant;
    SAN san;
    EList<Assignment> params;
    		
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	System.out.println("plugin avviato");

        IStructuredSelection selection =
            (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
        
        sant = (SANT) selection.getFirstElement();
        
        san = SANFactory.eINSTANCE.createSAN();

        //creazione file xmi
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("key", new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI("/ViatraSANT2SAN/src/san_file.xmi"));
        
        if (engine == null){
            try {
                engine = ViatraQueryEngine.on(
                            new EMFScope(sant.eResource().getResourceSet()));
                transformation = new Sant2SanTransformation(sant,san,engine);
                 
            } catch (ViatraQueryException e) {
                throw new ExecutionException(e.getMessage(), e);
            }
        }
        transformation.execute();
        
        //salvataggio file xmi dopo aver effettuato la trasformazione
        resource.getContents().add(san);
        try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println(resource.getURI());
        return null;
    }
    
}



