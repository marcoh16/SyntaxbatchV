package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("Bye");
		String str4 = new String("Bye");
		
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4);
		//what is the difference between == and .equals
		//== compares two objects
		//.equals both content must be the same
		System.out.println("==================");
		
		//new methods startsWith
		String str5 = "Today is saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("==================");
		//.Concat
		System.out.println(str5.concat(" and we have java class"));
		
		System.out.println("==================");
		//.trim
		String str6 = "    it is sunny    ";
		System.out.println("before triming "+ str6);
		System.out.println(str6.trim());
		
		System.out.println("==================");
		
		//index of ChartAt
		String str7 = "tomorrow we will be done with string manipulation";
		
		System.out.println(str7.indexOf('E'));
		System.out.println(str7.indexOf('e', 11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
		
		
	}
}
