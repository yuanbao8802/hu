package com.test;

import java.math.BigDecimal;

public class TestBigDecimal {

	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal(0);
		
		b1 = b1.add(new BigDecimal(100));
		
		System.out.println(b1);
	}
}
