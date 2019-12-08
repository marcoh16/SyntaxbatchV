package com.class31;

public class shapeTest {
	public static void main(String[] args) {
		System.out.println("Circle");
		Circle c = new Circle();
		c.calculatePerimeter();
		c.calculateArea();
		System.out.println("----------------");
		System.out.println("Square");
		Square s = new Square();
		s.calculateArea();
		s.calculatePerimeter();
		
	}

}
