package com.class11;

public class Task2 {
	public static void main(String[] args) {
		
		int [][] array = {{2,3,4,5},{6,7,8,9},{2,3,4,9},};
		
	
		for (int i=0; i<array.length; i++) {
			for (int r=0; r<array[i].length; r++) {
				System.out.print(array[i][r]);
				
			}
			System.out.println();
		}
		
		System.out.println("------");
		int sum = 0;
		for (int i=0; i<array.length; i++) {
			for (int r=0; r<array[i].length; r++) {
				
				sum=sum+array[i][r];
			}

		}
		int sum1=0;
		System.out.println(sum);
		System.out.println("------");
		for (int nums[]: array) {
			for (int getNum:nums) {
				if (getNum%2==0) {
					System.out.println(getNum + " is even");
				}
				sum1 = sum1+getNum;
			}
		}
		System.out.println(sum1);
		
		
	}

}
