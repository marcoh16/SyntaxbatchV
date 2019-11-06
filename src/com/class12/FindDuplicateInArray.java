package com.class12;

public class FindDuplicateInArray {
	
	public static void main(String[] args) {
		
		int [] array = {2,4,5,7,2,5,7};
		for (int i=0; i<array.length; i++) {
			for (int b=i+1; b<array.length; b++) {
				if(array[i]==array[b]) {
					System.out.println(array[b]);
				}
			}
		}
		
		
	}

}
