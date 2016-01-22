package com.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.commons.io.IOUtils;

public class TestFile {

	private static final String path = "d:/nuoai/o2o/tmp/";
	
	public static void main(String[] args) throws Exception {
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File tager = new File(dir, "2.txt") ;
		String str = "≤‚ ‘";
		FileOutputStream out = new FileOutputStream(tager);
		IOUtils.write(str.getBytes(), out);
		out.close();
		
	}
}
