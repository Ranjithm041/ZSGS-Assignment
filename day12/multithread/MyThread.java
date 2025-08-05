package com.day12.multithread;

public class MyThread extends Thread{
	MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread : " + getName());
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }
}
