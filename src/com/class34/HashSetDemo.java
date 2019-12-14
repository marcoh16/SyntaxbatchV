package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//lets create a collection of vegies where i do not want duplicates
		HashSet<String> hset= new HashSet<>();
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zucini");
		hset.add("carrot");
		hset.add("carrot");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//the way to retrieve elements is through iterator
		Iterator<String> it = hset.iterator();
		while(it.hasNext()){
			String element = it.next();
			System.out.println(element);
		}
		System.out.println("--------------");
		// another way is through enhance for loop
		for(String el : hset) {
			System.out.println(el);
		}
		
	}
}
