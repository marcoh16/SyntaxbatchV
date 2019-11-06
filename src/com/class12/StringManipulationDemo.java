package com.class12;

public class StringManipulationDemo {
	
	public static void main(String[] args) {
		
		//there are two ways to create string objects
		//1-String literal
		String name="jhon";
		System.out.println(name);

		
		System.out.println(name.length());
		
		//2-createing string with new key word
		String name1= new String("john1");
		
		/*this method returns the length of the string
		 * the length is equal to the number
		 * of 16-bit unicode characters in the string  
		 */
		
		//another way to print the length of the string
		int name1Len = name.length();
		System.out.println(name1Len);
		System.out.println("--------------");
		
		//STRING MANIPULATION LOWER CASE
		//this method converts all characters in to lower case
		String str = "Hello world";
		System.out.println("BEFORE: " + str);
		str = str.toLowerCase();
		System.out.println("AFTER STRING MANIPULATION: "+ str);
		
		System.out.println("-----------");
		
		//.equals()
		//this method will count everything such capitalization and content 
		String str2 = "HELlo World";
		boolean isEqual = str.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase(); 
		//this method ignores capitalization and compare the content only
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println("------------------");
		
		//upper cases
		//this method converts characters into upper case
		String str3 = "jade elizabeth";
		System.out.println("before: " + str3);
		str3= str3.toUpperCase();
		System.out.println("after: "+ str3);
		
		
		
		
		
		
		
		
	}

}
