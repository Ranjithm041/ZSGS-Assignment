/*
     2. Write a Menu driven Java program 
  a) to read content from the user and write it into another file 
  b) from the file to another file
  c) to modify the content of a file 
  d) to search for a particular word in a file and display how many times it appears
  e) read the content(List of Electronic Products) of a .txt file and copy them to the .csv file.
 */
package com.day11.fileoperations;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Path inputpath = Paths.get("C:\\Users\\Ranjith\\git\\zsgs\\ZSGS_Assignments\\src\\com\\day11\\fileoperations\\Files\\input");
		Path outputpath = Paths.get("C:\\Users\\Ranjith\\git\\zsgs\\ZSGS_Assignments\\src\\com\\day11\\fileoperations\\Files\\output");
		Path writefilepath = Paths.get("C:\\Users\\Ranjith\\git\\zsgs\\ZSGS_Assignments\\src\\com\\day11\\fileoperations\\Files\\writed");
		Path productpath = Paths.get("C:\\Users\\Ranjith\\git\\zsgs\\ZSGS_Assignments\\src\\com\\day11\\fileoperations\\Files\\Product");
		Path sheetpath = Paths.get("C:\\Users\\Ranjith\\Pictures\\Sheet.csv");
		int choice=0;
		
		 do {
		        System.out.println("\n-------File Operations Menu-------");
		        System.out.println("1. Read content from user and write to file");
		        System.out.println("2. Copy content from one file to another");
		        System.out.println("3. Modify content of a file");
		        System.out.println("4. Search a word in a file");
		        System.out.println("5. Copy product list from .txt to .csv");
		        System.out.println("0. Exit");
		        System.out.print("Enter your choice: ");
		        choice = sc.nextInt();
		        sc.nextLine();

		        switch (choice) {
		            case 1 -> {
		                System.out.println("Enter content (type 'exit' to stop):");
		                readFromUser(writefilepath);
		            }
		            case 2 -> {
		                copyFile(inputpath, outputpath);
		            }
		            case 3 -> {
		                System.out.print("Enter old word : ");
		                String oldWord = sc.nextLine();
		                System.out.print("Enter new word: ");
		                String newWord = sc.nextLine();
		                modifyContent(writefilepath, oldWord, newWord);
		            }
		            case 4 -> {
		                System.out.print("Enter word to search: ");
		                String searchWord = sc.nextLine();
		                int count = findWords(outputpath, searchWord);
		                System.out.println("The word " + searchWord + " appeared " + count + " times.");
		            }
		            case 5 -> {
		                readWriteIntoCSV(productpath, sheetpath);
		            }
		            case 0 -> {
		                System.out.println("Exiting the program...");
		            }
		            default -> {
		                System.out.println("Invalid choice. Try again.");
		            }
		        }

		    } while (choice != 0);
		 sc.close();
		
	}
	public static void readWriteIntoCSV(Path file, Path sheet) {
		   try {
		        List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);

		        // Add header
		        List<String> csvContent = new ArrayList<>();
		        csvContent.add("ProductID,ProductName,Price");

		        // Add content lines
		        for (String line : lines) {
		            if (!line.trim().isEmpty()) {
		                csvContent.add(line.trim());
		            }
		        }

		        // Write to real .csv file
		        Files.write(sheet, csvContent, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		        System.out.println("CSV file created at: " + sheet);

		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	}
	public static int findWords(Path path , String word) {
		 int count = 0;
	        try {
	            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
	            for (String line : lines) {
	                String[] words = line.split("\\s+");
	                for (String w : words) {
	                    if (w.equalsIgnoreCase(word)) {
	                        count++;
	                    }
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return count;
	}
	public static void modifyContent(Path path, String oldString , String newString) {
		try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            boolean found = false;

            List<String> modified = new ArrayList<>();
            for (String line : lines) {
                if (line.contains(oldString)) {
                    found = true;
                }
                modified.add(line.replaceAll(oldString, newString));
            }

            if (!found) {
                System.out.println("Old word not found in file.");
                return;
            }

            Files.write(path, modified, StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File content modified successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	public static void readFromUser(Path path) {
		 List<String> lines = new ArrayList<>();
	        String input;
	        while (!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
	            lines.add(input);
	        }

	        try {
	            Files.write(path, lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
	            System.out.println("Written to file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	 public static void copyFile(Path source, Path target) {
	        try {
	            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
