package com.class8;

public class Task {
	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++ ) {
			System.out.println(" " + i);
		}
		
		System.out.println("-------------");
		
		for (int b=100; b>=1; b-- ) {
			System.out.println(b);
		}
		
		System.out.println("-------------");
		
		
		for (int c=21; c<=50; c+=2) {
			System.out.println(c);
		}
		System.out.println("-------------");
		
		
		
		for (int d=20; d<=50; d++) {
			if(d % 2 != 0)
			System.out.println(d);
		}
		System.out.println("-------------");
		
		int sum = 0;
		for (int e=1; e<=5; e++) {
			sum = sum + e;
			System.out.print(sum+ "+");
			
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("-------------");
		
		int sumAll=0;
		for (int d=0; d<=20; d+=5) {
			
			sumAll=sumAll+d;
		}
		System.out.println(sumAll);
		
		
		System.out.println("-------------");
		
		int total=2;
		for (int y=1; y<=3; y++) {
			total = total*y;
				
		}
		System.out.println(total);
		System.out.println("-------------");
		
		
		
	}

}
