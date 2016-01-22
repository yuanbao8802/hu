package com.test.rmi;

import java.io.InputStreamReader;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class XiaomiSoap {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://item.mi.com/1144600003.html");
		IOUtils.copy(new InputStreamReader(url.openStream(), "UTF-8"), System.out);
	}
}
