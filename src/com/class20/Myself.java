package com.class20;

public class Myself {

	
	public static void main(String[] args) {
		MySonMath son1 = new MySonMath();
		son1.name = "Ensar";
		son1.phone = "222-2222-222";
		son1.birthday = "07/01/2018";
		
		son1.add1();
		son1.add2(2, 3);
		
		int result = son1.add3();
		System.out.println(result);
		
		//int result4 = son1.add4(5, 7);
		//if (result4  == 12 ) {
			
			//System.out.println("good job");
	//	}else {
			//System.out.println("not good enough");
		//}
	}
		
	}
	

