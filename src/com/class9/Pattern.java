package com.class9;

public class Pattern {

	public static void main(String[] args) {
		//***
		for (int k=1; k<=5; k++) {
			for (int i=1; i<=5; i++) {
				System.out.print("*");
			}
			System.out.println();
			}
		System.out.println(" -----------");
		
		for (int a=1; a<=5; a++) {//takes care of the rows
			for (int b=1; b<=7; b++) {//takes care of the columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------");
		/*12345
		 *12345
		 *12345 
		 *12345
		 *12345 
		 */
		
		for (int z=1; z<5; z++) {
			for (int q=1; q<6; q++) {
				System.out.print(q);
				
			}
			System.out.println();
		}
		System.out.println("------------");
		/*11111
		 *22222
		 *33333
		 *44444
		 *55555
		 */
		
		for (int z=1; z<6; z++) {
			for (int q=1; q<6; q++) {
				System.out.print(z);
				
			}
			System.out.println();
		}
		/*123456789
		 *123456789 
		 *123456789 
		 *123456789 
		 *123456789 
		 */
		
		System.out.println("------------");
		for (int r=1; r<=5; r++) {
			for (int t=1; t<=9; t++) {
				System.out.print(t);
			}
			System.out.println();
		}
		
		
		System.out.println("------------");
		/*55555
		 *44444 
		 *33333 
		 *22222
		 *11111 
		 */
		
		for (int y=5; y>0; y--) {
			for (int u=5; u>0; u--) {
				System.out.print(y);
			}
			System.out.println();
		}
		
	}
		
}
