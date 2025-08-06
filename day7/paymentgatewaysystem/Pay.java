/*
 2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). 
Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. 
Write a main class where you can accept payment using different methods.
 */
package com.day7.paymentgatewaysystem;
import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		PaymentMethod paymentMethod;
		
		int choice =0;
		double amount;
		
		do {
			System.out.println("-------------Payment Method--------------");
			System.out.println("1. Upi");
			System.out.println("2. CreditCard");
			System.out.println("3. DebitCard");
			System.out.println("0. Exit");
			
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
					case 1:{
						System.out.print("Enter the amount : ");
						amount = sc.nextDouble();
						paymentMethod = new UpiPayment();
						paymentMethod.pay(amount);
						break;
					}
					case 2:{
						System.out.print("Enter the amount : ");
						amount = sc.nextDouble();
						paymentMethod = new CreditCardPayment();
						paymentMethod.pay(amount);
						break;
					}
					case 3:{
						System.out.print("Enter the amount : ");
						amount = sc.nextDouble();
						paymentMethod = new DebitCardPayment();
						paymentMethod.pay(amount);
						break;
					}
					case 0:{
						System.out.println("Exiting.............");
						System.exit(0);
					}
					default : System.out.println("Invalid Choice!");
					
			}
		}while(choice!=0);
		
		sc.close();
	}

}
