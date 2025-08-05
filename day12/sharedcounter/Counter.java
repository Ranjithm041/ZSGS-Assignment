package com.day12.sharedcounter;

public class Counter {
	private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}
