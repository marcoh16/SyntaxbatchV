package com.class29;

public abstract class Phone {
	//implemented methods
	public void makeCall() {
		System.out.println("make call");
	}
	public void sendText() {
		System.out.println("send text");
	}
	//unimplemented methods
	//methods that dont have any body
public abstract void takePictures();
	
	public abstract void playGames();
	
}	
	//concrete class
class iPhone extends Phone {
		@Override
		public void takePictures() {
			System.out.println("iphone takes pics");
		}
		@Override
		public void playGames() {
			System.out.println("play games on iphone");
		}
		
	}
class Samsung extends Phone{
		@Override
		public void takePictures() {
			System.out.println("Samsumg takes pics");
		}
		@Override
		public void playGames() {
			System.out.println("Samsung play games");
		}
	}


