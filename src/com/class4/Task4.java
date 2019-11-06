package com.class4;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter city name: ");
		String name =input.next();	
		
		
		System.out.println("enter the temperature");
		int f=input.nextInt();
		
		
	
		
		float c=(f-32)*(9f/5);
		
		
		System.out.println("the temperature in city "  + name + " is " + c);
		
		
		
		
		
	}
}
