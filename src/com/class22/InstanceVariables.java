package com.class22;

public class InstanceVariables {
	String name = "samir";
	
	public static void main(String[] args) {
		String name="Burcu";
		System.out.println(name);
		
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.name);
		
		//changing value of the instance variable
		obj.name = "John";
		//value will be samer
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj.name);
		
		
		
		
		
		
	}
}
