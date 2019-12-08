package com.class20;

public class task1 {
	

	protected String rev(String str1) {
		 String reverse = ""; 
		  for(int i = str1.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str1.charAt(i);
	        }
	        return reverse;
		
	}
	
	public boolean palim(String str1) {
		boolean result = false;
		String reverse = rev(str1);
		if(str1.equalsIgnoreCase(reverse)) {
			result = true;
		}else {
			result = false;
		}		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		String str1 = "Anna";
		task1 obj = new task1();
		String ans = obj.rev(str1);
		System.out.println(ans);	
		
		
		boolean boo = obj.palim(str1);
		System.out.println("is " + str1 + " palimdrome?  " + boo);
		
		
		  String[] strArray = obj.arrayOfWords("What a beautiful day is today!");
	        System.out.println("The length of the array is: " + strArray.length);
	        
	        for (String word : strArray) {
	            System.out.println(word);
	        }
	    }

		
		
		
		
	

    private String[] arrayOfWords(String sentence) {
//      String[] stringArray;
//      stringArray = sentence.split(" ");
//      return stringArray;
        return sentence.split(" ");
    }
	
	
	
}
