package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		
		/*.replace()
		 * this method returns a new string resulting
		 * from replacing all occurrences of oldChar
		 * in this string with newChar
		 * 
		 */
		
		String str = "Hello Dear Dan, how are you, How you been? ";
		String str1 = "12-22-4444";
		
		
		System.out.println(str.replace('e', 'z'));
		System.out.println("=========");
		System.out.println(str.replace("Dear", "Respected"));
		System.out.println("=========");
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
		System.out.println("=========");
		
		System.out.println(str1.replace("-", "/"));
		System.out.println(str1.replaceAll("-", "/"));
		
		
		
	
		
		
		
		
		
	}
	
	
}
