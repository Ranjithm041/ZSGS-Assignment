package com.day11.appendcontents;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file = new File("src/com/day11/appendcontents/Content.txt");
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("\n1. Append word");
			System.out.println("2. View File Contents");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1->{
				System.out.print("Enter the word : ");
				String word = sc.nextLine();
				appendString(file, word);
				System.out.print("Word Appended successfully!");
			}
			case 2->{
				String output = readString(file);
				System.out.println(output);
				System.out.println("File Readed Successfully!");
			}
			case 0->{
				System.out.println("Exiting....");
				System.exit(0);
			}
			default-> System.out.println("Invalid Choice!");
			}
			
		}while(choice!=0);
		sc.close();
	}
	public static String readString(File file) {
		String output="";
		try(
				BufferedReader br = new BufferedReader(new FileReader(file));
				){
			
				String line;
				while((line=br.readLine())!=null) {
					output+=line;
				}
				return output;
			} catch (IOException e) {
				e.printStackTrace();
			}
		return output;
	}
	public static void appendString(File file,String word) {
		try(
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			){
			bw.write(word);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
