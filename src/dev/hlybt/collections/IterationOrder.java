package dev.hlybt.collections;

import java.util.Map;
import java.util.Set;
import static java.util.Map.entry;

public class IterationOrder {
	// Code should never depend on iteration order

	private static void iterationOrderInSetRandomized() {
		var set = Set.of(1, 2, 3, 4, 5, 6);
		System.out.println("set: " + set);
	}

	private static void iterationOrderInMapRandomized() {
		var map = Map.of(1, 10, 2, 20, 3, 30, 4, 40, 5, 50);
		System.out.println("map: " + map);

		var ofEntries = Map.ofEntries(entry(1, 10), entry(2, 20), entry(3, 30), entry(4, 40), entry(5, 50));
		System.out.println("ofEntries: " + ofEntries);
	}
}
