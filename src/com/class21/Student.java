package com.class21;

public class Student {

	public String studentName;
	public double GPA;
	public String school;
	
	public void displayInfo() { 
		System.out.println(studentName + " is attending "+ school + " and has a GPA of "  + GPA);
	}
	
	protected void study(int hours) {
		int localVariable = 4;
		System.out.println(studentName + " is Studying for "+ hours + "hours.");
	}
	
	
	
	
	
	
	
}
