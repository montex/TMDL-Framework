/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.modelspartiti.formalisms.san.mobius.egl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class EglStandalone extends EpsilonStandalone {
	
	private String xmiSource, airdSource, outputSource, modelName;
	
	public void Main(String xmi, String aird, String output, String model) throws Exception {
		xmiSource = xmi;
		airdSource = aird;
		outputSource = output;
		modelName = model;
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
		String outputFile = outputSource + "\\Atomic\\"+modelName+"\\"+modelName+".san";
		File dir = new File(outputSource + "\\Atomic\\"+modelName);
		File san = new File(outputFile);
		if (!dir.exists())
			dir.mkdir();
		if (!san.exists()) {
			try {
				san.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		try {	
			modifyMobiusPrj(outputSource, modelName);
			String output = result.toString().trim();
			output = output.replace("<string id=\"ModelName\"></string>", 
					"<string id=\"ModelName\">"+modelName+"</string>");
			//System.out.println(output);
			PrintWriter  myWriter = new PrintWriter(outputFile);
			myWriter.write(output);
		    myWriter.close();
		    JOptionPane.showMessageDialog(null, "Esportazione andata a buon fine!");
		} catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}


    private static void modifyMobiusPrj(String projectPath, String modelName) {
    	Document dom = null;
        Element n, v = null;
        String projectName = projectPath.substring(projectPath.lastIndexOf("\\")+1);
        String projectFile = projectPath+"\\"+projectName+".prj";
        // instance of a DocumentBuilderFactory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            // use factory to get an instance of document builder
            DocumentBuilder db = dbf.newDocumentBuilder();
            // create instance of DOM
            dom = db.parse(projectFile);
            
            Element doc = dom.getDocumentElement();
                       
            // create the new entry
            n = dom.createElement("atomic");
            n.setAttribute("key", modelName);
            v = dom.createElement("value");
            v.setAttribute("name", modelName);
            v.setAttribute("type", "SAN Model");
            n.appendChild(v);
            
            doc.appendChild(n);
            try {
                Transformer tr = TransformerFactory.newInstance().newTransformer();
                tr.setOutputProperty(OutputKeys.INDENT, "yes");
                tr.setOutputProperty(OutputKeys.METHOD, "xml");
                tr.setOutputProperty(OutputKeys.ENCODING, "ASCII");
                tr.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

                // send DOM to file
                tr.transform(new DOMSource(dom), 
                                     new StreamResult(new FileOutputStream(projectFile)));

            } catch (TransformerException te) {
                System.out.println(te.getMessage());
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        } catch (ParserConfigurationException | SAXException | IOException pce) {
            System.out.println("UsersXML: Error trying to instantiate DocumentBuilder " + pce);
        }   
    }
}