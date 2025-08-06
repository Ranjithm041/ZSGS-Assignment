package com.day12.atm;

public class ATM {
    private boolean pinVerified = false;
    private double balance = 10000.0;

    public synchronized void verifyPin(int pin) throws InterruptedException {
        System.out.println("Verifying PIN...");
        Thread.sleep(1000);

        if (pin == 1234) {
            pinVerified = true;
            System.out.println("PIN Verified Successfully.");
            notifyAll();
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public synchronized void withdrawCash(double amount) throws InterruptedException {
        while (!pinVerified) {
            wait();
        }
        System.out.println("Processing withdrawal of Rs." + amount);
        Thread.sleep(1000);

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Cash Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
        notifyAll();
    }

    public synchronized void checkBalance() throws InterruptedException {
        while (!pinVerified) {
            wait();
        }
        Thread.sleep(500);
        System.out.println("Current Balance: Rs." + balance);
        notifyAll();
    }

    public synchronized void printReceipt() throws InterruptedException {
        while (!pinVerified) {
            wait();
        }
        Thread.sleep(500);
        System.out.println("Printing Receipt... ✅");
        System.out.println("Thank you for using our ATM!");
    }
}