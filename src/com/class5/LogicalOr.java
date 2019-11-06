package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
		
		
		int day = 7;
		//false OR false --> false
		if (day==2 || day==4) {
			System.out.println("SDLC class");
			
		//true OR false--> true
		}else if (day==6 || day==7) {
			System.out.println("Java class");
			
			
		//false OR false--> false
		}else if (day==1 || day==5) {
			System.out.println("no class");
			
			
		}else if (day==3) {
			System.out.println("review class");
			
			
			
		}else {
			System.out.println("Not a valid day");
		}
		
		
		System.out.println("-------------");
		//seven days a week 
		//if days is tues or thurs --> SDLC class
		//if days is sat or sun --> Java class
		//if day is mon or frid --> no class
		//if day is wens --> review class
		
		String weekDay="Saturday";
		
		if (weekDay.equals("Tuesday")|| weekDay.equals("Thusday")) {
			System.out.println("SDLC class");
			
		}else if (weekDay.contentEquals("Saturday")|| weekDay.contentEquals("Sunday")) {
			System.out.println("Java class");
			
		}else if (weekDay.equals("Monday")|| weekDay.equals("Friday")) {
			System.out.println("No class");
			
		}else {
			System.out.println("not a valid day");
		}
		
		
	}
	
	

}
