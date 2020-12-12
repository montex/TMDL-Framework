package org.modelspartiti.formalisms.san.mobius.handler;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class OutputFilter extends FileFilter{

	@Override
	public boolean accept(File f) {
	    if (f.isDirectory()) {
	        return true;
	    }
	    return false;
	}

	@Override
	public String getDescription() {
		return "Solo file .san";
	}
	
	

}
