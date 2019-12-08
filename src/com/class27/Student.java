package com.class27;

public class Student {
	public void method() {
		System.out.println("i am parent class");
	}

}
class SyntaxStudent extends Student{
	public void method() {
		System.out.println("i am child Syntax Student class");
	}
	
}
class CollegeStudent extends Student{
	public void method() {
		System.out.println("i am child College Student class");
	}
}
class SchoolStudent extends Student{
	public void method() {
		System.out.println("I am school student class");
	}
}

