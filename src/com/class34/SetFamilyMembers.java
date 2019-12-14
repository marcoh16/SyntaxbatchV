package com.class34;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFamilyMembers {

	public static void main(String[] args) {
		Set<String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("apple");
		fruitSet.add("banana");
		fruitSet.add("grapes");
		fruitSet.add("pinapple");
		fruitSet.add("kiwi");
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		
		
		//create a collection that wont allow duplicates
		//and sorts in accesding order
		Set<Integer> tSet = new TreeSet<>();
		tSet.add(200);
		tSet.add(20000);
		tSet.add(20);
		tSet.add(999);
		tSet.add(999);
		System.out.println(tSet.size());
		System.out.println(tSet);
		
		//adding collection in to a collection
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("selenuum");
		list.add("Testin");
		
		//order does not matter hashset
		Set<String> linkedSet = new HashSet<>();
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);
		System.out.println("---------objcts from borth collections");
		System.out.println(linkedSet);
		
		
		
	}

}
