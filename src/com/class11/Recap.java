package com.class11;

public class Recap {
	public static void main(String[] args) {
		//array declaration
		int [] h = new int[3];
		int e[];
		
		
		
		
		System.out.println("----------");
		//retrieving values
		int[] numberList = {2,3,5,7};
		for (int g=0; g<numberList.length; g++ ) {
			System.out.println(numberList[g]);
		}
		System.out.println();
		
			//ANOTHER WAY OF DOING FOR LOOP
		for (int elemen:numberList) {
			System.out.println(elemen);
		}
		System.out.println("---------");
		

		
	
	}

}
