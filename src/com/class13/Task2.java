
package com.class13;
import java.util.Scanner;
public class Task2 {
	
	public static void main(String[] args) {
		
		String reverse = "Sunday";
		String reverse2 = "";
		
		for(int i=reverse.length()-1; i>=0; i--) {
			reverse2 = reverse2 + reverse.charAt(i);
		}
		
		System.out.println(reverse2);
		
		System.out.println("=============");
		//another way
		System.out.println(reverse.charAt(5)+""+reverse.charAt(4)+""+ reverse.charAt(3) +""+ reverse.charAt(2)+""+ reverse.charAt(1)+""+ reverse.charAt(0) );
		
		System.out.println("=============");
		//anotehre way
		System.out.println(reverse.length());
		
		for(int b=reverse.length()-1; b>=0; b--) {
			System.out.println(reverse.charAt(b));
			
		}
		
		
		System.out.println("=============");
		//task 2
		/*create a string and if the string is not empty perform the 
		 * following: if the string has an odd number of characters
		 * and has 3 or mor characters, print the character in the middle of the 
		 * string
		 * 
		 */
		String str1 = "Hellourwewr";
		int length = str1.length();
		int middle = str1.length()/2;
		System.out.println();
		if (!str1.isEmpty()) {
			if (length %2 !=0 && length>=3) {
				System.out.println(str1.charAt(middle));
			}
		}
		
		
		
		
		
	}
	
	

}
