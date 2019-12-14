package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorsList {
	public static void main(String[] args) {
		//list that hold 5 instrcutors 
		List<Instructor> ilist = new ArrayList<>();
		//adding the new object of the constructor class
		ilist.add(new Instructor("jon", "smith"));
		ilist.add(new Instructor("ase", "smuck"));
		ilist.add(new Instructor("jen", "nut"));
		ilist.add(new Instructor("leo", "hurtado"));
		
		for (Instructor i:ilist) {
			System.out.println(i.lastName);
			i.display();
		}
	}

}
