/*
 1. Write a Java program to read the contents of a text file and display it on the console.
 */
package com.day11.readContents;
import java.io.*;
public class ReadContents {

	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new FileReader("output.txt"))){
			String line;
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
