package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		
		
		AllMethods obj = new AllMethods();
		int large = obj.findLargest(300,500);
		System.out.println(large);
		
		boolean odd = obj.isOdd(large);
		System.out.println(odd);
		
		//call method weekdayname
		//if(tuesday or wensday or thursday or saturday or sunday-->we are leaning java)
		
		String str = obj.weekDayName(5);
		if(str.equals("Tuesday") || str.equals("Wensday") 
				|| str.equals("Thursday") || str.equals("Saturday") 
				|| str.equals("Sunday")) {
		System.out.println("i am learning java");
		}else {
			System.out.println("i am practicing java");
		}
		
	}
}
