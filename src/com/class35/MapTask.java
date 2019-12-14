package com.class35;

import java.util.*;
public class MapTask {

	public static void main(String[] args) {
		// 
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1,"google");
		map.put(2,"facebook");
		map.put(3, "oracle");
		map.put(4, "amazon");
		map.put(5, "youtube");
		map.put(6,"ig");
		map.put(7, "snapchat");
		
		int size = map.size();
		System.out.println(size);
		
		map.put(4,"ebay");
		System.out.println(map);
		
		map.remove(7);
		System.out.println(map);
		
		System.out.println(map);
}
}