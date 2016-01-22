package com.test;

public class TestOverride {

	public static void tt(IFace i) {
		System.out.println("this is iface");
	}
	
	public static void tt(Object o) {
		System.out.println("this is a obj");
	}
	
	public static void tt(FaceImpl i) {
		System.out.println("this is a impl");
	}
	
	public static void main(String[] args) {
		FaceImpl i = new FaceImpl();
		Object o = i;
		IFace x = i;
		tt(i);
		tt(o);
		tt(x);
	}
}
