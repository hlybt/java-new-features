package dev.hlybt.collections;

import static dev.hlybt.collections.CollectionUtils.modifyCollection;
import static dev.hlybt.collections.basket.Apple.arrayOfApples;
import static dev.hlybt.collections.basket.Apple.listOfApples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dev.hlybt.collections.basket.Apple;
import dev.hlybt.collections.basket.Color;

/*
 * Unmodifiable is not the same as immutable.
 */
public class UnmodifiableViews {
	private static void fromArray() {
		var array = arrayOfApples();
		var apples = List.of(array);

		System.out.println("Modifying apples-fromArray...");
		modifyCollection(apples, new Apple(Color.GREEN));

		array[0].setColor(Color.GREEN);
		apples.get(1).setColor(Color.GREEN);

		// All apples are green now!!!
	}

	private static void fromList() {
		var list = listOfApples(); // mutable list with 3 elements
		var apples = List.copyOf(list); // creates a new reference
		
		System.out.println("Modifying apples-fromList...");
		modifyCollection(apples, new Apple(Color.RED));

		list.add(new Apple(Color.GREEN)); // has 4 elements now

		// 'listOfApples' still has 3 elements.

		list.get(0).setColor(Color.GREEN);
		apples.get(1).setColor(Color.GREEN);

		// All apples are green now!!!
	}

	private static void fromStream() {
		var array = arrayOfApples();		
		var apples = Stream.of(array).collect(Collectors.toUnmodifiableList());
		
		System.out.println("Modifying apples-fromStream...");
		modifyCollection(apples, new Apple(Color.RED));
		
		array[0].setColor(Color.GREEN);
		apples.get(1).setColor(Color.GREEN);
		
		// All apples are green now!!!
	}
}
