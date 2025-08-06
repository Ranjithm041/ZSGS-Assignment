/*
 3. Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary.
 Use proper getter and setter methods to access and update these fields.
  Add a method to calculate and return the annual salary of the employee.
‌
 */
package com.day6.employee;
import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice =0;
		
		do {
			System.out.println("--------Employee Test--------- ");
			System.out.println("1. Add Employee ");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			switch(choice) {
					case 1 :{
						sc.nextLine();
						System.out.print("Enter the Employee Name : ");
						String name = sc.nextLine();
						System.out.print("Enter the Employee ID : ");
						int id = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter the Desigantion : ");
						String designation = sc.nextLine();
						System.out.print("Enter the Department : ");
						String department = sc.nextLine();
						System.out.print("Enter the monthly salary : ");
						double salary = sc.nextDouble();
						
						Employee emp = new Employee(id, name, designation, department, salary);
						
						System.out.println("The Annual Salary is : "+emp.getAnnualSalary());
						break;
					}
					case 0 :{
						System.out.println("Exiting.........");
						System.exit(0);
					}
					default : System.out.println("Invalid Choice ! Try again");
			}
		}while(choice!=0);
		
	}

}
