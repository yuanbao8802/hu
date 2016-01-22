package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateformat {

	public static void main(String[] args) throws Exception {
//		String str = "02 SEP 2015";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//		Date date = sdf.parse(str);
		SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(ss.format(date));
		Date date = ss.parse("2015-09-02");
		System.out.println(sdf.format(date));
	}
}
