package com.class32;

public class WrapperClasses {
	public static void main(String[] args) {
		//primitive type
		int num = 10;
//This is call autoboxing--> converting primitive type into object type		
//IntegerObject 
		Integer integer = 100;
		System.out.println(integer.MIN_VALUE);
		String str = integer.toString();
		System.out.println(str);
		
//booleanObject
//we are converting boolean data type into Boolean object type
		Boolean bool = true;
		Byte b=20;
		System.out.println(b.MAX_VALUE);
		
		
//AutoUnboxing--> converting Object type into a primitive type
		int num1 = new Integer(10);
		System.out.println(num1);
		
	}

}
