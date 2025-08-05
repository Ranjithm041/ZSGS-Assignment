/*
 2. Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks
 */
package com.day12.taskrunner;

public class TaskRunner implements Runnable{
	private String taskName;
	TaskRunner(String task){
		taskName = task;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Thread : "+Thread.currentThread().getName()+ "\nTask : "+taskName);
			try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
		}
	}
}
