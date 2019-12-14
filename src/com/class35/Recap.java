package com.class35;

import java.util.*;
public class Recap {

	public static void main(String[] args) {
		// 
		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);

		

		Iterator<Double> iterators = set.iterator();
		while(iterators.hasNext()){
		double d = iterators.next();
		if(d<50) {
			iterators.remove();
		}
		}
	
		
		for(Double d1 : set){
			System.out.println(d1);
		}

	}

}
