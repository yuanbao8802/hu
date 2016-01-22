package com.test;

import org.apache.commons.codec.digest.DigestUtils;

public class TestMd5 {

	public static void main(String[] args) throws Exception{
		String m1 = DigestUtils.md5Hex(TestMd5.class.getClassLoader().getResourceAsStream("1111.jpg"));
		String m2 = DigestUtils.md5Hex(TestMd5.class.getClassLoader().getResourceAsStream("2222.jpg"));
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.equals(m2));
	}
}
