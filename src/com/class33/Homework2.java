package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework2 {

	public static void main(String[] args) {
		// create an array of words ans removes any word that
		//ends with "e" use iterator
		
		List<String>list=new ArrayList<>();
		list.add("cute");
		list.add("love");
		list.add("hello");
		list.add("java");
		
		Iterator<String> it = list.iterator();	
		
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
					it.remove();
					break;
			}
		}
		System.out.println(list);
		
		
	}

}
