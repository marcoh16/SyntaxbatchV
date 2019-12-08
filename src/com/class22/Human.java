package com.class22;
//class
public class Human {
	
	//instance variables
	String name;
	String lastName;
	
	//static variable...you can share these variables with all methods
	//automatically
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	
	//method
	public static void main(String[] args) {
		
		Human human1=new Human();
		human1.lastName="john";
		human1.lastName="Smith";
		
	}

}
