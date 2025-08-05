package com.day12.multithread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread("Thread-1");
		MyThread t2 = new MyThread("Thread-2");
		
		t1.start();
		t2.start();
	}

}
