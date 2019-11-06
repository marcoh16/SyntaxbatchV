package com.class14;

public class task2 {

	public static void main(String[] args) {
		int arr [] = {10, 12, 55,32,66,44,30, 78};
		
		int min = arr[0];
		int max = arr[0];
		int second = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				second = max;
				max = arr[i];
			}else if (arr[i] > second) {
				second = arr[i];
				
			}
			else if (arr[i]> second){
				min = second;
			}
		}
		System.out.println(min);
		System.out.println(second);
		System.out.println(max);
		
		
		
	}
}
