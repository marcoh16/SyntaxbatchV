package com.class30;



public abstract class Vehicle {
		
		static int totalVehicles;
		//this is an instance variable
		String vinNumber;

		//initiolizing variables
		//by initiolizing it becomes a local variable
		Vehicle(String vinNumber){
			this.vinNumber = vinNumber;
		//everytime i add a vehicle it will sum it up
			totalVehicles++;	
		}
	
		public void drive() {
			System.out.println("vehicle can drive");
		}
		public void stop() {
			System.out.println("Vehicle can stop");
		}
		public static void displayTotal() {
			System.out.println("total vehicles are " + totalVehicles);
		}
		
		
		public abstract void start();
		public abstract void speed();
	}

		/////////////////////////////////////////////////////////////////////
		abstract class Car extends Vehicle{
			
			//instance variable that belongs to Car class
			String carType;
			//initiolizing carType as local variable
			Car(String vinNumber, String carType){
				super(vinNumber);
				this.carType=carType;
			}
			
			
			public void speed() {
				System.out.println("max car speed up to 400");
			}
			public abstract void breaking();
		}
		/////////////////////////////////////////////////////////////////////
			
		class BMW extends Car{
			String make, model;
			
		BMW(String vinNumber, String carType, String make, String model){
			super(vinNumber, carType);
			this.make = make;
			this.model = model;
		}	
			
		@Override
		public void start() {
			System.out.println("car can start");
		}
		@Override
		public void breaking() {
			System.out.println("BMW breaks");
		}
		public void display() {
			System.out.println( "we build " + make +" " +model + " with vin# "+ vinNumber);
		}
		}


		
		
	
	

