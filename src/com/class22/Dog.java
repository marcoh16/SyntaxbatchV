package com.class22;

public class Dog {
	
	//static variables
	static String breed = "husy";
	static int paws=4;
	static int tale=1;
	
	//instance variables
	String name;
	String color;
	
	//the method that displays the out put of the code
	void display() {
		System.out.println("Puppy name is "+ name + " and its breed is "+ breed);
		
	}
	
	//method
	public static void main(String[] args) {
		
		//creating instances of the class
		//object
		Dog pup1 = new Dog();
		Dog pup2 = new Dog();
		
		
		pup1.name = "leo";
		pup1.color = "black";
		pup1.display();
		
		pup2.name = "rome";
		pup2.color = "white";
		pup2.display();
	
		
		System.out.println("cahing breed");
		
		
		Dog pup3 = new Dog();
		pup3.name="jade";
		//rename the instance variable on the new object that was created
		breed = "Bulldog";
		pup3.color= "pink";
		pup3.display();
		pup1.display();
		pup2.display();
		
		
	}

}
