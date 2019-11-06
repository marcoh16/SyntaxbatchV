package com.class13;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		//Practicing ignore case, upper case, lowercase
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your class day: ");
		String day = scanner.nextLine();
		//fixes the spaces you take
		if(day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your java class");
			//using the ignore case method
		}else if(day.trim().equalsIgnoreCase("sunday")) {
			System.out.println("Sunday is your git class");
			//using the uppercase method
		}else if(day.trim().toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC class");
			
		}else if(day.trim().equalsIgnoreCase("thursday")) {
			System.out.println("Thursday is your Manual Testing class");
		}else {
			System.err.println("Invalid Entry! Please enter a valid class day");
		}
		scanner.close();
		
		
	}

}
