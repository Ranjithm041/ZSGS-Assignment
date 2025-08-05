package com.day6.paymentgatewaysystem;

import java.util.*;

public class PaymentGatewaySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("------------ Payment Gateway Menu ------------");
            System.out.println("1. Make Payment");
            System.out.println("2. View Transaction History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    Transaction txn = new Transaction();

                    System.out.print("Enter Payer Name        : ");
                    txn.setPayerName(sc.nextLine());

                    System.out.print("Enter Payee Name        : ");
                    txn.setPayeeName(sc.nextLine());

                    System.out.print("Enter Amount            : ₹");
                    txn.setAmount(sc.nextDouble());

                    System.out.println("Select Payment Method: ");
                    System.out.println("1. UPI");
                    System.out.println("2. DEBITCARD");
                    System.out.println("3. CREDITCARD");
                    System.out.println("4. BANK");
                    System.out.print("Enter choice: ");
                    int pm = sc.nextInt();
                    sc.nextLine(); 
                    
                    switch (pm) {
                        case 1:
                            txn.setPaymentMethod(PaymentMethod.UPI);
                            break;
                        case 2:
                            txn.setPaymentMethod(PaymentMethod.DEBITCARD);
                            break;
                        case 3:
                            txn.setPaymentMethod(PaymentMethod.CREDITCARD);
                            break;
                        case 4:
                            txn.setPaymentMethod(PaymentMethod.BANK);
                            break;
                        default:
                            System.out.println("Invalid payment method. Defaulting to UPI.");
                            txn.setPaymentMethod(PaymentMethod.UPI);
                    }
//
//                    System.out.print("Enter Transaction ID    : ");
//                    txn.setTransactionId(sc.nextLine());
//
//                    System.out.print("Enter Transaction Status: ");
//                    txn.setTransactionStatus(sc.nextLine());

                    System.out.println("\n--------- Transaction Summary ---------");
                    txn.displayTransactionSummary();

                    List<String> record = new ArrayList<>();
                    record.add(txn.getPayerName());
                    record.add(txn.getPayeeName());
                    record.add(String.valueOf(txn.getAmount()));
                    record.add(txn.getPaymentMethod().toString());
                    record.add(txn.getTransactionId());
                    record.add(txn.getTransactionStatus());
                    Transaction.transactionHistory.add(record);

                    break;

                case 2:
                    System.out.println("\n--------- All Transactions ---------");
                    if (Transaction.transactionHistory.isEmpty()) {
                        System.out.println("No transactions available.");
                    } else {
                        int count = 1;
                        for (List<String> row : Transaction.transactionHistory) {
                            System.out.println("Transaction #" + count++);
                            System.out.println("Payer Name        : " + row.get(0));
                            System.out.println("Payee Name        : " + row.get(1));
                            System.out.println("Amount            : ₹" + row.get(2));
                            System.out.println("Payment Method    : " + row.get(3));
                            System.out.println("Transaction ID    : " + row.get(4));
                            System.out.println("Status            : " + row.get(5));
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting Payment Gateway...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
