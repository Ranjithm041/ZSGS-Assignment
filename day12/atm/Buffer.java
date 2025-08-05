package com.day12.atm;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private final int LIMIT = 5;
    private final Queue<Integer> queue = new LinkedList<>();
    private int value = 1;

    public synchronized void produce() throws InterruptedException {
        while (true) {
            while (queue.size() == LIMIT) {
                wait(); 
            }

            System.out.println("Producer produced: " + value);
            queue.add(value++);
            notify();
            Thread.sleep(500);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            while (queue.isEmpty()) {
                wait();
            }

            int item = queue.remove();
            System.out.println("Consumer consumed: " + item);
            notify(); 
            Thread.sleep(1000);
        }
    }
}

