package com.class23;

public class students {
	
	
	String name;
	int math;
	int science;
	int PE;
	int GPA;
	
	students(String name, int math, int science, int PE){
		
		GPA=(math+science+PE)/3;
		System.out.println(name + GPA);
		
	}

}
