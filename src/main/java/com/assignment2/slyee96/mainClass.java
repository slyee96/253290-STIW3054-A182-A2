package com.assignment2.slyee96;

public class mainClass extends readthePDF{
	
	public static void main(String[] args) throws Exception {

		thread1 numberCourse = new thread1();
		thread2 numberDay = new thread2();
		thread3 listSOC = new thread3();
		thread4 numberSOC = new thread4();
		thread5 displaySTIW3054 = new thread5();
	
		Thread t1 = new Thread(numberCourse);
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t2 = new Thread(numberDay);
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t4 = new Thread (numberSOC);
		t4.start();
		try {
			t4.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t3 = new Thread (listSOC);
		t3.start();
		try {
			t3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

		Thread t5 = new Thread (displaySTIW3054);
		t5.start();
		try {
			t5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

