package com.happu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
	
	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("C:\\Users\\alka0\\OneDrive\\Documents\\abc.txt", true))
		{
			//fw.write("hello Bikash you are able to write into file.best of luck for your future Java Learning..");
			fw.write("\r\n");
			fw.write("yes,u hv done it..");
			
		}catch(IOException io) {
		
			io.printStackTrace();
		}
		
	}

}
