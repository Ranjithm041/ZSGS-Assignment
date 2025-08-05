package com.day6.userdefinedpackage;

import com.day6.userdefinedpackage.arithmetic.*;
import com.day6.userdefinedpackage.stringutils.*;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arithmetic arithmetic = new Arithmetic();
        StringUtils stringUtils = new StringUtils();
        int choice;

        do {
            System.out.println("\n------ Package Test Menu ------");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. String Operations");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter two integers: ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    System.out.println("Addition        : " + arithmetic.add(x, y));
                    System.out.println("Subtraction     : " + arithmetic.subtract(x, y));
                    System.out.println("Multiplication  : " + arithmetic.multiply(x, y));
                    System.out.println("Division        : " + arithmetic.divide(x, y));
                    System.out.println("Modulus         : " + arithmetic.modulus(x, y));
                    break;

                case 2:
                    sc.nextLine(); 
                    System.out.print("Enter first string: ");
                    String str1 = sc.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = sc.nextLine();

                    System.out.println("Concatenated String : " + stringUtils.concat(str1, str2));
                    System.out.println("Reverse of First String : " + stringUtils.reverse(str1));
                    System.out.println("Length of First String  : " + stringUtils.length(str1));
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
