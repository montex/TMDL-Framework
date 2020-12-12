package org.modelspartiti.formalisms.san.mobius.handler;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class AirdFilter extends FileFilter{

	@Override
	public boolean accept(File f) {
	    String extension = ExtensionUtils.getExtension(f);
	    if (extension != null) {
	        if (extension.equals(ExtensionUtils.aird)) {
	                return true;
	        } else {
	            return false;
	        }
	    }

	    return false;
	}

	@Override
	public String getDescription() {
		return "Solo file .aird";
	}
	
	

}
