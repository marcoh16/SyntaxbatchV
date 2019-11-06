package com.class5;
import java.util.Scanner;
public class MoreLogicalExamples {
	
	public static void main(String[] args) {
		/*ask user to enter daily sale
		 * based on sales range we want to give commision to the person
		 * if sales <100 comision of 10%
		 * if sales in between 100-200 comission of 20%
		 */
		Scanner input;
		double salesAmount;
		double commision;
		
		input=new Scanner(System.in);
		System.out.println("enter sales amount");
		salesAmount=input.nextDouble();
		
		if(salesAmount>=1 && salesAmount<100) {
			//give user 10% commision
			commision=salesAmount*0.1;	
			//giving 20%
		}else if (salesAmount>=100 && salesAmount<200) {
			commision=salesAmount*0.2;
			//giving 305
		}else if (salesAmount>=200 && salesAmount<500) {
			
			commision=salesAmount*0.3;
			//giving 50%
		}else if (salesAmount>=500) {
			commision=salesAmount*0.5;
		}else {
			commision=0;
			
		}
		System.out.println("based on the sales your commision will be: " + commision);
		
		
	}

}
