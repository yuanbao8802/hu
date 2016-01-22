package com.test;

import java.io.File;
import java.io.FileFilter;

import org.apache.commons.io.FileUtils;

public class TestRename {

	public static void main(String[] args) throws Exception{
		String dirPath = "E:/software/kuibo";
		dirPath = "计算机/MI PAD/SD 卡/movies";
		File dir = new File(dirPath);
		if (dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles(new FileFilter() {
				public boolean accept(File file) {
					return file.isFile();
				}
			});
			
			writeNameToFile(files);
			
//			rename(files);
		}
	}

	private static void rename(File[] files) {
		for (int i = 0; i < files.length ; i++) {
			File file = files[i];
			
		}
	}

	private static void writeNameToFile(File[] files) throws Exception {
		File txt = new File("E://names.txt");
		for (int i = 0; i < files.length ; i++) {
			File file = files[i];
			String name = file.getName();
			String tt = name + " ---> " + i + "\n";
//			FileUtils.writeStringToFile(txt, tt, true);
			System.out.print(tt);
		}
		System.out.println("写入完成");
	}
}
