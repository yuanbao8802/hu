package com.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		System.out.println(map);
		System.out.println( "--------------------------------" );
		String [] keys = map.keySet().toArray(new String[0]);
		String val = map.get(keys[0]);
		System.out.println("val : " + val);
		
		map.remove(keys[0]);
		
		System.out.println(map);
		System.out.println( "--------------------------------" );
		keys = map.keySet().toArray(new String[0]);
		val = map.get(keys[0]);
		System.out.println("val : " + val);
		
		map.remove(keys[0]);
		
		System.out.println(map);
	}
}
