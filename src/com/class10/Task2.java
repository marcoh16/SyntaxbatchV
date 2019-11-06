package com.class10;

public class Task2 {

	public static void main(String[] args) {
		String[] countries = {"bolivia", "usa","japan"};
		for (int i=0; i<countries.length; i++) {
			if(countries[i].equals("bolivia") || countries[i].equals("usa")){
				System.out.println("santa cruz "+ " dc " );
			}else {
				System.out.println("tokyo");
			}
			}
		
		System.out.println("----------");
		
		String[] count = {"bolivia", "usa", "japan"};
		for (int b=0; b<count.length; b++) {
			switch(count[b]) {
			case "bolivia":
				System.out.println("santa cruz");
				break;
			case "usa":
				System.out.println("DC");
				break;
			case "japan":
				System.out.println("tokyo");
				break;
				
			}
		}
		
		
		}
	
		
	}

