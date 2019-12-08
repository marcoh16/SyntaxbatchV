package com.class24;

public class Country {
	
	
	public String capital, name;
	public int population;
	
	Country(){
		System.out.println("im a contructor with no argument");
	}
	
	Country(String countryName, String countryCapital, int countryPopulation){
	name = countryName;
	capital= countryCapital;
	population = countryPopulation;
		
	}
	
	public void displayInfo() {
		System.out.println(name + capital + "number of populatin "+ population);
	}
	public static void main(String[] args) {
		Country country1 = new Country("usa", "dc", 350);
		Country country2 = new Country("bolivia ", "santa cruz", 25);
		Country country3 = new Country();
		
		country1.displayInfo();
		country2.displayInfo();
		
			
		
	}

}
