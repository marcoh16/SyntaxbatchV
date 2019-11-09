package com.practice;

public class practice1 {

	public static void main (String[] args) {
		
		//find out largest, second largest, and lowest number in the array
		int [] num = {10, 20, 40, 50, 60, 70, 80, 100};
		int max = num[0];
		int middle = num [0];
		int min = num [0];
		
		
		for (int i=0; i<num.length; i++) {
			if (num[i]>max) {
				middle = max;
				max = num[i];
			}else if (num[i] > middle) {
				middle = num[i];
			
			}else if(num[i] < min) 
				min= num[i];
				
		
			
		
		}
		System.out.println("the largest number is: " + max);
		System.out.println("the second largest number is: "+ middle);
		System.out.println("the lowest numbet is: " + min);
		
	}
}
