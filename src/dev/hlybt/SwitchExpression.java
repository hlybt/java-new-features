package dev.hlybt;

public class SwitchExpression {
	void moreOrLessApples(int applesInBasket) {
		final short fewApples = 3;
		switch (applesInBasket) {
		case fewApples -> // Arrow required
			System.out.println("less apples...");
		// No need for 'break'
		case 5 * 10 -> System.out.println("more apples...");
		}; // Semicolon required
	}

	String returnAValue(int applesInBasket) {
		var color = "red";
		var amountOfApples = switch (applesInBasket) {
		case 1 -> {
			if (color.equals("red"))
				yield "one red apple";
			else
				yield "one apple";
		}
		case 3 -> "less apples...";
		case 50 -> {
			yield "more apples...";
		}
		/*
		 * Since it must return a value, the switch expression must cover all possible
		 * values.
		 */
		default -> "no information";
		};

		return amountOfApples;
	}
}
