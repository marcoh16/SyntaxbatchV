package com.class9;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		int answer = 5;
		Scanner input;
		String ask;
		int again;
		
		input = new Scanner(System.in);
		System.out.println("find the lucky number: ");
		again = input.nextInt();
		
		while(again != answer ) {
			if (again > answer) {
			System.out.println("number is too large, enter again ");
			again = input.nextInt();
			
			}
			if (again < answer ) { 
			System.out.println("number is too low, enter again ");
			again = input.nextInt();
			
				}		
		}
		System.out.println("congrats you found the number");
		
		
		//DO WHILE WAY
		System.out.println("------------");
		
		int secretNumber, guessNumber;
		input = new Scanner(System.in);
		secretNumber = 12;
		
		do {
			System.out.println("please enter the numner");
			guessNumber=input.nextInt();
			if (guessNumber < secretNumber) {
				System.out.println(" too small ");
			}else if (guessNumber > secretNumber) {
			System.out.println("is too hight");
			
			}else {
				System.out.println("congrats you found it");
			}
			
		}while (guessNumber != secretNumber );
		
		
		
		
		
		
			}
		
		
	
			}
	
			
			

			
		
		
		
		
			
	
	
		
	

