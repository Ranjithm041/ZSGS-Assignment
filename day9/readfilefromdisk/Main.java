/*
 * 9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
 */
package com.day9.readfilefromdisk;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path path = Paths.get("C:\\Users\\Ranjith\\git\\zsgs\\ZSGS_Assignments\\src\\com\\day9\\AssignMent-Questions");
//			FileReader file = new FileReader(path.toFile());
			BufferedReader input = new BufferedReader(new FileReader(path.toFile()));
			String line ;
			while((line=input.readLine())!=null) {
			System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
