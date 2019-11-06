package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		//print only text and not numbers
		String str = "123144lskfjas;lkfalf";
		//leaving only txts
		System.out.println(str.replaceAll("[0-9]", "") );
		//code to leave only numbers
		System.out.println(str.replaceAll("[a-zA-Z]", ""));
		
		
		//Remove everything except text and numbers
		String str2 = "Hi0qw87er0q98r7q8How5677";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
		
		System.out.println(str2.replaceAll("Hi", ""));
		System.out.println(str2.replaceAll("\\W", ""));
	}
}
