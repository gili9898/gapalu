package com.happu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class FileOperation {
	
	public static void main(String[] args) {
		
		
		Path p = Paths.get("C:\\Users\\alka0\\OneDrive\\Documents\\abc.txt");
		
		try {
			List<String> list = Files.readAllLines(p);
			
		   list.stream().map(s -> s.split("\\s")).flatMap(Arrays::stream).distinct().forEach(s -> System.out.println(s));			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
