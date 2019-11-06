package com.class11;

public class TwoDArraysDemo2 {
	public static void main(String[] args) {
		String [][] names = {{"marco", "jade", "jorge","mom"},{"popeye", "pablo", "messi","ronaldo"},
		{"neymar", "podolsky", "gucci","angel"},
		};
		
		
		int lengthOfRows = names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfCols = names[0].length;
		System.out.println(lengthOfCols);
		
		System.out.println("-----------------");
		
		for (String getArrays[]: names) {	
			for(String getName: getArrays) {
				System.out.print(getName+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
