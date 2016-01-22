package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class TestURL {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String ss = URLEncoder.encode("Ôª±¦", "UTF-8");
		
		System.out.println(ss);
	}
}
