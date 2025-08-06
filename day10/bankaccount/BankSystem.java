/*
 8. Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use autoboxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).
 */
package com.day10.bankaccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		ArrayList<Account> accounts= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int choice =0;
		
		do {
			System.out.println("\n---------Bank Account System----------");
			System.out.println("1. Add Account");
			System.out.println("2. Apply Interest");
			System.out.println("3. Show account by Account Number");
			System.out.println("4. Show New Balance");
			System.out.println("5. Show All account");
			System.out.println("0. Exit");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1->{
				System.out.print("Enter the Name : ");
				String name = sc.nextLine();
				System.out.print("Enter the account Number : ");
				int accountNumber = sc.nextInt();
				if(isExists(accounts , accountNumber)) {
					System.out.println("Account Already Exist!");
					break;
				}
				System.out.print("Enter the initial Balance : ");
				double balance = sc.nextDouble();
				Double boxed = Double.valueOf(balance);
				Account account = new Account(accountNumber, name, boxed);
				accounts.add(account);
				System.out.println("Account added successfully!");
			}
			case 2->{
				System.out.print("Enter the account Number : ");
				int accountNumber = sc.nextInt();
				if(!isExists(accounts , accountNumber)) {
					System.out.println("Account Does not Exist!");
					break;
				}
				System.out.print("Enter the interest : ");
				double interest = sc.nextDouble();
				Double boxed = Double.valueOf(interest);
				getAccount(accounts, accountNumber).applyInterest(boxed);
				System.out.println("Interest Applied successfully!");
			}
			case 3->{
				System.out.print("Enter the account Number : ");
				int accountNumber = sc.nextInt();
				if(!isExists(accounts , accountNumber)) {
					System.out.println("Account Does not Exist!");
					break;
				}
				System.out.println("Account Details : "+getAccount(accounts, accountNumber));
			}
			case 4->{
				System.out.print("Enter the account Number : ");
				int accountNumber = sc.nextInt();
				if(!isExists(accounts , accountNumber)) {
					System.out.println("Account Does not Exist!");
					break;
				}
				System.out.println("Account Details : "+getAccount(accounts, accountNumber).getBalance().doubleValue());
			}
			case 5->{
				if(accounts.isEmpty()) {
					System.out.println("There is no accounts");
					break;
				}
				System.out.println("All Accounts are : ");
				for(Account acc : accounts) {
					System.out.println(acc);
				}
			}
			case 0->{
				System.out.println("Exiting.....");
				System.exit(0);
			}
			default -> System.out.println("Invalid choice !");
			}
		}while(choice!=0);
		sc.close();
	}
	public static boolean isExists(ArrayList<Account> accounts , int accountNumber) {
		for(Account acc : accounts) {
			if(acc.getAccountNumber()==accountNumber) return true;
		}
		return false;
	}
	public static Account getAccount(ArrayList<Account> accounts , int accountNumber) {
		for(Account acc : accounts) {
			if(acc.getAccountNumber()==accountNumber) return acc;
		}
		return null;
	}

}
