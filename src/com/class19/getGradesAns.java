package com.class19;

public class getGradesAns {

	
	int grades(int score) {
		if(score > 90) {
			System.out.println("your score is: A");
		}else if(score>80) {
			System.out.println("your score is: B");
		}else if(score>70) {
			System.out.println("your score is: C");
		}else if(score> 50) {
			System.out.println("your score is: D");
		}else {
			System.out.println("your score is: F");
		}
		
		return score;
	}
}
