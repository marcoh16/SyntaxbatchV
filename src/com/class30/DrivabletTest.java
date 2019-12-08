package com.class30;

public class DrivabletTest {
	public static void main(String[] args) {
		Driveable obj = new Toyota();
		obj.drive();
		
		Toyota toyota = new Toyota();
		toyota.drive();
		toyota.stop();
	
	}	
}
