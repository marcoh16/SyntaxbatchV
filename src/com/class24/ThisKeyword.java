package com.class24;

public class ThisKeyword {
	//this is an instance variable
	int a, b;
						//thiese are local variable 
	public ThisKeyword(int a, int b) {
		//a way to diffiriantite intance variable and local variable
		this.a = a;
		this.b = b;	
	}
	//local method
	public void sum(int a, int b) {
		System.out.println(" the sum of local variable is "+ (a+b));
		System.out.println("the sum of instance variable is "+(this.a+this.b));
	}
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	
	public void sayAandB() {
		this.sayA();
		sayB();//the compiler adds them automatically---> this.sayB();
	}
	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword(5,10);
		obj.sum(10, 3000);
		obj.sayA();
		obj.sayB();
		obj.sayAandB();
		
		
		System.out.println("------------");	
		
	}
	
	
	
	

}
