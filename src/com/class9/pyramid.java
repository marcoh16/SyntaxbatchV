package com.class9;

public class pyramid {

	public static void main(String[] args) {
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for (int i=1; i<=5; i++) {
			for (int b=1; b<=i; b++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println("------------------");
		/*1
		 *12
		 *123
		 *1234
		 *12345
		 *123456
		 *1234567
		 *12345678
		 *123456789
		 */
		for (int z=1; z<=9; z++) {
			for (int x=1; x<=z; x++) {
				System.out.print(x);
			}
			System.out.println();
		}
		/*1
		 *22
		 *333 
		 *4444
		 *55555
		 *666666
		 *7777777
		 *88888888
		 *999999999
		 * 
		 * 
		 */
		System.out.println("------------------------");
		for (int c=1; c<=9; c++) {
			for (int v=1; v<=c; v++) {
				System.out.print(c);
			}
			System.out.println();
			
		}
		System.out.println("-----------------------");
		
		/*9
		*88
		*777
		*6666
		*55555
		*444444
		*3333333
		*22222222
		*111111111
		*/
		
		for (int b=9; b>=1; b--) {
			for (int n=9; n>=b; n--) {
				System.out.print(b);
			}
			System.out.println();
		}
		
	}
}
