package com.fileHandling;

import java.io.File;

public class CharacterStream {
	
	public void writeData(File f) {
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
		}
		catch(Exception e) {
			
		}
		
		
	}

}
