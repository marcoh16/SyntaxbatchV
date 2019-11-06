package com.class2;

public class PerimeterAndArea {
	public static void main(String[] args) {
		
		int num1= 40;
		int num2=2;
		//1
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		System.out.println("the sum of 2 numbers " + sum);
		System.out.println("the sub of 2 numbers " + sub);
		System.out.println("the multiplications of 2 numbers " + mul);
		System.out.println("the division of 2 numbers " + div);
		
		//2
		double number1 = 3.9;
		double square= number1 * number1;
		String text4="the square of ";
		System.out.println(text4 + number1 + " is " + square);
		
		
		
		//3
		int width=5;
		int height=8;
		
		int perimeter=(width+height)*2;
		int area=width * height;
		
		String text="the perimeter of a rectangle with width ";
		String text2=" is eaqual to ";
		String text3= " and the area is ";
		
		System.out.println(text + width + " and height " + height + text2 + perimeter + text3 + area );
			
		
	}

}
