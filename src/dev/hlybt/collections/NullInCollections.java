package dev.hlybt.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NullInCollections {
	private static void null_inCollections_disallowed() {
		var oldList = new ArrayList<Integer>();
		oldList.add(1);
		oldList.add(null);

		try {
			var newList = List.of(1, null);
		} catch (NullPointerException e) {
			nullsDisallowedMessage();
		}
	}

	private static void map_with_null_value() {
		var oldMap = new HashMap<>();
		oldMap.put("key0", "val0");
		oldMap.put("key1", null);

		List<String> keyList = List.of("key0", "key1", "key2");
		keyList.forEach(key -> System.out.print(key + "=" + oldMap.get(key) + " "));
		// prints: key0=val0 key1=null key2=null
		// Since key1's value is null, it returns null
		// Since key2 is missing, it returns null
		// Unclear whether the key is missing or the value is null

		System.out.println();

		try {
			var newMap = Map.of("key0", "val0", "key1", null);
		} catch (NullPointerException e) {
			nullsDisallowedMessage();
		}
	}

	private static void nullsDisallowedMessage() {
		System.out.println("Null elements, keys, and values are disallowed.");
	}

}
