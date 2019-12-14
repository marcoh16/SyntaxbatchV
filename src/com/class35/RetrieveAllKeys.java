package com.class35;

import java.util.*;
public class RetrieveAllKeys{
	public static void main(String[] args) {
	//create a map of a person (name, lastName, address, city, state)
	
	Map<String, String> personMap = new LinkedHashMap<>();
	personMap.put("Name", "ahmet");
	personMap.put("Last Name", "yildiz");
	personMap.put("Address", "123 test");
	personMap.put("City", "annandale");
	personMap.put("state", "VA");
	
	System.out.println(personMap);
	System.out.println("-----------------Specific Value");
	
	//how to retrieve specific values
	String value = personMap.get("state");
	System.out.println(value);
	
	System.out.println("-----------------Keys and values");
	
	//how to retrieve all keys and all values
	//keySet();
	Set<String> keys = personMap.keySet();
	for(String key : keys) {
		System.out.println(key+":"+personMap.get(key));
	}
	
	System.out.println("-----------------Keys");
	
	Iterator<String> keysIterator = keys.iterator();
	while(keysIterator.hasNext()) {
		System.out.println(keysIterator.next());
	}
	
	System.out.println("-----------------Values");
	Collection<String> values = personMap.values();
	for(String val:values) {
		System.out.println(val);
	}
	
	System.out.println("-----------------Values");
	
	Iterator<String>valuesIt = values.iterator();
	while(valuesIt.hasNext()) {
		System.out.println(valuesIt.next());
	}
	
	System.out.println("------------------- keys and values by using iterator");
	
	//how to retrieve and print values key:value
	Iterator<String> KeysIterator = keys.iterator();
	while(KeysIterator.hasNext()) {
		//System.out.println(keysIterator.next()+":"+ personMap.get(KeysIterator.next()));
		String mapkey =KeysIterator.next();
		String mapValue= personMap.get(mapkey);
		System.out.println(mapkey+": "+mapValue);
	}
					
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
}
