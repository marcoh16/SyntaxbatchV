package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		//Declare 2D array
		
		int[][] array=new int [3][4];
		
		//first row
		array [0][0]=44; 
		array [0][1]=80;
		array [0][2]=33;
		array [0][3]=20;
		
		//second row
		array [1][0]=10;
		array [1][1]=5;
		array [1][2]=7;
		array [1][3]=8;
		
		//third row
		array [2][0]=10;
		array [2][1]=9;
		array [2][2]=7;
		array [2][3]=8;
		
		System.out.println(array[1][3]);
		
		//task create 2d array of string with 2 and 3 columns
		//and print value in second row and 3rd column
		System.out.println("--------------");
		int [][] arra= {{8,7,5,3,8},//[0]
			//  (0 1 2 3 4)=9
				{1,5,6,4,9},//[1]
				{3,6,8,0,7},};//[2]
		
		System.out.println("the value in index 1 and 4 is: " + arra[1][4]);
		//gives you number of rows
		
		System.out.println("----------------");
		
		System.out.println("the number of rows: " + arra.length);
		
		System.out.println("the number of columns: "+arra[1].length);
		
		System.out.println("--------");
		
		
		for(int i=0; i<arra.length; i++) {
			for (int b=0; b<arra[i].length; b++) {
				System.out.print(arra[i][b]+" ");
				
			}
			System.out.println();
			
		}
		
		
		
	}
}
