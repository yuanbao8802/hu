package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KaoQin {

	static SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
	
	static String [] exceptionDate = {"2015-10-10"};
	
	public static void main(String[] args) throws Exception {
		List<String> exception = Arrays.asList(exceptionDate);
		
		BufferedReader in = new BufferedReader(new InputStreamReader
				(KaoQin.class.getClassLoader().getResourceAsStream("hxw.txt")));
		String tt = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
//		int count = 0;
		Set<String> set = new HashSet<String>();
		while ( (tt = in.readLine()) != null) {
			if ("".equals(tt.trim())) {
				continue;
			}
//			System.out.println(tt + " ---> " + ff.format(sdf.parse(tt)));
			Date date = sdf.parse(tt);
			cal.setTime(date);
			int i = cal.get(Calendar.DAY_OF_WEEK);
			if (i == Calendar.SUNDAY || i == Calendar.SATURDAY) {
				String formatDate = ff.format(date);
				if (exception.contains(formatDate)) {
					continue;
				}
				set.add(formatDate) ;
//				System.out.println(tt + " ---> " + ff.format(date));
			}
		}
		
		System.out.println("¼Ó°àÌìÊý: " + set.size());
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		for (String ss : list) {
			System.out.println(ss);
		}
	}
}
