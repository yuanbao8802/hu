package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.HasChildFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.ParserException;

public class TestSpringsplit {

	private static final String index = "http://dn.sdo.com/web10/home/index.asp";
	private static final String pre = "http://dn.sdo.com/web10/";
	
	public static void main(String[] args) throws Exception{
//		URL url = new URL(pre + "news/newsContent.asp?ID=248775&CategoryID=103");
//		IOUtils.copy(new InputStreamReader(in,"gb2312"), System.out);
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sdf.parse("2015-03-06");
		Date end = sdf.parse("2016-03-06");
		long l = end.getTime() - start.getTime();
		System.out.println(l/1000/60/60/24);*/
		
//		System.out.println("63ee451939ed580ef3c4b6f0109d1fd0".length());
		
		
		index();
		
//		target("news/newsContent.asp?ID=250372&CategoryID=102");
	}

	public static void index() throws MalformedURLException, IOException,
			ParserException {
		URL url = new URL(index);	
		InputStream in = url.openStream();
		String source = IOUtils.toString(in, "gb2312");
		Parser parser = new Parser(source);
		NodeFilter liTagNameFilter = new TagNameFilter("li");
		HasChildFilter hasChildFilter = new HasChildFilter(new TagNameFilter("em"));
		NodeList nodes = parser.extractAllNodesThatMatch(new AndFilter(liTagNameFilter, hasChildFilter));
		for (int i = 0 ; i < nodes.size(); i++) {
			Node node = nodes.elementAt(i);
			System.out.println(node.toHtml());
		}
	}
	
	public static void target(String urlStr) throws Exception{
		URL url = new URL(pre + urlStr);
		InputStream in = url.openStream();
		String source = IOUtils.toString(in, "gb2312");
		Parser parser = new Parser(source);
		NodeFilter liTagNameFilter = new TagNameFilter("div");
		NodeList nodes = parser.extractAllNodesThatMatch(liTagNameFilter);
		for (int i = 0 ; i < nodes.size(); i++) {
			Node node = nodes.elementAt(i);
			String str = node.toPlainTextString();
			if ("".equals(str.trim())) {
				continue;
			}
			System.out.println(str.trim().replace("\\s", ""));
		}
//		System.out.println(source);
	}
}
