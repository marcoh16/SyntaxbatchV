package com.class20;

public class Canada {
	public static void main(String[] args) {
		USA us1 = new USA();
		System.out.println("access from CANADA");
		System.out.println(us1.mainState);
		System.out.println(us1.school);
		
		//capitaCity is private
		//System.out.println(us1.capitalCity);
		
	}

}
