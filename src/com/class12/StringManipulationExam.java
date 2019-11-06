package com.class12;

public class StringManipulationExam {
	public static void main(String[] args) {
		
		String str2 = "its very hot in the class";
		//startsWith
		System.out.println("is this string starts with: "+ str2.startsWith("it"));
		System.out.println("is this string starts with: "+ str2.startsWith("It",3));
		
		System.out.println("---------");
		
		//ends.With
		System.out.println("is this strin starts with: "+ str2.endsWith("class"));
		
		System.out.println("---------");
		//method weather string is empty or not
		//isEmpty();
		String word = "";
		System.out.println("Is this string empty "+ word.isEmpty());
		
		String word2 = "hello";
		System.out.println("Is this string empty "+ word2.isEmpty());
		
		System.out.println("---------");
		//if(!word.isEmpty()) {
		//	System.out.println("this is not empty");
		//}else {
		//	System.err.println("this is empty String");
		//}
		System.out.println("---------");
		
		String sentence = "each day has a promise to brigthen up the day, \n but first you must allow to come your way";
		System.out.println(sentence);
		
		System.out.println("---------");
		
		//this method appends one string to the end of another.
		//.concat
		String str3 = "hello ";
		String str4 = "world";
		String str5 = " people";
		System.out.println(str3.concat(str4).concat(str5));
		
		System.out.println("---------");
		
		//this method returns a copy of the string with leading and trailing whitespace omited
		
		String str6 = " how are you ";
		System.out.println(str6.trim());
		
		System.out.println("---------");
		
		//method returns character located at the string specified index
		// the string indexes start from 0
		
		String str7 = "we might be done early today ";
		System.out.println(str7.charAt(7));
		
		System.out.println("---------");
		
		//this method returns the index within this string of the 
		//first occurrence of the specified character or -1
		//if the character does not occur
		
		String str8 = "we might mnot be done early ";
		System.out.println(str8.indexOf("w"));
		System.out.println(str8.indexOf('m', 4));
		
		
		
		
		
		
		
		
	}

}
