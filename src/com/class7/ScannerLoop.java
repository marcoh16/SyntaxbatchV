package com.class7;
import java.util.Scanner;
public class ScannerLoop {

	public static void main(String[] main) {
		/*ask user to enter name 
		 * and our output should be "good afternoon"
		 */
		
		Scanner input;
		
		
		
		input = new Scanner(System.in);
		
		int i=5;
		while(1<10) {
		
		
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		
		
		
		System.out.println("Good afternoon " + name);
		
		i ++;
		
		
		}	
	}
}
