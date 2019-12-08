package com.class30;

public interface Bank {
	void haveChecking();
	void haveSavings();
	
}
interface Trustable{
	void trust();
}

class Finance{
	public void financing() {
		System.out.println("financial transactions");
	}
}




class BOA extends Finance implements Bank, Trustable{
	@Override
	public void haveChecking() {
		System.out.println("has a checking account");
	}
	@Override
	public void haveSavings() {
		System.out.println("has a savings account");
	}
	@Override
	public void trust() {
		System.out.println("you can trust");
	}
}

class CapitalOne implements Bank, Trustable{
	@Override
	public void haveChecking() {
		System.out.println("has a checking account");
	}
	@Override
	public void haveSavings() {
		System.out.println("has a savings account");
	}
	@Override
	public void trust() {
		System.out.println("youcan trust");
	}	
}

class CapitalOneChild extends CapitalOne{
	
}







