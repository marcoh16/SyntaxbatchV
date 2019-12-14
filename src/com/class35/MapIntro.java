package com.class35;

import java.util.*;
public class MapIntro {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		//to store key+value pair into map
		map.put(101,"John");
		map.put(102,"jade");
		map.put(103,"jack");
		map.put(104,"jenny");
		
		System.out.println(map);
		//how to verify if there are elements inside map
		boolean flag = map.isEmpty();
		if(!flag) {
			int size = map.size();
			System.out.println(size);
		}
		//How to add more entries
		//map.compute("105", "John");//gives an error 
								//key and value type must be matched
		
		//in this line we adding duplicate values
		//adding duplicates will override, can not have duplicate keys, they must be unique.
		map.put(105, "john");
		System.out.println(map);
		map.put(102, "hassan");
		System.out.println(map);
		
		//how to access a value
		String mapElement = map.get(105);
		System.out.println(mapElement);
		
		//to replace and update the value
		map.replace(103,"jorjito");
		System.out.println(map);
		
		//how to remove object from a map
		map.remove(101);
		System.out.println(map);
		System.out.println("------------------");
		//how to verify if certain key is exist/exist
		boolean flag1 = map.containsKey(103);
		if(flag1) {
			map.replace(103, "jack");
		}else {
			map.put(103, "jack");
		}
		
		//how to verify if certain value exist
		boolean contains = map.containsValue("jenny");
		System.out.println(contains);
		System.out.println(map);
		
		
		
		
		
		
		
	}

}
