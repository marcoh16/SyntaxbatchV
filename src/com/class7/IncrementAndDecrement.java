package com.class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int a=10;
		
		a = a+1;//assigment
		a+=1;//shorhand assigment
		
		System.out.println(a);//12
		a++;//increment operator
		System.out.println(a);
		
		int b=10;
		b-=1;//9
		b--;//decrement operator
		System.out.println(b);
		
		//increment and decrement operators can be used 
		//only with variables;
		
		int c=23;
		c++;
		//1++; compiler error invalid argument
		
	}
}