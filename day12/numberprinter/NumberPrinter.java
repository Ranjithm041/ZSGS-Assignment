package com.day12.numberprinter;

public class NumberPrinter {
	 private int number = 1;
	    private final int MAX = 20;

	    public synchronized void printOdd() {
	        while (number <= MAX) {
	            if (number % 2 == 0) {
	                try {
	                    wait(); 
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                System.out.println("Odd  Thread: " + number++);
	                notify(); 
	            }
	        }
	    }

	    public synchronized void printEven() {
	        while (number <= MAX) {
	            if (number % 2 == 1) {
	                try {
	                    wait(); 
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            } else {
	                System.out.println("Even Thread: " + number++);
	                notify(); 
	            }
	        }
	    }
}
