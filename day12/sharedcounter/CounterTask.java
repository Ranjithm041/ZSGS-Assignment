package com.day12.sharedcounter;

public class CounterTask implements Runnable {
	 private final Counter counter;

	    public CounterTask(Counter counter) {
	        this.counter = counter;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 1000; i++) {
	            counter.increment();
	        }
	    }
}
