package dev.hlybt.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class DuplicateElementsKeys {
	private static void initializeSetWithDuplicateElements() {;
		var oldSet = new HashSet<Integer>();
		oldSet.add(1); 
		oldSet.add(1);
		
		try {
			var set = Set.of(1, 2, 1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 

	}
	private static void initializeMapWithDuplicateKeys() {
		var oldMap = new HashMap<Integer, Integer>();
		oldMap.put(1, 1);
		oldMap.put(1, null);
		
		try {
			var map = Map.of("yes", 1, "yes", 10);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
