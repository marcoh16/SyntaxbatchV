package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

//Collection

public class recap {

	public static void main (String[] args) {
	
	ArrayList<Integer>numbers = new ArrayList<>();
	numbers.add(1);
	numbers.add(10);
	numbers.add(100);
	numbers.add(10000);
	
	int size = numbers.size();
	System.out.println(size);
	
	numbers.add(10000);
	numbers.remove(size-1);
	numbers.remove(1);
	
	System.out.println(numbers);
	
	//retrieve value from an arraylist

	int element = numbers.get(0);
	System.out.println(element);
	
	//one way for loop
	for(int i=0; i<numbers.size(); i++){
		System.out.println(numbers.get(i));
		
	}
	System.out.println("-----");
	//second way enhance loop
	for(int num:numbers) {
		System.out.println(num);
	}
	System.out.println("-----");
	

	//I want to get values backward
	for(int i=numbers.size()-1; i>=0; i--) {
		System.out.println(numbers.get(i));
}
	System.out.println("-----");
	//3 using iterator
	Iterator<Integer> iterator = numbers.iterator();
	
	while(iterator.hasNext()) {
		int number = iterator.next();
		if (number%2==0) {
			System.out.println(number);													
		}
		System.out.println(iterator.next());//or
	}
	
}
}

