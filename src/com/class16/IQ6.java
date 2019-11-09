package com.class16;

public class IQ6 {
	
	
	public static void main(String[] args) {
		/* write a java program to find wether a string is palindrome or not
		 * if reversed string and original string are same--> string palindrome
		 * mom, dad, madam, racecar, kayak, bob
		 * 
		 * logic: 
		 * step1: reverse the string
		 * step2: compare 2 strings
		 * if strings are equal --> palindrome
		 * else--> not palindrome
		 * 
		 */
		
		String original = "kayak radar kayak";
		String reversed = "";
		//5-1
		for (int i=original.length()-1; i>=0; i--) {
			reversed = reversed + original.charAt(i);//""+k=k+a=ka+k
			
		}
		
		System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("string is palimdrome");
		}else {
			System.out.println("string is not palindrome");
		}
		
		
	}

}
