package com.test;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class TestXsl {

	public static void main(String[] args) throws Exception{
		TransformerFactory factory = TransformerFactory.newInstance();
		Source source = new StreamSource(TestXsl.class.getClassLoader().getResourceAsStream("1.xsl"));
		Transformer transfor = factory.newTransformer(source );
		Result outputTarget = new StreamResult("1.txt");
		Source xmlSource = new StreamSource(TestXsl.class.getClassLoader().getResourceAsStream("tt.xml"));
		transfor.transform(xmlSource, outputTarget);
		
		System.out.println(outputTarget.toString());
		
	}
}
