package com.corejava.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemoMain {

	public static void main(String[] args) {
		
		Map<String, String> studentMap = new HashMap<>();
		
		studentMap.put("1", "Vimal");
		studentMap.put("2", "Harshal");
		studentMap.put("3", "Vinay");
		
		
		Set<Entry<String,String>> entrySet = studentMap.entrySet();
		
		System.out.println("Roll no 3 student name: "+studentMap.get("3"));
		
		
		for (Entry<String, String> entry : entrySet) {
			
			System.out.print("Key: "+entry.getKey());
			System.out.println(":::Value: "+entry.getValue());
			
		}
		
				
		for (String roll : studentMap.keySet()) {
			
			System.out.println("Key:"+roll+" Value: "+studentMap.get(roll));
			
		}
		
		for (String name : studentMap.values()) {
			
			System.out.println("Name "+name);
			
		}

		

	}

}
