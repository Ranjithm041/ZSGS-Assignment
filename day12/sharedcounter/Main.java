package com.day12.sharedcounter;

public class Main {

	public static void main(String[] args) {
		 Counter counter = new Counter();

	        Thread t1 = new Thread(new CounterTask(counter));
	        Thread t2 = new Thread(new CounterTask(counter));
	        Thread t3 = new Thread(new CounterTask(counter));

	        t1.start();
	        t2.start();
	        t3.start();

	        // Wait for all threads to complete
	        try {
				t1.join();
				t2.join();
		        t3.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        

	        System.out.println("Final Counter Value: " + counter.getValue());
	}

}
