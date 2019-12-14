package com.class32;

public class Recap {

	public static void main(String[] args) {
		//to store single value
		int num = 10;
		
		//to store multiple values
		int[] array = {10,20,30};
		
		int[] arr = new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		System.out.println(arr[2]);
		
		//to retrieve all values one by one
		//by using enhanced loop
		for(int num1:arr) {
			System.out.println(num1);
		}
		
		//using for loop
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//we can store non primitive types: Objects
		Fruit f = new Apple();// f is non primitive type
		Fruit f1 = new Banana();//f1 is non primitive type
		Object f2 = new Orange();
		//cant be part of the Fruit loop
		Object monkey = new Monkey();
		
		Object [] mixArray = {f,f1,f2,monkey, "hello"};
		for(Object fr: mixArray);
	}
}
class Monkey extends Object{
	
}


class Fruit extends Object{
	
}
class Apple extends Fruit{
	
}
class Orange extends Object{
	
}
class Banana extends Fruit{
	
}


