package com.class31;


 public interface Shape {
	public void  calculatePerimeter();
	public void calculateArea();

	
	

}
class Circle implements Shape{

	@Override
	public void calculatePerimeter() {
	double pi = 3.14;	
	double radius = 4;
	double perimeter = 2 * pi * radius ;
	System.out.println("Perimeter: " + perimeter);	
	}

	
	public void calculateArea() {
	double pi = 3.14;
	double radius = 7.5;
	double area = pi * radius * radius;
	System.out.println("Area: " + area);
		

	}	

}
class Square implements Shape{
	
	public void calculateArea() {
		double area;
		double side = 2.5;
		
		area = side*side;
		System.out.println("Area:" + area);
			
		}
	
	public void calculatePerimeter() {
	int perimeter;
	int side = 5;
	perimeter = (4*side);
	System.out.println("permiter: "+perimeter);
		
		
	}	
	
}








