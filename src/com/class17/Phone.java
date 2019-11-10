package com.class17;

public class Phone {
	
	boolean talk, picture, text;
	String brand;
	int memory;
	
	void call() {
		System.out.println("i can make calss on my "+ brand);
		
	}
	void photos() {
		System.out.println("i can take pics on my "+ brand);
	}
	
	
	public static void main(String[] args) {
		//object
		Phone ph = new Phone();
		ph.talk = true;
		ph.picture = true;
		ph.text = true;
		ph.brand="iphone";
		ph.memory=220;
		
		//object
		Phone ph2 = new Phone();
		ph2.talk = true;
		ph2.picture = true;
		ph2.text = true;
		ph2.brand = "android";
		ph2.memory = 550;
		//object
		Phone ph3 = new Phone();
		ph3.talk = true;
		ph3.picture = true;
		ph3.text = true;
		ph3.brand = "nokia";
		ph3.memory = 230;

		ph.call();
		ph2.call();
		ph3.call();
		
		System.out.println("==========");
		
		ph.photos();
		ph2.photos();
		ph3.photos();
		
	}
}
