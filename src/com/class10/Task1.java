package com.class10;

public class Task1 {

	public static void main(String[] args) {
		String[] characters = {"A", "B", "C","D"};
		System.out.println("your grade is "+characters[1]);
		
		String[] letter = new String[4];
		letter[0]="A";
		letter[1]="B";
		letter[2]="C";
		letter[3]="D";
		System.out.println("Current grade is " + letter[1]);
		System.out.println("-----------------");
		//using for loop
		for (int i=0; i<letter.length; i++) {
			System.out.println(letter[i]);
		}
		
		
		System.out.println("---------------");
		
		String[] names = {"marco ","jade ", "francis ","jorge "};
		System.out.println("yoyr name is: "+names[0]);
		System.out.println("---------------");
		
		for (int b=0; b<names.length; b++) {
			System.out.print(names[b]);
		}

		
		String[] secondName = new String[4];
		secondName[0]="marco";
		secondName[1]="jade";
		secondName[2]="francis";
		secondName[3]="jorge";
		System.out.println("your daughters name is: "+secondName[1]);
		
		System.out.println("---------------");
		 
		String [] words = {"java ", "saturda ", "day coding ", "is "};
		System.out.println(words[1]+ words[3]+ words[0]+ words[2]);
		
		String[] second = new String[4];
		second[0]="java ";
		second[1]="saturday ";
		second[2]="day coding ";
		second[3]="is ";
		System.out.println(second[1]+second[3]+second[0]+second[2]);
		System.out.println("---------------");
		
		double[] nums = {20, 30, 40, 50, 60};
		for (int x=0; x<nums.length; x++) {
		System.out.print(nums[x]+ ", ");
		}
	}
}
