/*
 6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
 */
package com.day10.treemapoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TreeMap<Integer,String> students  = new TreeMap<>();
		TreeMap<Integer,String> newStudents  = null;
		int choice =0;
		
		do {
			System.out.println("\n---- TreeMap Operations ----");
            System.out.println("1. Add student with id,name and print the TreeMap");
            System.out.println("2. copy a Tree Map content to another Tree Map");
            System.out.println("3. search a key in a Tree Map");
            System.out.println("4. search a value in a Tree Map");
            System.out.println("5. get all keys");
            System.out.println("6. delete all elements");
            System.out.println("7. sort keys  using comparator");
            System.out.println("8. get a key-value mapping associated with the greatest key and the least key in a map");
            System.out.println("9. get the first (lowest) key and the last (highest) key currently in a map");
            System.out.println("10. get a reverse order view of the keys contained in a given map");
            System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :{
				sc.nextLine();
				System.out.print("Enter the number of students : ");
				int n = sc.nextInt();
				sc.nextLine();
				addStudents(students,n);
				System.out.println("Students added successfully!");
				break;
			}
			case 2 :{
				newStudents = new TreeMap<>(students);
				System.out.println(newStudents);
				System.out.println("copied successfully!");
				break;
			}
			case 3 :{
				sc.nextLine();
				System.out.print("Enter the key(id) : ");
				int n = sc.nextInt();
				sc.nextLine();
				if(students.containsKey(n)) System.out.println("Key is found");
				else System.out.println("Key not found");
				break;
			}
			case 4 :{
				sc.nextLine();
				System.out.print("Enter the value(name) : ");
				String name = sc.nextLine();
				if(students.containsValue(name)) System.out.println("value is found");
				else System.out.println("value not found");
				break;
			}
			case 5 :{
				System.out.println("The keys are : "+students.keySet());
				break;
			}
			case 6 :{
				students.clear();
				System.out.println("All elements are deleted");
				break;
			}
			case 7 :{
				TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
                sortedMap.putAll(students);
                System.out.println("Descending sort : "+sortedMap);
				break;
			}
			case 8 :{
				System.out.println("Smallest entry is : "+students.firstEntry());
				System.out.println("Largest entry is : "+students.lastEntry());
				break;
			}
			case 9 :{
				System.out.println("First key is : "+students.firstKey());
				System.out.println("Last key is : "+students.lastKey());
				break;
			}
			case 10 :{
				System.out.println("The descending keys are : "+students.descendingKeySet());
				break;
			}
			case 0 :{
				System.out.println("Exiting.....");
				System.exit(0);
			}
			default : System.out.println("Invalid choice !");
			}
		}while(choice!=0);
		sc.close();
	}
	public static void addStudents(TreeMap<Integer,String> students, int n) {
		int id=0;
		String name="";
		while(n-->0) {
			System.out.print("Enter the id : ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter the name : ");
			name = sc.nextLine();
			students.put(id, name);
			System.out.println();
		}
	}
}
