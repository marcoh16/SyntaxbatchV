package com.OOPs;

public class Polymorphism {
	// essential in java oop
	/*
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		//main method is considered a built in method
		Polymorphism obj = new Polymorphism();
		System.out.println("THis is the orginal main method");
		obj.main();
		
		
	}
	
	
	public static void main() {
		//user define method
		System.out.println("this is the overload main method without parameter");
	}
	
	int sum(int num, int num2) {
		int c = (num+num2);
		return c;
	}

}
