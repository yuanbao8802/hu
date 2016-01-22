package com.test;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.IOUtils;

public class TestFileSize {

	public static void main(String[] args) throws Exception {
		/*String s1 = IOUtils.toString(TestFileSize.class.getClassLoader().getResourceAsStream("AREA_NCI-1.json"), "UTF-8");
		String s2 = IOUtils.toString(TestFileSize.class.getClassLoader().getResourceAsStream("NCI_area-2.json"), "UTF-8");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("s1 size : " + s1.length());
		System.out.println("s2 size : " + s2.length());
		
		System.out.println("s1 count : " + count(s1));
		System.out.println("s2 count : " + count(s2));
		
		System.out.println("rs : " + s1.equals(s2));*/
		
		File f1 = new File("1.txt");
		File f2 = new File("1.txt");
		System.out.println(f1.equals(f2));
	}
	
	public static Set<Integer> count(String s) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < s.length() ; i++) {
			set.add((int)s.charAt(i));
		}
		return set;
	}
}
