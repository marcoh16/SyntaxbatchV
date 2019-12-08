package com.class27;

public class Stud {
	public void study() {
		System.out.println("");
	}
	
	protected void doHomework() {
		System.out.println("");
	}
	void research() {
		System.out.println("");
		
	}
	private void attendClasses() {
		System.out.println();
	}
	
}
class SyntaxStud extends Stud{
	@Override
	public void study() {
		System.out.println("suntax stud");
	}
	@Override
	public void research() {
		System.out.println("syntax stud research");
	}
	
	protected void attendClasses() {
		System.out.println("syntax stud attend classs");
	}
}