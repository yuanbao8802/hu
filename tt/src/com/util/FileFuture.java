package com.util;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.concurrent.Callable;

import org.apache.commons.io.IOUtils;

public class FileFuture implements Callable<String>{
	
	private String dir;
	private String fileName;
	private URL url;

	public String call() throws Exception {
		File dirFile = new File(dir);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		File file = new File(dirFile, fileName);
		
		IOUtils.copy(url.openStream(), new FileOutputStream(file));
		
		return file.getAbsolutePath();
	}

}
