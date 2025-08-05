package com.day11.counts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\Ranjith\\git\\zsgs\\ZSGS_Assignments\\src\\com\\day11\\counts\\Content");
		System.out.println("Number of Characters : "+countChars(path));
		System.out.println("Number of Words      : "+countWords(path));
		System.out.println("Number of Lines      : "+countLines(path));
	}
	public static int countWords(Path path) {
		int words=0;
		try {
			List<String> contents = Files.readAllLines(path);
			for(String line : contents) {
				String[] parts = line.split(" ");
				words+=parts.length;
			}
			return words;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return words;
	}
	public static int countLines(Path path) {
		int lines=0;
		try {
			List<String> contents = Files.readAllLines(path);
			
			return contents.size();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lines;
	}
	public static int countChars(Path path) {
		 try {
			String content = Files.readString(path);
			return content.length();
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 return 0;
	}
}
