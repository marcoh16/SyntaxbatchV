package com.class33;

import java.util.ArrayList;
import java.util.Iterator;


public class Homework {
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Toyota");
		cars.add("Nissan");
		cars.add("Honda");
		cars.add("BMW");
		// retrieve with for loop
		System.out.println("---For Loop---");
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("---Enhanced Loop---");
		// enhanced loop
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("---Iterator---");
		// iterator
		Iterator<String> iterator= cars.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
