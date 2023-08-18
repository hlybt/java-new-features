package dev.hlybt.collections;

import static dev.hlybt.collections.CollectionUtils.modifyCollection;
import static dev.hlybt.collections.basket.Orange.arrayOfOranges;
import static dev.hlybt.collections.basket.Orange.listOfOranges;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dev.hlybt.collections.basket.Color;
import dev.hlybt.collections.basket.Orange;

/*
 * Unmodifiable collection of immutable oranges
 */
public class ImmutableCollections {
	private static void fromArray() {
		var array = arrayOfOranges();
		var oranges = List.of(array);

		System.out.println("Modifying oranges-fromArray...");
		modifyCollection(oranges, new Orange(Color.RED));

		array[0] = new Orange(Color.ORANGE); // changes have no effect on 'oranges'
	}
	
	private static void fromList() {
		var list = listOfOranges();
		var oranges = List.copyOf(list); // creates an immutable snapshot of 'list'
		
		System.out.println("Modifying oranges-fromList...");
		modifyCollection(oranges, new Orange(Color.RED));

		list.add(new Orange(Color.ORANGE)); // changes have no effect on 'oranges'
		list.set(0, new Orange(Color.ORANGE));
	}
	
	private static void fromStream() {
		var array = arrayOfOranges();
		var oranges = Stream.of(array).collect(Collectors.toUnmodifiableList());
		
		System.out.println("Modifying oranges-fromStream...");
		modifyCollection(oranges, new Orange(Color.RED));
		
		array[0] = new Orange(Color.ORANGE); // changes have no effect on 'oranges'
	}
}
