package com.class6;

public class SwitchStatement {
	public static void main(String[] args) {
		/*7 weekdays
		 * if day==1--monday
		 * if day==2-->tuesday
		 * 
		 * 
		 * 
		 */
		int day=6;
		String weekDay;
		
		if (day==1) {
			weekDay="Monday";
		}else if(day==2) {
			weekDay="Tuesday";	
		}else if (day==3) {
			weekDay="wensday";
			
		}else if (day==4) {
			weekDay="thursday";
		}else if (day==5) {
			weekDay="friday";
		}else if (day==6) {
			weekDay="saturday";
		}else if (day==7) {
			weekDay="sunday";
		}else {
			weekDay="Invalid";
		}
		System.out.println(weekDay);
		
		day=20;
		switch(day) {
		 
		case 1:
			weekDay="Monday";
			break;
		case 2:
			weekDay="Tuesday";
			break;
		case 3:
			weekDay="wensday";
			break;
		case 4:
			weekDay="thursday";
			break;
		case 5:
			weekDay="friday";
			break;
		case 6:
			weekDay="saturday";
			break;
		case 7:
			weekDay="sunday";
			break;
			default:
				weekDay="invalid";
		
		}
		System.out.println(weekDay);
		
		
		
		
		
	}
}
