package com.class24;

public class test {
	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();
		System.out.println(ch1.race);
		System.out.println(ch1.hairColor);
		System.out.println(ch1.eyeColor);
		ch1.sing();
		ch1.code();
		
		Parent parent = new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.sing();
		//parent.code(); error becuae you can access child1 methods
		
	}

}
