package com.class7;

public class WhileLoopPractice {
public static void main(String[] args) {
	//How to print numbers 1 to 20
	
	int i = 0;
	
	while(i<=20) {
		System.out.println(i);
		i++;
	}
	System.out.println("----------");
	//print numbers 10 to 30 all in one line
	int y=30;
	while(y<=30) {
		
		System.out.print(y+" ");
		y++;
	}
	
	System.out.println("----------");
	//how to print value 10 to 1
	int a = 10;
	
	while(a>1) {
		System.out.println(a);
		a--;
	}
	System.out.println("----------");
	
	//print value from 50 to 20
	int e=50;
	while(e>=20) {
		System.out.println(e);
		e--;
	}
	System.out.println("----------");
	//i want to print all even numbers from 1 to 20
	//1 way increment value by
	
	int z=2;
	
	while(z<=20) {
		System.out.println(z);
		z+=2;	
	}
	//2 way using modulus
	System.out.println("----------");
	int q=1;
	while(q<=20) {
		System.out.println(".");
		if (q%2==0) {
			System.out.println(q);
			
			
		}
		q++;
	}
	
	
	
	
	
}
}
