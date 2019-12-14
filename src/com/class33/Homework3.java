package com.class33;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
	public static void main(String[] args) {
		//create arraylist of drinks
		//if any drink has letter "a" or "e" replace with water

		
		List<String> drinks = new ArrayList<>();
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coffee");
		drinks.add("tea");
		
		drinks.set(0, "water");
		System.out.println(drinks);
		
		for (String drink:drinks) {
			if(drink.contains("a")|| drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
		}

}
