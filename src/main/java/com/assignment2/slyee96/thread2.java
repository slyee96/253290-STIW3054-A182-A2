package com.assignment2.slyee96;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class thread2 extends readthePDF implements Runnable{
	public void run(){
		super.run();
		LocalDate start = LocalDate.of(2019, Month.MAY, 25);
	    LocalDate end = LocalDate.of(2019, Month.JUNE, 21);
	    long day = (ChronoUnit.DAYS.between(start, end)) - 9;
	    
	    System.out.println("Thread 2:-");
	    System.out.println(day);
	    System.out.println("-------------------------------------------");
	    try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
