package com.day12.atm;

public class Main {

	public static void main(String[] args) {
		 ATM atm = new ATM();

	        Thread pinThread = new Thread(() -> {
	            try {
	                atm.verifyPin(1234); 
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread withdrawThread = new Thread(() -> {
	            try {
	                atm.withdrawCash(3000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread balanceThread = new Thread(() -> {
	            try {
	                atm.checkBalance();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread receiptThread = new Thread(() -> {
	            try {
	                atm.printReceipt();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Start all threads
	        pinThread.start();
	        withdrawThread.start();
	        balanceThread.start();
	        receiptThread.start();
	        try {
				Thread.sleep(3000);
				atm.checkBalance();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      

	}

}
