package com.class8;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		for (int i=0; i<=50; i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------------");
		
		String card;
		Scanner input = new Scanner(System.in);
		
		
		for (int a=0; a<=10; a++) {
			System.out.println("do you want credit card");
			card = input.nextLine();
				if(card.equals("yes")){
					break;
				}
		}
		
		
	}
}
