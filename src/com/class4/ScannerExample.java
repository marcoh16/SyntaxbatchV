package com.class4;
import java.util.Scanner;

public class ScannerExample {

	
	public static void main(String[] args) {
		//scanner allows program to take inputs from user
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter any number");
		/*nextInt();-> for numbers
		 *nextLine(); Strings
		 *nextDouble();-> double
		 * 
		 */
		int number=scan.nextInt();
		System.out.println("ENTERRED NUMBER IS " + number);
		
		System.out.println("*******************");
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter your name");
		String name=input.nextLine();
		System.out.println("good afternoon " + name);
		
		
	}
}
