package com.class6;

import java.util.Scanner;

public class SwitchAndScanner {
	public static void main(String[] args) {
		/*ask user to enter their gender F or M
		 * based on the input provide
		 * if F -->Female
		 * if M -->Male
		 * otherwise -->unknown
		 * 
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("please enter gender F or M");
		char ans = input.next().charAt(0);
		String userGender;
		
		switch(ans) {
		
		
		case'F':
			userGender="Female";
			break;
		case'M':
			userGender="Male";
			break;
		default:
			userGender="invalid";
		}
		System.out.println("your gender is " + userGender);
	}
}
