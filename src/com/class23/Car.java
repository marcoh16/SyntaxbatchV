package com.class23;


public class Car {
	/*we want to build make as toyota
	 * that will have different models 
	 * 
	 */
	
	public static String make;
	public String model;
	public String color;
	public int doors;
	public int speed;
	
	
	
 
	
	
	
	public void getDetails(){
		System.out.println("i build " + color + make + model);
		System.out.println("my car has "+ doors + "doors adn can havr up to "+ speed + "speed" );
	}
	

}
