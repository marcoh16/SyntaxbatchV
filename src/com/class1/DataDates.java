package com.class1;

public class DataDates {

	public static void main(String[] args) {
		
		byte b=10;
		byte b1=-128;
		//byte b2=128; compiler will give an error becasue the numbner is out of range for byte
		short s=6566;
		short s1=-32768;
		//short s3=32768; compiler will give an error because the number is out of range for short 
		
		int i=76778;
		
		long l=5243344344l;
		long l1=45423523535242351L;
		
		//floats can hold less values than double
		float f=12.34f;
		
		double d=2.343433;
		
		boolean hungry=true;
		boolean rain=false;
		
		//single characters
		char container='A';
		
		System.out.println(hungry);
		System.out.println(b1);
		
	}
}
