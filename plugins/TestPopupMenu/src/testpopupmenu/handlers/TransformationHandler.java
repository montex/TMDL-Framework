package testpopupmenu.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import com.egl.EglStandaloneExample;

import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class TransformationHandler extends AbstractHandler{
	
	private String xmiSource, airdSource, outputSource;
	
	@Override	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Take the name of the clicked model
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		// set selection service
		ISelectionService service = window.getSelectionService();
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
	 
		//check if it is an IFile
		if (structured.getFirstElement() instanceof IFile) {
			// get the selected file
			IFile file = (IFile) structured.getFirstElement();
			// get the path
			IPath path = file.getLocation();
			setXmiSource(path.toPortableString());
		}
		
    	// Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Esportazione modello in formato Mobius");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
         
        // Define the panel to hold the components  
        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();
        panel.setSize(500, 500);
        panel.setLayout(layout);
         
        JLabel lblUriModel = new JLabel("URI del file contenente il modello (file .xmi/.msan)");
        JTextField textUriModel = new JTextField("", 30);
        textUriModel.setText(getXmiSource());
        JButton buttonUriModel = new JButton("Browse..."); 
        panel.add(lblUriModel);
        panel.add(textUriModel);
        panel.add(buttonUriModel);
        
        JLabel lblAird = new JLabel("URI del file contenente le coordinate (file .aird...)");
        JTextField textAird = new JTextField("", 30);
        JButton buttonAird = new JButton("Browse..."); 
        panel.add(lblAird);
        panel.add(textAird);
        panel.add(buttonAird);
        
        JLabel lblOutput = new JLabel("URI del file di output");
        JTextField textOutput = new JTextField("", 30);
        JButton buttonOutput = new JButton("Browse..."); 
        panel.add(lblOutput);
        panel.add(textOutput);
        panel.add(buttonOutput);
        
        JButton buttonRun = new JButton("Run"); 
        panel.add(buttonRun);
        
        // Put constraint on components
        addConstraints(layout, lblUriModel, textUriModel, buttonUriModel, panel);
        addConstraints(layout, lblAird, textAird, buttonAird, lblUriModel);
        addConstraints(layout, lblOutput, textOutput, buttonOutput, lblAird);
        layout.putConstraint(SpringLayout.WEST, buttonRun, 670, SpringLayout.WEST, buttonRun.getParent());
        layout.putConstraint(SpringLayout.NORTH, buttonRun, 80, SpringLayout.NORTH, buttonOutput);
        
        buttonUriModel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setXmiSource(myButtonClicked(e, new ModelFilter()));
                textUriModel.setText(getXmiSource());
            }
        });
        
        buttonAird.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAirdSource(myButtonClicked(e, new AirdFilter()));
                textAird.setText(getAirdSource());
            }
        });
        
        buttonOutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	setOutputSource(myButtonClicked(e, new OutputFilter()));
            	textOutput.setText(getOutputSource());
            }
        });
        
        buttonRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                	setXmiSource(textUriModel.getText());
                	setAirdSource(textAird.getText());
                	setOutputSource(textOutput.getText());
					myButtonRunClicked(e, getXmiSource(), getAirdSource(), getOutputSource());
					frame.dispose();
                } catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Inserire tutti i file richiesti per l'esportazione.");
				}
            }
        });
       
        
        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.setSize(800, 300);  
        frame.setLocationRelativeTo(null);   
        frame.setVisible(true); 

        return null;
	}
	
	public static void addConstraints(
			SpringLayout layout, 
			JLabel label, 
			JTextField text, 
			JButton button, 
			JComponent upperComp) {
        layout.putConstraint(SpringLayout.WEST, label, 10, SpringLayout.WEST, label.getParent());
        layout.putConstraint(SpringLayout.NORTH, label, 50, SpringLayout.NORTH, upperComp);
        layout.putConstraint(SpringLayout.WEST, text, 300, SpringLayout.WEST, text.getParent());
        layout.putConstraint(SpringLayout.NORTH, text, 50, SpringLayout.NORTH, upperComp);
        layout.putConstraint(SpringLayout.WEST, button, 650, SpringLayout.WEST, button.getParent());
        layout.putConstraint(SpringLayout.NORTH, button, 45, SpringLayout.NORTH, upperComp);
	}
	
	private static String myButtonClicked(ActionEvent e, FileFilter f) {
		String result = "";
	    JFileChooser fileChooser = new JFileChooser();
	    fileChooser.setAcceptAllFileFilterUsed(false);
	    fileChooser.addChoosableFileFilter(f);
	    int returnValue = fileChooser.showOpenDialog(null);
	    if (returnValue == JFileChooser.APPROVE_OPTION) 
	    {
		    File selectedFile = fileChooser.getSelectedFile();
		    result = selectedFile.getAbsolutePath();
	    }
	    return result;
	}
	
	private static void myButtonRunClicked(
		ActionEvent e,
		String xmiSource,
		String airdSource,
		String outputSource) throws Exception {	
		if (xmiSource.isEmpty() || outputSource.isEmpty()) {
			throw new Exception();
		}
		else {
			try {
				EglStandaloneExample egl = new EglStandaloneExample();
	        	egl.Main(xmiSource, airdSource, outputSource);
	        }
	        catch(Exception e1) {
	        	 e1.printStackTrace();
	        }	
		}
	}

	public String getXmiSource() {
		return xmiSource;
	}

	public void setXmiSource(String xmiSource) {
		this.xmiSource = xmiSource;
	}
	
	public String getAirdSource() {
		return airdSource;
	}

	public void setAirdSource(String airdSource) {
		this.airdSource = airdSource;
	}
	
	public String getOutputSource() {
		return outputSource;
	}

	public void setOutputSource(String outputSource) {
		this.outputSource = outputSource;
	}
    
}