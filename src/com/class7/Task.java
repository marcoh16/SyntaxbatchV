package com.class7;

public class Task {
	public static void main(String[] args) {
		/*create a boolean variable workDay and assign tru
		 * create int varialble day and assign it to 1
		 * as long as it is workDay print i need a day off and increase day
		 * once day is 6 print i dont need a day off anymore
		 */
		
	boolean workDay=true;
	int day = 1;
	
	while(workDay) {
		
			if (day==6) {
				System.out.println("i dont need a day off anymore ");
				workDay=false;
			}else {
			System.out.println("i need a day off");
			}
			day++;
		
	}
	
	
	}

}
