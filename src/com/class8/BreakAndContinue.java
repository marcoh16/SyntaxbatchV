package com.class8;

public class BreakAndContinue {
	public static void main(String[] args) {
		//break, breaks the loop
		for (int i=0; i<10; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("im outside the loop");
		//current - it will skip CURRENT iteration
		
		
		//continue skips the varibles 3 and 4
		for (int b=1; b<=5; b++) {
		if (b==3 || b==4) {	
			continue;
		}
		System.out.println(b);
		}
		System.out.println("--------------");
		
		//print numbers from 1 to 20 except 5 6 and 7
		
		for (int c=1; c<=20; c++) {
			if(c==5 || c==6 || c==7) {
				continue;
			}
			
			System.out.println(c);
		}
		
		
	}

}
