/*
 * 
 * 10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote.
 Use a custom exception to handle the scenario when an ineligible person tries to register for voting.
  Display appropriate messages for eligible and ineligible voters
 * 
 * 
 */

package com.day9.votingsystem;
import java.util.Scanner;

public class VotingSystem {
	private static int vote=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice =0;
		
		do {
			System.out.println("------------Voting System------------");
			System.out.println("1. Vote");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				sc.nextLine();
				System.out.print("Enter the age : ");
				byte age = sc.nextByte();
				checkEligibility(age);
				break;
			}
			case 0 :{
				System.out.println("Exiting.....");
				System.exit(0);
				break;
			}
			default : System.out.println("Invalid Choice !");
			}
		}while(choice!=0);
		sc.close();
	}

	public static void checkEligibility(byte age) {
		try {
			if(age<18) throw new InEligibleException("You are not Eligible for voting");
			else  {
				System.out.println("Eligible!");
				vote++;
			}
		}catch(InEligibleException e) {
			e.printStackTrace();
		}
	}
}

class InEligibleException extends Exception{
	public InEligibleException(String message) {
		super(message);
	}
}