package com.class10;

public class GetAllValues {
	public static void main(String[] args) {
		
		String[] animals = {"cat", "cow", "dog","snake", "elephant"};
		//print all values from array
		//when value is dog---> i love dogs
		
		for (int i=0; i<animals.length; i++) {
			if (animals[i].contentEquals("dog")) {
				System.out.println("i love dogs ");
				
			}else {
			System.out.println(animals[i]);
			}
		
		}
	}

}
