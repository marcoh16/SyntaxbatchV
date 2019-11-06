package com.class2;

public class VariableDeclaration {
	public static void main(String[] args) {
		//1. declaring the variable num1 that will hold the value of in and 
		//assigning or initializing the value of 123 to it
		
		int num1=123;
		int num2=6767;
		long num3=788676232l;
		char num4='A';
		
		//2. declaring variable first and then assign the value
		int n1;
		int n2;
		int n3;
		
		n1=56;
		n2=7676;
		n3=737;
		
		//3. this way only works if variable are of the same type
		int number1, number2, number3;
		
		number1=12;
		number2=15;
		number3=768;
		
		System.out.println(n1);
		
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable='^';
		System.out.println(myVariable);
		
	//or another way is 
		char myVariables;
		myVariables='$';
		System.out.println(myVariables);
		
		number2=number1;
		System.out.println(number2);
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain;
		isSnow=true;
		System.out.println(isSnow);
		
		
		
		
		
		
	}

}
