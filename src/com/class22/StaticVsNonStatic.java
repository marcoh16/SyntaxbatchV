package com.class22;

public class StaticVsNonStatic {

	//template for a students(school, name, grade)
	
	static String school = "Syntax";
	String name;
	char grade;
	
	//also call instance method or non static
	void getInfo() {
		System.out.println("my name is "+name+ " and i am going to "+school+ " and my grade is "+ grade);
	}
	
	//static method 
	static void getInfo1() {
		System.out.println(" i am attending classes at "+ school);
		//can not access not static members within static methods.
		//System.out.println("my name is "+ name);
	}
	public static void main(String[] args) {
		//how to access static members
		//thjeyu can be access by classname
		StaticVsNonStatic.getInfo1();
		
		
		
	}
	
}
