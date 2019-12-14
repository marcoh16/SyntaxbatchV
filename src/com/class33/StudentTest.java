package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.class23.students;

class Student{
	String name;
	int studentId;
	
	//to initialize variables
	//using this keyword we can initialze variable
	public Student(String name, int studentId) {
		this.name = name;
		this.studentId = studentId;	
	}
	public void display() {
		System.out.println("my name is" + name + "and my student id is "+ studentId);
		
	}
}

public class StudentTest {
	public static void main(String[] args) {
		//create an arraylist that will store student type of objects
		 List<Student> students = new ArrayList<>();
		
		 //creating Student type of objects
		 Student stu = new Student("john",101);
		 Student stu1 = new Student("abra", 103);
		 Student stu2 = new Student("jade",104);
		 
		 students.add(stu);
		 students.add(stu1);
		 students.add(stu2);
		 
		 //display info for each of them
		 stu.display();
		 stu1.display();
		 
		 for(Student student : students) {
			 student.display();
		 }
		 
		 //adding more objects of a Student type
		students.add(new Student("michael", 105));
		students.add(new Student("leo", 106));
		students.add(new Student("wayne", 107));
		
		Iterator<Student>myIterator=students.iterator();
		while(myIterator.hasNext()) {
			//myIterator.next().display();
			Student obj = myIterator.next();
			System.out.println(obj);
			//obj.display();
			
		}
		
		
		
	}

}
