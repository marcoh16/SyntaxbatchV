package com.class34;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		//create a collection that will store sweets type of objects
		//the order doesnt matter as long as i do not have duplicate objects
		
		Set<Sweets> sweetSet = new HashSet<>();
		
		Sweets sweet = new Sweets("cake");
		sweetSet.add(sweet);
		sweetSet.add(new Sweets("cookies"));
		sweetSet.add(new Sweets("chocolate"));
		sweetSet.add(new Sweets("banana"));
		sweetSet.add(new Sweets("apple"));
		sweetSet.add(sweet);
		
		System.out.println(sweetSet.size());
		//how do we print name of each sweet?
		System.out.println("----------1way");
		for(Sweets element:sweetSet) {
			System.out.println(element.name);
		}
		System.out.println("----------2way");
		
		Iterator<Sweets> it = sweetSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
	}

}
