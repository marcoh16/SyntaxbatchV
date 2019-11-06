package com.class7;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num1, num2;
		int total;
		char op;
		
		System.out.println("Please enter a number");
		num1 = scan.nextInt();
		System.out.println("please enter operator");
		op = scan.next().charAt(0);
		System.out.println("Second number");
		num2 = scan.nextInt();
		
		switch(op) {
	
		case '*':
			total = num1 * num2;
			break;
		case'/':
			total = num1 / num2;
			break;
		case'+':
			total = num1 + num2;
			break;
		case'-':
			total =num1 - num2;
			break;
			default:
				System.out.println("wrong operator");
			
			
			
			
		}
		
		
		
		
	}

}
