package com.class8;

public class Task2 {
	public static void main(String[] args) {
		/*write a code to find the sum of even and & odd numbers
		 * from range 1 - 20
		 * expecting 2 outputs
		 * sum for odd nums=
		 * sum for even nums=
		 */
		
		int sumEven=0;
		int sumOdd=0;
		
		
		for (int i=1; i<=20; i++) {
			if (i%2 == 0) {
				sumEven=sumEven + i;
				
			}else {
				sumOdd=sumOdd + i;
				
			}

		}
		
		System.out.println("The total of all even numbers are: " + sumEven);
		System.out.println("The total of all odd numbers are: " + sumOdd);
		
		
	}

}
