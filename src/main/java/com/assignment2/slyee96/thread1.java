package com.assignment2.slyee96;

public class thread1 extends readthePDF implements Runnable{
	@Override
	public void run() {
		super.run();
		int i,numCou=0;
				
		for(i=0;i<text.length();i++) {
	  		if(text.contains(i +".")) 
	  			numCou+=1; 
		}
		System.out.println("-------------------------------------------");
		System.out.println("Thread 1:- ");
		System.out.println("Total Number of Course: " + (numCou-1));
		System.out.println("-------------------------------------------");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
