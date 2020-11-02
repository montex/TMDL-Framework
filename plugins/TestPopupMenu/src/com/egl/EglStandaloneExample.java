/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package com.egl;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;


public class EglStandaloneExample extends EpsilonStandaloneExample {
	
	private String xmiSource, airdSource, outputSource;
	
	public void Main(String xmi, String aird, String output) throws Exception {
		xmiSource = xmi;
		airdSource = aird;
		outputSource = output;
		execute();
	}
	
	@Override
	public IEolModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		PlainXmlModel XMI = new PlainXmlModel();
		XMI.setName("XMI");
		XMI.setFile(new File(xmiSource));
		XMI.load();
		models.add(XMI);
		if (!airdSource.isEmpty()) {
			PlainXmlModel AIRD = new PlainXmlModel();
			AIRD.setName("AIRD");
			AIRD.setFile(new File(airdSource));
			AIRD.load();
			models.add(AIRD);			
		}
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "Main.egl";
	}

	@Override
	public void postProcess() {
		try {	
			String output = result.toString().trim();
			System.out.println(output);
			PrintWriter  myWriter = new PrintWriter(outputSource);
			myWriter.write(output);
		    myWriter.close();
		    JOptionPane.showMessageDialog(null, "Esportazione andata a buon fine!");
		} catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	

}