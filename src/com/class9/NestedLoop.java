package com.class9;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			System.out.println("Im a outer loop: " + i);
			for (int j=1; j<=3; j++) {
				System.out.println("I am inner loop" + j);
			}
			
			
		}
		
		
	}
}
