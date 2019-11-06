package com.class4;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("please enter amount of loan needed");
		int num1=keyboard.nextInt();
		
		if (num1<200000) {
			System.out.println("you will get the load");
			
		}else {
			System.out.println("you will not get the loan");
		}
		
		
		
	}
}
