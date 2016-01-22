package com.test;

import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

public class TestPing {

	public static void main(String[] args) throws Exception{
		String ss = "http://192.168.1.20/b2c/product/13.html";
		
		for (int i = 0 ; i < 100 ; i++) {
			URL url = new URL(ss);
			URLConnection conn = url.openConnection();
			IOUtils.copy(conn.getInputStream(), System.out);
			Thread.sleep(1000);
		}
	}
}
