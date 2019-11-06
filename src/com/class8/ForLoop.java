package com.class8;

public class ForLoop {
	
	
	public static void main(String[] args) {
		
		//saying good night 5 times
		for (int i=0; i<=4; i++) {
			System.out.println("good night");
		}
		System.out.println("--------");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		//print numbers from 10-1
		for (int i=10; i>=10; i--) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		for (int i=0; i<=50; i+=5) {
			System.out.println(i);
		}
		
	}
}
