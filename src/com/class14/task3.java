package com.class14;
import java.util.Scanner;
public class task3 {
	public static void main(String[] args) {
		
		int num, count=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		for (int i=2; i<num; i++) {
			if(num%i == 0) {
				count++;
				break;
			}
		}
		
		if (count == 0) {
			System.out.println("thi is a prime number");
		}else
		{
			System.out.println("Not a prime number");
		}
	}

}
