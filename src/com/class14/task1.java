package com.class14;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*create a string that will hold a sentence. 
		 * write a program to get a new string without spaces
		 * 
		 */
		
		String str = "welcome to the class, are you ready to learn";
		System.out.println(str.replaceAll(" ", ""));
		
		System.out.println("----------");
		/*create a string that should be a combination of letters, numnbers
		 * and special characters. finout how many alpha characters are there in the string
		 * 
		 */
		String str2 = "hello marco, 123456 ^%&%*";
		String str3 = str2.replaceAll("[^A-Z a-z]", "");
		System.out.println(str3.length());
		
		System.out.println("----------");
		/*you have a string a="is it saturday? is it raining? do we have a java class today?
		 * how would you find out how many sentences are in that string
		 */
		
		String a = "is today saturday? is it sunny, do we have a java class";
		String [] array = a.split("\\?");
		System.out.println(array.length);
		
	}

}
