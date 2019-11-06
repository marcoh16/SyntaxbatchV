package com.class8;
import java.util.Scanner;
public class WhileExample {

	public static void main(String[] main) {
		/*lets ask user to enter if it is raining or nont (true or false)
		 * as long as there is rain lets keep asking
		 * as soon as there is no rain--> you can go to the park
		 * 
		 */
		Scanner input;
		boolean isRain;
		input = new Scanner(System.in);
		
		do {
			System.out.println("is it raining ");
			isRain=input.nextBoolean();
			
		}while(isRain);
		
		System.out.println("go to the park");
		
	}
}
