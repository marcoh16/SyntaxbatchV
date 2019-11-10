package com.class17;

public class ObjectsOfDog {

	public static void main(String[] args) {
		
		Dog pup = new Dog();
		
		pup.legs = 4;
		pup.eyes = 2;
		pup.name = "leo";
		pup.race = "pitbull";
		pup.color = "black";
		
		System.out.println("the dog has "+pup.legs+"legs and his name is "+ pup.name);
		pup.eye();
		System.out.println("---------------");
		Dog pup2 = new Dog();
		pup2.legs = 4;
		pup2.name = "blacky";
		pup2.race = "husky";
		pup2.color ="red";
		
		System.out.println("the dogs name is: "+pup2.name+" and he is "+ pup2.race);
		pup2.color();
		System.out.println("---------------");
		Dog pup3 = new Dog();
		pup3.name = "lion";
		pup3.race = "bulldog";
		
		System.out.println("the dogs name is: "+ pup3.name+" and he is a "+ pup3.race);
		
		
	}
}
