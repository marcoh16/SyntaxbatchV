package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		nums[4]=16;
		//way to find number of elements we use with .length
		System.out.println(nums.length);
		
		System.out.println("----------------");
		//another to declare arrays
		
		String[] array = {"winter", "fall", "summer", "spring"};
		System.out.println("I was born in "+array[2]);
		
		//finding out array size with .length
		int arraySize = array.length;
		System.out.println(arraySize);
		
		
		
	}
}
