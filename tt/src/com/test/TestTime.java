package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TestTime {

	public static void main(String[] args) {
		System.out.print("time : ");
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("rs : " + sdf.format(new Date(Long.parseLong(time)))); 
	}
}
