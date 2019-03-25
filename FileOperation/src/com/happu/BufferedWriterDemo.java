package com.happu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BufferedWriterDemo {

	public static void main(String[] args) {

		ReadFile();
		//ArrayList<String> data = (ArrayList<String>) ReadFileWithFiles();
		//String[] sdata = new String[data.size()];
		//WriteToFilde(data.toArray(sdata));

		//try (FileSystem openZip = openZip(Paths.get("C:\\Users\\alka0\\OneDrive\\Documents\\happuZip.zip"))) {
		//		copyToZip(openZip);
		//} catch (Exception e) {

		//}
		//ReadFileWithFiles();
		//ReadFile();
	}

	private static void copyToZip(FileSystem openZip) {
		
		Path sourceFile = Paths.get("C:\\Users\\alka0\\OneDrive\\Documents\\ReadFile.txt");
		Path destFile  = openZip.getPath("/ReadFile.txt");
		try {
		Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
		}catch(Exception e) {
			
		}
	}

	private static FileSystem openZip(Path path) {
		Map<String, String> map = new HashMap<>();
		FileSystem zipFile = null;
		map.put("create", "true");
		try {
			URI zipUri = new URI("jar:file", path.toUri().getPath(), null);
			zipFile = FileSystems.newFileSystem(zipUri, map);
		} catch (Exception e) {

		}
		return zipFile;

	}

	private static void ReadFileWithFiles() {
		List<String> data = null;
		String[] filesData = null;
		
		Map<String,Integer> map = new HashMap<>();
		
		try {
			data = Files.readAllLines(Paths.get("C:\\Users\\alka0\\OneDrive\\Documents\\ReadFile.txt"));
			for(String s:data) {
				filesData = s.split(",");
				for(String word:filesData )
				System.out.println(Collections.frequency(data, word));
			}
		} catch (Exception e) {

		}
		
	}

	private static void ReadFile() {

		ArrayList<String> al = new ArrayList<String>();
		Map<String,Integer> map = new HashMap<String, Integer>();
		String data;
		int count = 1;
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\alka0\\OneDrive\\Documents\\ReadFile.txt"))) {
			while ((data = br.readLine()) != null) {
				String[] word = data.split(",");
				for(String ss:word) {
					
					if(map.containsKey(ss)) {
						map.put(ss, map.get(ss)+1);
					}
					else {
					map.put(ss, 1);
					}
				}
				
			
			}
			
			long collect = map.entrySet().stream().filter( m -> m.getValue() >1 ).count();
			
			System.out.println(collect);
			/*
			 * for(Map.Entry<String,Integer> m:map.entrySet()) {
			 * //System.out.println(m.getKey()); if(m.getValue() > count) {
			 * al.add(m.getKey()); }
			 * 
			 * }
			 */
			//System.out.println(al);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	private static void WriteToFilde(String[] data) {

		try (BufferedWriter bw = new BufferedWriter(
				new FileWriter("C:\\Users\\alka0\\OneDrive\\Documents\\WriteFile.txt"))) {

			for (String s : data) {
				bw.write(s);
				bw.newLine();
			}

		} catch (Exception e) {

		}

	}

}
