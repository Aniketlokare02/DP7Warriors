package com.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

	public void writeData(File f) {

		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			String data="I study in ThinkQuotient";
			FileOutputStream fout= new FileOutputStream(f);
			byte[] arr=data.getBytes();
			
			fout.write(arr);
			System.out.println("Data Added.");
			fout.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void readData(File f) {
		
		try {
			if(f.exists()) {
				FileInputStream fin=new FileInputStream(f);
				
				int i=0;
				
				while((i=fin.read())!=-1) {
					System.out.print((char)i);
				}
				fin.close();
			}
			else {
				System.out.println("File Doesn't Exist.");
			}
		}
		catch(Exception e) {
			
		}
	}
	public static void main(String[] args) {
		
		FileInputOutputStream f1=new FileInputOutputStream();
		
		File f=new File("D:\\Aniket TQ\\MyFile\\first.txt");
		f1.writeData(f);
		f1.readData(f);

	}

}
