package com.class18;
import java.util.Scanner;
public class BuiltAndUserDefinedMethods {

	
	public static void main(String[] args) {
		
		String str = "hello";
		str = str.replace("hello", "hi");
		System.out.println(str);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine(); 
		
		BuiltAndUserDefinedMethods obj = new BuiltAndUserDefinedMethods();
		obj.myMethod();
	}
	void myMethod() {
	System.out.println("this is user define method i made");
}
}