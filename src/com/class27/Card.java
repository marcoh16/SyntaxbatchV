package com.class27;

public class Card {
	public void chargeInterest() {
		System.out.println("card is 25 percent interest");
	}

	public void creditLimit() {
		// TODO Auto-generated method stub
		
	}
}
class AX extends Card{
	public void creditLimit() {
		System.out.println("AX");
		
	}
	
}
class MC extends Card{
	public void creditLimit() {
		System.out.println("MC");
	}
	public void cashBack() {
		System.out.println("cash back");
	}
}

class Visa extends Card{
	public void creditLimit() {
		System.out.println("Visa");
	}
}
class Discovery extends Card{
	public void applepiet() {
		System.out.println("Discovery");
	}
}