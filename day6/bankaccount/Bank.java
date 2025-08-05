package com.day6.bankaccount;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankService service = new BankService();
		int choice =0;
		do {
			System.out.println("-----------Bank Account Menu-------------");
			System.out.println("1. Add Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. View Balance");
			System.out.println("5. Display All Accounts ");
			System.out.println("0. Exit ");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
				
			switch(choice) {
				case 1:{
					sc.nextLine();
					System.out.print("Enter the name : ");
					String name = sc.nextLine();
					System.out.print("Enter the account number : ");
					long accountNumber = sc.nextLong();
					if(service.isAccountExist(accountNumber)) {
						System.out.println("Account Number already Exist !");
						break;
					}
					System.out.print("Enter the balance : ");
					double balance = sc.nextDouble();
					
					BankAccount ba = new BankAccount(accountNumber, name, balance);
					service.accounts.add(ba);
					System.out.println("Account added successfully !");
					break;
				}
				case 2 :{
					sc.nextLine();
					System.out.print("Enter the accout number : ");
					long accountNumber = sc.nextLong();
					if(!service.isAccountExist(accountNumber)) {
						System.out.println("Account Number Does Not Exist !");
						break;
					}
					BankAccount ba = service.getByAccountNumber(accountNumber);
					System.out.print("Enter the amount : ");
					double amount = sc.nextDouble();
					ba.deposit(amount);
					System.out.println("Amount Deposited Successfully !");
					break;
				}
				case 3 : {
					sc.nextLine();
					System.out.print("Enter the accout number : ");
					long accountNumber = sc.nextLong();
					if(!service.isAccountExist(accountNumber)) {
						System.out.println("Account Number Does Not Exist !");
						break;
					}
					BankAccount ba = service.getByAccountNumber(accountNumber);
					System.out.print("Enter the amount : ");
					double amount = sc.nextDouble();
					ba.withdraw(amount);
					System.out.println("Amount Withdraw Successfully !");
					break;
				}
				case 4 : {
					sc.nextLine();
					System.out.print("Enter the accout number : ");
					long accountNumber = sc.nextLong();
					if(!service.isAccountExist(accountNumber)) {
						System.out.println("Account Number Does Not Exist !");
						break;
					}
					BankAccount ba = service.getByAccountNumber(accountNumber);
					System.out.println("Available Balance : "+ba.getBalance());
					break;
				
				}
				case 5 : {
					System.out.println("---------Accounts---------- ");
					for(BankAccount ba : service.accounts) {
						System.out.println(ba);
						System.out.println();
					}
					break;
				}
				case 0 : {
					System.out.println("Exiting.........");
					System.exit(0);
				}
				default : System.out.println("Invalid Choice !");
			}
		}while(choice!=0);
		
		sc.close();
	}

}
