package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//array list of even numbers from 1 to 50
//using iterator remove any number that is divisible by 5
public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//only storing even numbers using loop
		//crating object of arrayList and referring to the list
		List<Integer> numbers = new ArrayList<>();
		for(int i = 1; i<=50; i++) {
			if (i%2 == 0) {
				numbers.add(i);
			}
		}
	System.out.println(numbers);
	//removing number that are divisible by 5 using iterator
	Iterator<Integer> it = numbers.iterator();
	while(it.hasNext()) {
		if(it.next()%5==0) {
			it.remove();
		}
	}
	System.out.println(numbers);
	}

}
