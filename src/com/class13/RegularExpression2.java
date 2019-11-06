package com.class13;

public class RegularExpression2 {

	
	public static void main(String[] args) {
		
		String str = "today is our java class";
		
		System.out.println(str.replace(" ", ""));
		System.out.println("============");
		
		System.out.println(str.replaceAll("\\s", ""));
		
		
		String doc ="f you like GeeksforGeeks and would like to contribute, you can also write an article using contribute."
				+ "geeksforgeeks.org or mail "
				+ "your article to contribute@geeksforgeeks.org. "
				+ "See your article appearing on the GeeksforGeeks main page and help other Geeks. ";
		
		
		System.out.println();
		
	}
}
