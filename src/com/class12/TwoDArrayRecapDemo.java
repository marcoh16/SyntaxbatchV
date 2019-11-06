package com.class12;

public class TwoDArrayRecapDemo {
	
	public static void main(String[] args) {
		
		int [][] array = new int[2][3];
		//first row
		array [0][0]=9;
		array [0][1]=10;
		array [0][2]=11;
		
		array [1][0]=9;
		array [1][1]=10;
		array [1][2]=11;
		
		
		for (int i[]:array) {
			
			for (int b: i) {
				System.out.println(b);
			}		
		}
		System.out.println("===============");
		//Another way to do 2D arrays ADVANCE FOR LOOP
		int [][] array2 = {{44, 55,67},{11,22,33},};
		for (int[] is:array2) {
			for (int is2: is) {
				System.out.println(is2);
			}
		}
		
		
		
		
		
	}
	
	

}
