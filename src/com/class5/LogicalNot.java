package com.class5;

public class LogicalNot {
	
	public static void main(String[] args) {
		boolean b1=!true;
		boolean b2=!false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("on time");
		}else {
			System.out.println("late");
		}
		
		boolean isRain=false;
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("dont take an umbrella");
		}
		
		//lets compare 2 numbers using NOT operator
		
		System.out.println("-------------");
		
		int num1 = 10;
		int num2 = 11;
		if (num1==num2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		//another way to compare numbers using NOT
		
		if (!(num1==num2)) {
			System.out.println("numbers are not equal");
			
		}else {
			System.out.println("numbers are equal");
		}
		
		String name="Marry";
		String name2="Anna";
		//if name is not marry or anna then your not my friend
		if (!(name.equals("Mary")|| name2.equals("Anna"))) {
			System.out.println("you are not my sister");
		}else {
			System.out.println("you are my friend");
		}
			
			
			
		}
		
	}


