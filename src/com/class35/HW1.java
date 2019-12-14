package com.class35;

import java.util.*;
public class HW1 {

	public static void main(String[] args) {
		// 
		List<String> aList = new ArrayList<>();
 
		aList.add("marco");
		aList.add("john");
		aList.add("carla");
		aList.add("leo");
		aList.add("jade");
		aList.add("jorge");
		aList.add("frank");
		
		Set<String>hset=new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		
		//how to remove just 1 value from the Set collection
		
		Set<String> lset = new LinkedHashSet<>();//keeeps the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("evening");
		lset.add("Night");
		
		//convert to the arrayList
		List<String> myList = new ArrayList<>();
		myList.addAll(lset);
		String element= myList.get(2);
		System.out.println(element);
		//another way to create an Object of Arraylist by passing values to constructor
		List<String> myList1 = new ArrayList<>(lset);
		
		
		
		
		}

}
