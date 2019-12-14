package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		
		List<String> stringlist=new ArrayList<>();
		stringlist.add("esra");
		stringlist.add("marco");
		stringlist.add("jade");
		stringlist.add("leo");
		stringlist.add("jorge");
		stringlist.add("antonio");
		stringlist.add("elsa");
		stringlist.add("helem");
		stringlist.add("roman");
		
		//Iterator
		Iterator<String>it = stringlist.iterator();
		while(it.hasNext()){
			if(it.next().length()<=4) {
				it.remove();
			}
			
		}
		System.out.println(stringlist);
		
		
		//remove names that are shorter than 4 characters
		stringlist.remove("esra");
		System.out.println(stringlist);
		
		//removing element with for loop
		for(int i = 0; i<stringlist.size(); i++) {
			if(stringlist.get(i).length()<=4) {
				stringlist.remove(i);
			}
		}
		System.out.println(stringlist);
		//best way to remove an object will always be an iterator
		
		
	}
}
