package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	
	public void copyContent(File s, File d) {
		
		try {
			if(s.exists()) {
				d.createNewFile();
				FileInputStream fin=new FileInputStream(s);
				FileOutputStream fout=new FileOutputStream(d);
				
				int i=0;
				while((i=fin.read())!=-1) {
					fout.write(i);
				}
				System.out.println("File Copied.");
				fin.close();
				fout.close();
			}
			else {
				System.out.println("Source File Doesn'y Exists.");
			}
		}
		catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		
		CopyFile c=new CopyFile();
		
		File sf=new File("D:\\Aniket TQ\\MyFile\\bData.txt");
		File df=new File("D:\\Aniket TQ\\MyFile\\copy.txt");
		
		c.copyContent(sf, df);

	}

}
