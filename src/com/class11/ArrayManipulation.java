package com.class11;

import java.util.Arrays;


public class ArrayManipulation {
	public static void main(String[] args) {
String [] actualNames = {"marco", "jorge","jade"};
//a way to sort an array
Arrays.sort(actualNames);
String [] expectedNames = {"smith", "nessi", "neymar"};
//A way to sort an array
Arrays.sort(expectedNames);


System.out.println(Arrays.toString(actualNames));
System.out.println(Arrays.toString(expectedNames));


System.out.println("-----------");

String actual = Arrays.toString(actualNames);
String expected = Arrays.deepToString(expectedNames);

System.out.println(actual.equals(expected));

System.out.println("------------");


int [] numbers = {245,115,12, 34, 55, 66,99};
Arrays.sort(numbers);
for (int i:numbers) {
	System.out.println(i + " ");
}
System.out.println("------------");

int [] nums = {245,115,12, 34, 55, 66,99};

for (int i:nums) {
	System.out.println(i + " ");
}


	}
	
}





