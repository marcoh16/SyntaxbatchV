package com.class7;
import java.util.Scanner;
public class Homework {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter 3 different numbers");
	
	double no1 = scan.nextDouble();
	double no2 = scan.nextDouble();
	double no3 = scan.nextDouble();
	
	
	
	if (no1 != no2 || no2 != no3) {
		if (no1 > no2) {
		
	if(no1 > no3) {
		System.out.println("largerst number is first"+ no1);
	}else {
		System.out.println("largest number is third "+ no3);
	}
	}else {
	if (no2 > no3) {
		System.out.println("Largerst number is seod " + no2);
	}else {
		System.out.println("largest number is third "+ no3);
	}
}
}else {
	System.out.println("equal numbers");
}
}	
}
