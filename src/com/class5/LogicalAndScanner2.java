package com.class5;
import java.util.Scanner;

public class LogicalAndScanner2 {
	public static void main(String[] args) {
		int age;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("please enter your age");
		age=scan.nextInt();
		String human;
		
		
		
		if(age>=1 && age <=3) {
			human="baby";
			//System.out.println("baby");
			
		}else if(age>3 && age<=5) {
			human="toddler";
			//System.out.println("toddler");
		}else if(age>5 && age<=12) {
			human="kid";
			//System.out.println("kid");
		}else if(age>12 && age<=19) {
			human="teenager";
			//System.out.println("teenager");
			
		}else if (age>19) {
			human="adult";
			//System.out.println("adult");
				
		}else {
			human="invalid";
			//System.out.println("invalid age entered");
		}
		
		System.out.println("your are a " + human);
		
	}

}
