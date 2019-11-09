package com.class16;

public class StringEquality {

	
	public static void main(String[] args){
		
		//when using string and COMPARE them make sure to use 
		//.equals() DO NOT USE == method.
		String str = "Hello";
		String str1 = "Hello";
		String str2 = new String ("Hello");
		
		
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		
		
		System.out.println("=======");
		System.out.println(str == str1);
		System.out.println(str ==str2);
	}
}
