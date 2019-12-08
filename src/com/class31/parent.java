package com.class31;

public class parent {

	static void hello() {
		System.out.println("supper class");
	}
}
class Child extends parent{
	
	static void hello() {
		System.out.println("hello from sub calss");
	}
}