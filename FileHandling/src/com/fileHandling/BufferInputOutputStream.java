package com.fileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputOutputStream {
	
	public void writeData(File f) {

		try {
			if (!f.exists()) {
				f.createNewFile();
			}
			String data="Welcome To Java Learning";
			FileOutputStream fout= new FileOutputStream(f);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			byte[] arr=data.getBytes();
			
			bout.write(arr);
			System.out.println("Data Added.");
			bout.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void readData(File f) {
		
		try {
			if(f.exists()) {
				BufferedInputStream bin=new BufferedInputStream(new FileInputStream(f));
				
				int i=0;
				
				while((i=bin.read())!=-1) {
					System.out.print((char)i);
				}
				bin.close();
			}
			else {
				System.out.println("File Doesn't Exist.");
			}
		}
		catch(Exception e) {
			
		}
	}


	

	public static void main(String[] args) {
		
		BufferInputOutputStream b1= new BufferInputOutputStream();
		
		File f=new File("D:\\Aniket TQ\\MyFile\\bData.txt");
		b1.writeData(f);
		b1.readData(f);
		

	}

}
