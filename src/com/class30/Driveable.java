package com.class30;

public interface Driveable {
//since we added interface 
//by default compiler will add public abstract
//public static final variables(this type of variables dont change)these are CONSTANT
//this constant variables must be all in capital letters
boolean DRIVE_FAST=true;//the compiler alredy made it constant
void drive();

}
class Cars{
	public void stop() {
		System.out.println("car stops by pressing breaks");
	}
}

class Toyota extends Cars implements Driveable {
	@Override
	public void drive() {
		System.out.println("toyota can drive");	
	}	
}