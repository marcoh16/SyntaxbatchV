package com.class32;
import java.util.ArrayList;
public class task {

	public static void main(String[] args) {
		ArrayList<String>aList = new ArrayList<String>();
		//generit 
		aList.add("marco");
		aList.add("jade");
		aList.add("leo");
		aList.add("roman");
		aList.add("erickson");
		
		System.out.println(aList.isEmpty());
		System.out.println(aList.contains("jade"));
		System.out.println(aList.size());
		System.out.println(aList);
		System.out.println("-----");
		for(int i=0; i<aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	
		//ArrayList can be generic and non generic there are two types
		//non generic
		ArrayList alist = new ArrayList();
		alist.add("hello");
		alist.add(10,10);
		alist.add(true);
		alist.add('c');
		alist.add('b');
		
		System.out.println(alist);
		
		
	}
	
}
