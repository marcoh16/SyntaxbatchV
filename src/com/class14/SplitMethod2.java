package com.class14;

public class SplitMethod2 {
	public static void main(String[] args) {
		
		String str = "if you come to class early, "+
		"then you can study more, also you can learn more,"+
				"and you can leave early";
		
		String [] array = str.split(",");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i].trim());
		}
		
		String str1 = "welcome to syntax technologies";
		String[] array2 = str1.split("to",3);
		System.out.println(array2.length);
		
		for (int b=0; b<array2.length; b++) {
			System.out.println();
		}
		
		
	}

}
