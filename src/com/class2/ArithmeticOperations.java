package com.class2;

public class ArithmeticOperations {
	
	/*
	 * Declare 2 variables and initialize them 
	 * display result addition, subtraction, multiplication and division
	 * 
	 */
	
	public static void main(String[] args) {
		int num1, num2;
		
		num1=20;
		num2=2;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		
		
		System.out.println(num1 + " " + num2);
		
		int sum=num1+num2;
		int sum2=num1-num2;
		int sum3=num1*num2;
		int sum4=num1/num2;
		//the addition of 2 number is --
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
		
		String text="the addition of 2 number is=";
		String text2="the sub of 2 number is=";
		String text3="the multiplication of 2 number is=";
		String text4="the division of 2 number is=";
		
		System.out.println(text + sum);
		System.out.println(text2 + sum2);
		System.out.println(text3 + sum3);
		System.out.println(text4 + sum4);
		 
		
		
		
		
	}
}
