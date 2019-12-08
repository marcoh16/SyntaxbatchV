package com.class24;

public class Constructor {
	void Constructor(){
		System.out.println("hello");
	}
	Constructor(){
		System.out.println("i am constructor");
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
	}
}
