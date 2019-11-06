package com.class14;

public class SplitMethod {
	public static void main(String[] args) {
		
		
		/*.split()
		 * this method split this string around matches of the given regular expression
		 */
		
		//splits the following string into array of string/work
		String str = " video provides a powerful way to hlep you prove your oiunt";
		
		String [] array = str.split(" ");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("++++++++++++++++");
		
		//how can we fidn how many sentences are in the following string
		String str1 ="today is sunday. its sunny day. and we are having java class";
		String [] array2 = str1.split("\\.");
		for (String string : array2) {
			System.out.println(string.trim());//you can only trim strings
			System.out.println(array2.length);
		}
		
		
	}

}
