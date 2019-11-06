package com.class4;
import java.util.Scanner;
public class Task3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("what is your age? ");
	int num=input.nextInt();
	
	if (num>18) {
		System.out.println("yoll get a license");
		
	}else {
		System.out.println("youll receive a permit");
	}
	
	
}
}
