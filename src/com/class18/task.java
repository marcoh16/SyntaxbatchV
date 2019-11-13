package com.class18;

public class task {
	

	/*creating method that will take 2 parameters
	 * as nubers and prinnts which number is larger
	 * 
	 */
	public static void main(String[] args) {
		task ans = new task();
		ans.LargerNum(12, 55);
		ans.OddorEven(5);
		ans.palindrome("love");
	}
	
	void OddorEven(int number) {
		if (number%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}


	void LargerNum(int lar,int min) {
		
		if(lar > min) {
			System.out.println(" the largers numebr is "+min );
		}else if(lar < min) {
			System.out.println("the min number is "+ lar);
		}else {
			System.out.println("numbers are equal");
		}
	}	
		
		
	void palindrome(String name) {
		String reversed = "";
		//5-1
		for (int i=name.length()-1; i>=0; i--) {
			reversed = reversed + name.charAt(i);//""+k=k+a=ka+k
			
		}
		
		System.out.println(reversed);
		
		if(name.equals(reversed)) {
			System.out.println("string is palimdrome");
		}else {
			System.out.println("string is not palindrome");
	}
	
	
	
	
}
}

