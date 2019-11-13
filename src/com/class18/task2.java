package com.class18;
import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		task2 obj = new task2();
		obj.EvenorOdd(3);
		
		
	}
	
	
	
	void EvenorOdd(int number) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numner");
		int ans = input.nextInt();
		
		if (ans%2 == 0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
		
		
	}
		
	

}
