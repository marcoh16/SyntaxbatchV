package com.class2;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String name="marco ";
		String city="Annanadale ";
		String phone="703-445-6324. ";
		//Display in screen Good morning Anna
		
		System.out.println("Good morning" + " " + name);
		
		int day=22;
		//Today is September 22
		System.out.println("today is September " + day);
		
		String text="Tdoay is September";
		System.out.println(text + day);
		
		String text1="My name is ";
		String text2="I live in the city of ";
		String text3="My phone number is ";
		
		System.out.println(text1 + name + text2 + city + text3 + phone );

		
		int num1=12;
		int num2=31;
		
		System.out.println("the value of num1= " + num1 + " and the value of num2= " + num2);
		
		String fruit="banana";
		char dollar='$';
		double price=1.99;
	
		//the price of banana is 
		System.out.println("the price of " + fruit + " is " + dollar + price);
		
	}
	
	
}
