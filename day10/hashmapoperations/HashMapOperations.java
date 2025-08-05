/*
 7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.
 */
package com.day10.hashmapoperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapOperations {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> students = new HashMap<>();
		HashMap<Integer,String> shallowCopy = null;
		HashMap<Integer,String> copy = null;
		int choice =0;
		
		do {
			System.out.println("\n--- HashMap Operations Menu ---");
            System.out.println("1. Add key-value pair");
            System.out.println("2. Count number of entries (size)");
            System.out.println("3. Copy to another map");
            System.out.println("4. Remove all entries");
            System.out.println("5. Check if map is empty");
            System.out.println("6. Get shallow copy of HashMap");
            System.out.println("7. Check if key exists");
            System.out.println("8. Check if value exists");
            System.out.println("9. Get set view of entries");
            System.out.println("10. Get value for specific key");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
            case 1->{
            	System.out.print("Enter the number of students : ");
				int n = sc.nextInt();
				sc.nextLine();
				addStudents(students,n);
				System.out.println("Students added successfully!");
            }
            case 2->{
            	System.out.println("Number of Entries are : "+students.size());
            }
            case 3->{
            	copyMap(students,copy);
            	copy = new HashMap<>(students);
            	System.out.println("Copied : "+copy);
            }
            case 4->{
            	students.clear();
            	System.out.println("Removed all entries!");
            }
            case 5->{
            	if(students.isEmpty()) System.out.println("There is no students !");
            	else System.out.println("Some students are there");
            }
            case 6->{
            	shallowCopy = (HashMap<Integer,String>) students.clone();
            	System.out.println("Shallow copy : "+shallowCopy);
            }
            case 7->{
            	sc.nextLine();
            	System.out.print("Enter the key (id) : ");
            	int id = sc.nextInt();
            	if(students.containsKey(id)) System.out.println("Key Exists!");
            	else System.out.println("Key does not exists!");
            }
            case 8->{
            	sc.nextLine();
            	System.out.print("Enter the value (name) : ");
            	String val = sc.nextLine();
            	if(students.containsValue(val)) System.out.println("Value Exists!");
            	else System.out.println("Value does not exists!");
            }
            case 9->{
            	Set<Map.Entry<Integer,String>> set = students.entrySet();
            	System.out.println("Set : "+set);
            }
            case 10->{
            	sc.nextLine();
            	System.out.print("Enter the key (id) : ");
            	int id = sc.nextInt();
            	if(students.containsKey(id)) System.out.println("Value is : "+students.get(id));
            	else System.out.println("Key does not exists!");
            }
            case 0->{
            	System.out.println("Exiting.....");
            	System.exit(0);
            }
            default -> System.out.println("Invalid Choice!");
            }
		}while(choice!=0);
		sc.close();
	}
	public static void addStudents(HashMap<Integer,String> students, int n) {
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
	
	public static void copyMap(HashMap<Integer,String> students, HashMap<Integer,String> copy) {
		 copy = new HashMap<>(students);
	}

}
