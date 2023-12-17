package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferReaderLogical {
	
	public static void storeData(File f) {
		
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw=new FileWriter(f, true);
			
			System.out.println("Enter Stop Finish..");
			
			String data="";
			while(true) {
				data=br.readLine();
				if(data.equalsIgnoreCase("stop")) {
					break;
				}
				fw.write(data);
				fw.write("\n");
			}
			System.out.println("-------------------");
			br.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
	
		BufferReaderLogical b=new BufferReaderLogical();
		File f=new File("D:\\Aniket TQ\\MyFile\\logical.txt");
		b.storeData(f);

	}

}
