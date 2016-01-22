package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws Exception {
//		long t = 1440670172055l;
//		Date date = new Date(t);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = sdf.parse("2015-09-19");
		// 最大可选日期
		Date min = new Date(date.getTime() - 18l * 1000 * 60 * 60 * 24 * 365);
		// 最小可选日期
		Date max = new Date(date.getTime() - 60l * 1000 * 60 * 60 * 24 * 365) ;
		
		System.out.println(sdf.format(min));
		System.out.println(sdf.format(max));
	}
}
