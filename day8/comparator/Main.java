/*
 2. Develop a Java program which illustrates the usage of Comparator Interface.
 */
package com.day8.comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("1. Add Student");
			System.out.println("2. Sort by Roll Number ");
			System.out.println("3. Sort by name ");
			System.out.println("0. Exit");
			
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
					case 1 : {
						sc.nextLine();
						System.out.print("Enter the name : ");
						String name = sc.nextLine().toUpperCase();
						
						System.out.print("Enter the roll Number : ");
						int rollNumber = sc.nextInt();
						
						Student s = new Student(name,rollNumber);
						list.add(s);
						break;
					}
					case 2 :{
						if(list.isEmpty() || list.size()==1 ) {
							System.out.println("There is no records or add atleast 2 student records !");
							break;
						}
						Collections.sort(list,new SortByRollNumber());
						System.out.println("-------Student Details-------");
						for(Student s : list) {
							System.out.println();
							System.out.println(s);
							System.out.println("--------------------------");
						}
						break;
						
					}
					case 3 :{
						if(list.isEmpty() || list.size()==1 ) {
							System.out.println("There is no records or add atleast 2 student records !");
							break;
						}
						Collections.sort(list,new SortByName());
						System.out.println("-------Student Details-------");
						for(Student s : list) {
							System.out.println();
							System.out.println(s);
							System.out.println("--------------------------");
						}
						break;
						
					}
					case 0:{
						System.out.println("Exiting......");
						System.exit(0);
					}
					default : {
						System.out.println("Invalid choice !");
					}
			}
		}while(choice!=0);
	}

}
