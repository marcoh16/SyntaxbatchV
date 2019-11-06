package com.class12;
import java.util.Scanner;
public class Task1 {
	
	public static void main(String[] args) {
		int [] array2 = {2,5,4,7};
		
		for (int i:array2) {
			System.out.println(i);
		}
		int [] arr = new int[3];
		Scanner scan = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
			
			//fix it up, a way to pull out an expecific number from array
			System.out.println("----------");
			
			int [] array3 = {2,5,4,7};
			
			for (int b:array3) {
				if (b==4)
			
				System.out.println(b);
			}
			
		}
		
	}


