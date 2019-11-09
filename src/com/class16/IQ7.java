package com.class16;

public class IQ7 {
	
	public static void main(String[] args) {
		
	/*write a java program to check wether a given number 
	 * is prime or not
	 * Prime: is a number that has to meet 2 conditions:
	 * it should be divisible by 1 and itself only
	 * 2, 3, 5,. 7, 11, 13, 17, 19, 23
	 */
		
		//take a range of numbers from 2 to 100 and print all prime
		//2, 3, is 3 divisible(2,3)
		
		int num = 5;
		boolean isPrime = true;
		
		if (num == 0 || num == 1) {
			//or you can use if(num<1)
			isPrime=false;
		
		
		
		for (int i=2; i<num; i++) {
			//this if condition checks the loop condition starting from 2
			//using the i
				if(num%i == 0) {
					isPrime=false;
					break;	
				}	
			}
		}
		if (isPrime) {
			System.out.println(num + ": is a prime number");
		}else {
			System.out.println(num + ": is not a prime number");
		}
		
	}

}
