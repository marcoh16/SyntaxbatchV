package com.class6;
import java.util.Scanner;
public class ScannerSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch(country) {
		
		case "Turkey":
			foodName="kebab";
			break;
		case"Ethiopia":
			foodName="Tibs";
			break;
		case"morocco":
			foodName="Tajin";
			break;
		default:
			foodName="unkwon";
		
		
		}
		System.out.println("your are from "+ country + "favorite food is: " + foodName);
	}

}
