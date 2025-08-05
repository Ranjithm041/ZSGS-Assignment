package com.day7.banksystem;

import java.util.*;

public class RBISystem {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List<RBI> banks = new ArrayList<>(); 

        int choice = 0;
        do {
            System.out.println("\n----------- RBI SYSTEM -----------");
            System.out.println("1. Create New Account");
            System.out.println("2. Show All Accounts");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();  
                    System.out.print("Enter Bank (SBI/ICICI/PNB): ");
                    String bankName = sc.nextLine().toUpperCase();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Age: ");
                    byte age = sc.nextByte();
                    sc.nextLine(); 
                    System.out.print("Enter DOB: ");
                    String dob = sc.nextLine();

                    System.out.print("Enter Account Type (SAVING/CURRENT): ");
                    String accType = sc.nextLine().toUpperCase();
                    AccountType type = AccountType.valueOf(accType);

                    System.out.print("Enter Account Number: ");
                    long accNo = sc.nextLong();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter IFSC Code: ");
                    String ifsc = sc.nextLine();

                    Customer customer = new Customer(name, id, age, dob);
                    Account account = new Account(type, accNo, ifsc);

                    RBI bank = null;
                    if (bankName.equals("SBI")) {
                        bank = new SBI(customer, account);
                    } else if (bankName.equals("ICICI")) {
                        bank = new ICICI(customer, account);
                    } else if (bankName.equals("PNB")) {
                        bank = new PNB(customer, account);
                    } else {
                        System.out.println("Invalid Bank Name!");
                        break;
                    }

                    banks.add(bank);
                    System.out.println("Account created successfully !");
                    break;

                case 2:
                    if (banks.isEmpty()) {
                        System.out.println(" No accounts found.");
                    } else {
                        System.out.println("\n--- All Bank Accounts ---");
                        for (RBI b : banks) {
                            System.out.println("Bank: " + b.getClass().getSimpleName());
                            System.out.println("Customer Name: " + b.c.getName());
                            System.out.println("Account Type: " + b.a.getType());
                            System.out.println("Interest Rate: " + b.getInterestRate() + "%");
                            System.out.println("Withdrawal Limit: Rs." + b.getWithdrawalLimit());
                            System.out.println("Account No: " + b.a.getAccountNumber());
                            System.out.println("IFSC Code: " + b.a.getIfscCode());
                            System.out.println("--------------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting RBI System...");
                    break;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
