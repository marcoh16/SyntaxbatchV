package com.class22;

public class AccessingStaticVariables {

	
	public static void main(String[] args) {
		Dog obj = new Dog();
		System.out.println(obj.name);
		obj.name = "emma";
		System.out.println(obj.name);
		
		
		System.out.println(Dog.breed);
		//changing the value of the breed
		Dog.breed="new breed";
		System.out.println(obj.breed);//another way but not a good way to do it.
		
		
		
		
		
		
		
	}
}
