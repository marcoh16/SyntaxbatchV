package com.class17;

public class Computer {
	
	//define features, attributes
	int  screen, ram, memory, size;
	String brand, name, monitor, mouse;
	boolean keyboard;
	
	//define behaviour, actions
	
	void playGames() {//method header
		//method body
		System.out.println("i can play on my "+name);
		
	}
	
	void javaCoding() {
		System.out.println("i can do java coding on my "+ name);
		
	}
	void watchMovie() {
		System.out.println("i can watch movie on my "+ name);
		
	}
	public static void main(String[] args) {
		Computer computer1=new Computer();
		computer1.brand="apple";
		computer1.name=" MackBook Pro";
		computer1.memory=250;
		
		System.out.println("i have "+computer1.brand+computer1.name);
		computer1.javaCoding();
		computer1.watchMovie();
		
		System.out.println("-------creating 2nd object of a computer type --------");
		Computer computer2=new Computer();
		computer2.brand="Dell";
		computer2.name="420";
		computer2.memory=125;
		
		computer2.javaCoding();
		computer2.watchMovie();
		computer2.playGames();
		
		
	}
}
