package com.class6;

public class Recap {
	public static void main(String[] args) {
		/*declare the time (1-24)
		 * based on the time identify wether is mornin, afternoon, evening, or night
		 * 
		 */
		int time=20;
		String timeOfDay;
		
		if(time>=1 && time<=11) {
			timeOfDay="morning";
		}else if (time>=12 && time<=15) {
			timeOfDay="Noon";
		}else if (time>=16 && time<=20) {
			timeOfDay="evening";
		}else if (time>20) {
			timeOfDay="night";
		}else {
			timeOfDay="Invalid";
			
		}
		System.out.println("time of the day is: " + timeOfDay);
	}

}
