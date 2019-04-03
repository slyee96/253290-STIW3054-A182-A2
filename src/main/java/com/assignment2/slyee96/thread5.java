package com.assignment2.slyee96;

public class thread5 extends readthePDF implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		super.run();
		System.out.println("Thread 5:- ");
		for(i=0;i<line.length;i++) {
			if(line[i].contains("STIW3054")) 
				System.out.println(line[i]);
			 } 
			 System.out.println("----------------------------------");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
