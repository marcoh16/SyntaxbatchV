package com.class6;
import java.util.Scanner;
public class ClassTask {
	public static void main(String[] args) {
		/*ask user to enter month they were born
		 * based on month defne the season
		 * if user is born in jan, feb, dec-->winter
		 * if mar, apr, may--> spring
		 * if jun, jul, aug,--> summer
		 * if sep, oct, nov--> fall
		 * otherwise --> unknown
		 * at the end of the program 
		 * "you were born in____"
		 */
		
		Scanner input;
		String month;
		String season;
		input = new Scanner(System.in);
		System.out.println("Enter month you were born: ");
		month=input.nextLine();
		
		if (month.equals("january")|| month.equals("february")|| month.equals("december")) {
			season="winter";
		}else if(month.equals("march")|| month.equals("april")|| month.equals("may")) {
			season="spring";
		}else if(month.equals("june")|| month.equals("july")|| month.equals("august")) {
			season="summer";
		}else if (month.equals("september")|| month.equals("october")|| month.equals("november")) {
			season="fall";
		}else {
			season="invalid";
		}
		
		System.out.println("you were born in: " + season + " in: " + month );
		
		
	}

}
