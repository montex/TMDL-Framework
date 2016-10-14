package tmdl;

import java.io.File;

import tmdl.core.ConcreteModel;

public abstract class ModelManager {

	abstract public ConcreteModel importModel(File f);
	
	public void exportModel(File f) {
		exportModel(f, null);
	}
	
	abstract public void exportModel(File f, ExportFormat format);

}
