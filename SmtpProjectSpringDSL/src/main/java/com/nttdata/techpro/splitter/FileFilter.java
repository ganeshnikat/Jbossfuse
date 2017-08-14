package com.nttdata.techpro.splitter;

import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;

public class FileFilter implements GenericFileFilter {

	@Override
	public boolean accept(GenericFile file) {
		return file.getFileName().endsWith(".xml");
	}

}
