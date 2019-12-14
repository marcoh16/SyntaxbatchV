package com.class35;

import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		//retrieving key 
		Map<String, String> countryMap = new LinkedHashMap<>();
		System.out.println("---------------Key");
		countryMap.put("bolivia", "santa cruz");
		countryMap.put("US", "DC");
		countryMap.put("japan", "tokyo");
		countryMap.put("colombia","medellin");
		
		Set<String> keys = countryMap.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		System.out.println("-------------Values");
		
		//retrieving values
		Collection<String>values = countryMap.values();
		for(String val : values) {
			System.out.println(val);
		}

	}

}
