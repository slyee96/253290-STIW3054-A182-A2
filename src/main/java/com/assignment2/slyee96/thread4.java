package com.assignment2.slyee96;

public class thread4 extends readthePDF implements Runnable {
	public void run() {		
		int i=0,j=0, k;
		int count =0;
		String [] code = {"STIA", "STQM", "STID", "STIJ", "STIX", "STIN", "STIK", "STIW", "STQS"};
		System.out.println("Thread 4:-");
		super.run();
		for(i=0;i<line.length;i++) {
			for(k=1000;k<=5000;k++) {
				for(j=0;j<code.length;j++) {
					if(line[i].contains(code[j] + k)){
						count++;
					}
				}
			}
		}
		System.out.println("Total Number of Course from SOC : " + count);
		System.out.println("-------------------------------------------");

	try{
		Thread.sleep(2000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		System.out.println();
    }
}
