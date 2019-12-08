package com.class24;

public class thisWithConstructor {
	
	thisWithConstructor(){
		System.out.println("im non argument constructor");
	}
	thisWithConstructor(String str){
		this();//used to call current class constructor
		System.out.println("im constructor with opne parameter");
	}
    thisWithConstructor(String str2, String str3){
    	this(str2);
    	System.out.println("im a constructor with 2 parameters");
		
		
	}
	public static void main(String[] args) {
		thisWithConstructor obj = new thisWithConstructor("Hello");
		System.out.println("---------");
		//can we execute 2 constructor when creating an object
		//yes it can be achieve using this()
		thisWithConstructor obj1 = new thisWithConstructor("Hello", "bye");
	}
	

}
