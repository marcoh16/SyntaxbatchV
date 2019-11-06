package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
		
		
	
		
		//1 way 
		int[] b;//declaring array preferred way
		
		//2 way of declaring an array
		int c[];
		
		//1 way
		b=new int[4];
		//2 way 
		int[] array = new int[4];
		array [0]=10;
		array [1]=20;
		array [2]=30;
		array [3]=40;
		//how to access this values from the array
		System.out.println(array[2]);
		
		//create an array that will store classes
		String[] classes = new String[4];
		classes[0]="java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="Git";
		
		//today we have java class
		System.out.println("Today we have " + classes[0] + " class");
		
		System.out.println("-----------------");
		
		//they way to declare and assig arrays
		int[] nums = new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how to change 1 to 100
		
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		System.out.println("-----------------");
		
		//array of strings
		String[] names = new String[4];
		names[0]="diana";
		names[1]="seda";
		names[2]="jaime";
		names[3]="olga";
		
		System.out.println(names[3]);
		
		System.out.println("-----------------");
		//array of integers
		double [] numbers = new double[4];
		numbers [1]=100;
		numbers [3]=200;
		System.out.println(numbers[1]);
		
		
		
		
	}

}
