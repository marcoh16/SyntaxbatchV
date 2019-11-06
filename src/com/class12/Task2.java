package com.class12;

public class Task2 {
	public static void main(String[] args) {
		

		//create two strings and initiolize them with some value
		//and implement the following methods on those strings
		/*sen.length();X
		 * sen.equals();X
		 * sen.contains();X
		 * sen.toUpperCase();X
		 * sen.toLowerCase();x
		 * sen.equalsIgnoreCase(anotherString);
		 */
		
		//length
		String sen = "Good Morning";
		int len = sen.length();
		System.out.println(len);
		
		System.out.println("=========");
		
		//toUpperCase
		String up = sen.toUpperCase();
		System.out.println(up);
		
		System.out.println("=========");
		//toLowerCase
		String low = sen.toLowerCase();
		System.out.println(sen);
		
		System.out.println("=========");
		//contains
		System.out.println(sen.contains("G"));
		
		System.out.println("=========");
		
		String str = "Good Afternoon";
		boolean ans = str.equals(len);
		System.out.println(ans);
		
		System.out.println("=========");
		System.out.println(str.equalsIgnoreCase(sen));
		
		
	}

}
