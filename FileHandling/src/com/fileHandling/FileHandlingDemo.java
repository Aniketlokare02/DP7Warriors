package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\Aniket TQ\\MyFile\\first.txt");
		f1.createNewFile();
		
		if(f1.exists()) {
			if(f1.isFile()) {
				System.out.println("Path:"+f1.getAbsolutePath());
				System.out.println("Length:"+f1.length());
				System.out.println("File Name:"+f1.getName());
				System.out.println("Write:"+f1.canWrite());
			}
			else if(f1.isDirectory()) {
				System.out.println("It is Directory.");
			}
			else {
				System.out.println("Unknown.");
			}
		}
		else {
			System.out.println("Nothing");
		}

	}

}
