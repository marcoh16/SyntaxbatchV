package com.class7;
import java.util.Scanner;
public class Homework2 {

	public static void main(String[] args) {
		/*You need to ask user to pay for cofee
		 * you need to keep asking user to pay for it until
		 * entered price is equal to 5
		 * after user paid then say "enjoy yuor cofee"
		 * 
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		int price;
		do {
			System.out.println("please pay off your coffee");
			price = input.nextInt();		
		}while(price!=5);
		System.out.println("enjoy your coffee");
		
		System.out.println("-----------");
		
		//same but with while loop
		int price1;
		System.out.println("please pay for your coffee");
		price1=input.nextInt();
		
		while(price1!=5) {
			System.out.println("please pay for your coffee");
			price1=input.nextInt();
			
			
		}
		System.out.println("enjoy");
	}
	
	
	
}
