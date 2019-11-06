package com.class11;

public class Task1 {

	public static void main(String[] args){
		String [] array = {"toyota", "ferrai", "mazda", };
		for (int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		
		//another way of doing for loop
		for(String a:array) {
			System.out.println(a);
		}
		
		System.out.println("-------------");
		
		int [] num = {3,5,7,9,11,13};
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum = sum + num[i];
			
		}
		System.out.println(sum);
	
		System.out.println("-------------");
		
		String[] co = {"bolivia", "japan", "colombia", "mexico"};
		for (int i=0; i<co.length; i++) {
			switch (co[i]) {
			case "bolivia":
				System.out.println("santa cruz");
				break;
			case "japan":
				System.out.println("tokyo");
				break;
			case "colombia":
				System.out.println("medellin");
				break;
			case "mexico":
				System.out.println("jalisco");
				break;
			
			}
			System.out.println("-------------");
			//ANOTHER WAY OF FOR LOOP
			for (String element:co) {
				if (element.equals("bolivia")) {
					System.out.println("santa cruz");
				}else if(element.equals("japan")) {
					System.out.println("tokyo");
				}else if(element.equals("colombia")) {
					System.out.println("medellin");
				}else if (element.equals("mexico")) {
					System.out.println("jalisco");
				}
			}
			
		}
}
}
