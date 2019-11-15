package com.class19;

public class Recap {
	
	
	//say hello 4 times
	void sayhello(int times) {
		for (int i=0; i<times; i++) {
			System.out.println("helo");
		}
	}
	
	//method to say smth # number of times
	void saySomething(String word, int times) {
		for (int b= 0; b<times; b++) {
			System.out.println(word);
		}
		
	}
	
	public static void main(String[] args) {
		Recap obj = new Recap();
		obj.sayhello(4);
		System.out.println("---------");
		obj.saySomething("java", 5);
		obj.saySomething( "asd", 4);
	}
	

}
