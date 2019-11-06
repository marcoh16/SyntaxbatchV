package com.class5;

public class NestedIRecap {
	
	public static void main(String[] args) {
		
		//can be used to verify if item is display in the webpage
		/*
		 * if button is displayed then we need to verify text on 
		 * if text equal to sign in--> testcase pass
		 * otherwise--> wrong text is displayed
		 */
		boolean isDisplayed=true;
		String buttonText="Sign In";
		
		if (isDisplayed) {
			System.out.println("Button is displayed");
			
			if(buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			}else {
				System.out.println("Test case failed");
			}
			
		}else {
			System.out.println("Butoon is not displayed");
		}
		
	}

}
