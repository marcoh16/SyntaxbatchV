package com.class16;

public class IQ3 {
	public static void main(String[] args) {
		
		/*find out how many alpha characters present in a string
		 * 
		 * 
		 * 
		 */
		String str = "Hello *^*^%, welcome to classgyuuygg";
		str = str.replaceAll("[^A-Za-z]", "");
		
		System.out.println(str.length());
		
		
	}

}
