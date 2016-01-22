package com.test;

import java.text.MessageFormat;


public class TestMessageFormat {

	public static void main(String[] args) {
		String tt = "hello, {0}, {0}, {1}, {2}";
		String format = MessageFormat.format(tt, "ÎÔ²Û","ÄáÂê", "¼Ó°à");
		System.out.println(format);
	}
}
