package com.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;


public class TestFileAndBuff {

	public static File buff2File(byte[] buff) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(buff);
		
		return null;
	}
}
