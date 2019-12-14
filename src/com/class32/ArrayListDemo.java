package com.class32;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String>arrayList= new ArrayList<String>();
		//to store values inside you collection
		arrayList.add("john");
		arrayList.add("jade");
		arrayList.add("jack");
		//to retrieve the value from arrayList from the collection
		System.out.println(arrayList.get(1));
		
		//add more values
		arrayList.add("james");
		arrayList.add("jane");
		
		//check how many elements inside 
		int size = arrayList.size();
		System.out.println(size);
		
		//creating an Object of ArrayList that wil hold numeric values
		ArrayList<Integer>numArrList=new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		//update the value
		numArrList.set(0, 1000);
		
		System.out.println(numArrList.get(2));
		System.out.println("-----------");
		//num is a counter variable
		//controls number of iterations for the loop
		for(int num=0; num<numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
			System.out.println("-----------");
		//with enhance loop
		for(Integer number:numArrList) {
			System.out.println(number);
		}
		}
		

	}

}
