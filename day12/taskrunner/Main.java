package com.day12.taskrunner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskRunner task1 = new TaskRunner("File uploading");
		TaskRunner task2 = new TaskRunner("File downloading");
		
		Thread t1 = new Thread(task1,"work1");
		Thread t2 = new Thread(task2,"work2");
		
		t1.start();
		t2.start();
	}

}
