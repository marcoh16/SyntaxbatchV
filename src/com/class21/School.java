package com.class21;

public class School {
	
	public static void main(String[] args) {
		Student stud1 = new Student();
		//assigning instance variables
		stud1.studentName = "Marco";
		stud1.GPA = 3.5;
		stud1.school = "Mason";
		
		stud1.displayInfo();
		stud1.study(4);
		
		Student stud2 = new Student();
		stud2.studentName = "jade";
		stud2.GPA = 4.5;
		stud2.school = "MIT";
		
		
		System.out.println("------------");
		
		stud2.displayInfo();
		stud2.study(5);		
		
	}

}
