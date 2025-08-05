package com.day12.numberprinter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NumberPrinter printer = new NumberPrinter();

	        Thread oddThread = new Thread(() -> printer.printOdd());
	        Thread evenThread = new Thread(() -> printer.printEven());

	        oddThread.start();
	        evenThread.start();
	}

}
