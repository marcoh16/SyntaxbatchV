package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		//REVERSING STRING AND CHARACTERS USING DIFFENT METHODS!!!!!!!!!
		
		
		/*write a java program to reverse a string
		 * reverse a string word by word
		 * 
		 * 
		 */
		String given = "Welcome to the java class";
		/*to reverse String
		 * split()
		 * step1: split-->array of string
		 * step2: use for loop and use decrement to print values
		 * THIS CODE REVERSES THE SENTECE OF THE STRING
		 */
		String[] str = given.split("\\s");
		for (int i=str.length-1; i>0; i--) {
		System.out.println(str[i]);
				
		}
		
		System.out.println("------");
		String reverse = "";
		for (int j=str.length-1; j>=0; j--) {
			reverse = reverse+str[j] + " ";
		}
		System.out.println(reverse);
		System.out.println("------");
		//THIS CODE REVERSES THE SENTECE OF THE STRING
		//since is -=2 takes out the java part
		String reversed = "";
		for (int z=str.length-1; z>=0; z-=2) {
			reversed = reversed + str[z] + " ";
		}
		System.out.println(reversed);
		System.out.println("------");
		
		//2nd part
		//write a java program to reverse a string
		//toCharArray(); charAt();
		//THIS CODE REVERSES EVERY CHARACTER OF THE STRING 
		String given1 = "today is java class";
		char[] charArray = given.toCharArray();
		for(int b=charArray.length-1; b>=0; b--) {
			System.out.println(charArray[b]);
		}
		System.out.println("-------");
		//REVERSING USING CHARAT() METHOD
		String word3 = "i love java";
		for (int c=word3.length()-1; c>=0; c--) {
			System.out.print(word3.charAt(c));
		}
		
	}
}
