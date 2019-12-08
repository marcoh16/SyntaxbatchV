package com.reviewSessions;

public class ClassA {

	/*Create a class and call it classA
	 * inside classA overload the main  method adn print a string
	 * classA  also create 4 methods with your name 
	 * in those 4 methods do anythoing youd like print out strings but 
	 * in at least two methods declare a return type of anyting youd like
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.main();	
		obj.marco();
	int	answer = obj.method1(20, 20);
	System.out.println(answer);
	int answer2 = obj.method2(60, 50);
	System.out.print(answer2);
		
		
	}
	
	public static void main() {
		System.out.println("hello");
	}
	
	public static void marco() {
		System.out.println("hi");
	}
	public static void marcos() {
		System.out.println("MOM");
	}
	int method1(int num, int num2 ) {
		int c;
		c = num + num2;
		return c; 
	}
	int method2(int num3, int num4){
		int d;
		d = num3 - num4;
		return d;

	}
	
	
	
	
	

}
