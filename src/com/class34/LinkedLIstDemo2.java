package com.class34;

import java.util.LinkedList;
import java.util.List;

class Sweets{
	String name;
	public Sweets(String name) {
		this.name = name;
	}
	public void iLove() {
		System.out.println("Ilove "+ name);
	}
	
}


public class LinkedLIstDemo2 {
	public static void main(String[] args) {
		//create a list of sweets objects
		List<Sweets> sweetList = new LinkedList<>();
		sweetList.add(new Sweets("chocolate"));
		sweetList.add(new Sweets("cake"));
		sweetList.add(new Sweets("cookies"));
		sweetList.add(new Sweets("macarones"));
		
		for (Sweets element : sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		//retrieving 1 element and accessing method 
		Sweets mySweet = sweetList.get(2);
		
		//retrieving 1 element and accessign method 
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		String str = "hello 124";
		str.replace("124", "446").trim();
		
		Integer num=100;
		String newNumber = num.toString().replace("100", "200");
		System.out.println(newNumber);
		
	}
	

}
