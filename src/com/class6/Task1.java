package com.class6;
import java.util.Scanner;
public class Task1 {
	public static void main (String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale --> im not shopping
		 * if sale --> check the price of the item
		 * based on the amount we will hav to calculate the price after discount
		 * if price less than 20 --> 10%
		 * if price between 20-100 -->20%
		 * if between 100-50 -->30%
		 * anything 50%
		 * after disscount___ the price of the item reduce form __ to ___
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter value true of false: ");
		boolean ans = input.nextBoolean();
		if(!ans) {
			System.out.println("not shopping");
			
		}else {
			System.out.println("wahts the price");
			double price = input.nextDouble();
			double discount;
		
			if (price < 20) {
			discount=(price-price*.1);
			System.out.println("the 10 percent price is: "+ discount + "you saved " + price*.1);
		}else if(price >=20 && price <100) {
			discount=(price-price*.2);
			System.out.println("the 20 percent price is: "+ discount + "you saved " + price*.2);
		}else if(price>=100 && price<500) {
			discount =(price-price*.3);
			System.out.println("the 30 percent price is: "+ discount + "you saved " + price*.3);
		}else {
			discount=(price-price*.5);
			System.out.println("the 50 percent price is: "+ discount + "you saved " + price*.5);
		}
		
		
	}

	}}
