package com.class4;

public class Task1 {
	public static void main(String[] args) {
		boolean diploma=true;
		double score =3.7;
		
		if (diploma) {
			System.out.println("congras");	
			if (score>=3.5) {
				System.out.println("eligle for schollarship ");
			}else {
				System.out.println("studied harder");
			}
		}else {
			System.out.println("get a degree");
		}
		
		
		System.out.println("----------------");
		
		double rate=5.5;
		int price=200;
		
		if (rate>4.5) {
			System.out.println("user will not buy a house");
		}else {
			System.out.println("user will buy a house");
		
			if(price>2000) {
				System.out.println("ill take a loan");
			}else {
				System.out.println("ill pay cash");
			}
		
		}
		
	}
}
