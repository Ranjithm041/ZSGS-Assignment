/*
 3. Create a Java application to manage employees in a company. Define a base class Employee with a method 
 calculateSalary().
 Then create two subclasses FullTimeEmployee and PartTimeEmployee that
  override calculateSalary() method based on their working type.
 */
package com.day5.employee;
import java.util.Scanner;
public class EmployeeTypeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice =0;
		do {
			System.out.println("--------------Employee Type Menu-------------");
			System.out.println("1. Full Time Employee ");
			System.out.println("2. Part Time Employee ");
			System.out.println("0. Exit ");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1 : {
					sc.nextLine();
					System.out.print("Enter the Employee Name : ");
					String empName = sc.nextLine();
					System.out.print("Enter the Employee Id : ");
					int empId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the Employee Designation : ");
					String designation = sc.nextLine();
					System.out.print("Enter the Employee Monthly Salary : ");
					double monthlySalary = sc.nextDouble();
					System.out.print("Enter the Employee Bonus : ");
					double bonus = sc.nextDouble();
					
					FullTimeEmployee fte = new FullTimeEmployee(empName, empId, designation, monthlySalary, bonus);
					System.out.println("----------Full Time Employee Details----------");
					fte.printDetails();
					
					break;
									
				}
				case 2 : {
					sc.nextLine();
					System.out.print("Enter the Employee Name : ");
					String empName = sc.nextLine();
					System.out.print("Enter the Employee Id : ");
					int empId = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the Employee Designation : ");
					String designation = sc.nextLine();
					System.out.print("Enter the Employee Hours Worked : ");
					double monthlySalary = sc.nextDouble();
					System.out.print("Enter the Employee Rate Per Hour : ");
					double bonus = sc.nextDouble();
					
					PartTimeEmployee pte = new PartTimeEmployee(empName, empId, designation, monthlySalary, bonus);
					System.out.println("----------Part Time Employee Details----------");
					pte.printDetails();
					
					break;
					
				}
				case 0 : {
					System.out.println("Exiting....");
					System.exit(0);
				}
				default : System.out.println("Invalid Choice !");
			}
		}while(choice!=0);
		sc.close();
	}
}
