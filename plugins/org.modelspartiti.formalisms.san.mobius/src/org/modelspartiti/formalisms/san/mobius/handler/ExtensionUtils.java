package org.modelspartiti.formalisms.san.mobius.handler;
import java.io.File;

public class ExtensionUtils {

	    public final static String xmi = "xmi";
	    public final static String msan = "msan";
	    public final static String aird = "aird";
	    public final static String san = "san";

	    /*
	     * Get the extension of a file.
	     */  
	    public static String getExtension(File f) {
	        String ext = null;
	        String s = f.getName();
	        int i = s.lastIndexOf('.');

	        if (i > 0 &&  i < s.length() - 1) {
	            ext = s.substring(i+1).toLowerCase();
	        }
	        return ext;
	    }
}