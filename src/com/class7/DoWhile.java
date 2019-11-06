package com.class7;

public class DoWhile {

	public static void main(String[] args)  {
		
		int num=10;
		//mostly used
		while (num<=7) {
			
			System.out.println("Hello");
			num++;
		}
		//rare
		int num1=10;
		
		do {
			System.out.println("bye");
			num++;
		}while (num1<=7);
		
		System.out.println("-----------------------");
		//print even numbers from 20 to 50 using do while
		int num3 = 20;
		while (num3 < 50) {
			System.out.println(num3);
			num3+=2;
		}
		System.out.println("-----------------------");
		
		int even =20;
		do {
			System.out.println(even);
			even+=2;
		}while(even<=50);
		
		System.out.println("-----------------------");
		
		//2way
		do {
			if (even%2==0) {
				System.out.println(even);
				
			}
			even++;
		}while(even<=49);
		
		
	}
}
