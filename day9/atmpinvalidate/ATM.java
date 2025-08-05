/*
 * ‌
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
‌
 * 
 */

package com.day9.atmpinvalidate;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pin;
		int choice = 0;
		do {
			System.out.println("1. Pin Validation : ");
			System.out.println("0. Exit ");
			System.out.print("Enter the choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				try {
					sc.nextLine();
					System.out.print("Enter the PIN : ");
					pin = sc.nextLine();
					if (!pin.matches("\\d+"))
						throw new NonNumericException("The pin must be numeric values!");
					else if (pin.charAt(0) == '0')
						throw new ZeroException("Pin number start with non zero !");
					else if (pin.length() != 4)
						throw new PinLengthException("pin length should be 4 !");
					else
						System.out.println("Pin is valid!");
				} catch (NonNumericException e) {
					System.out.println(e.getMessage());
				} catch (PinLengthException e) {
					System.out.println(e.getMessage());
				} catch (ZeroException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 0: {
				System.out.println("Exiting.....");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Choice !");
			}
		} while (choice != 0);
		sc.close();
	}
}

class PinLengthException extends Exception {
	public PinLengthException(String message) {
		super(message);
	}
}

class ZeroException extends Exception {
	public ZeroException(String message) {
		super(message);
	}
}

class NonNumericException extends Exception {
	public NonNumericException(String message) {
		super(message);
	}
}