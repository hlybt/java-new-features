package dev.hlybt.collections.basket;

import java.util.ArrayList;
import java.util.List;

public class Apple {
	private Color color;

	public Apple(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + " apple";
	}
	
	public static Apple[] arrayOfApples() {
		return new Apple[] { new Apple(Color.RED), new Apple(Color.YELLOW), new Apple(Color.GREEN) };
	}
	
	public static List<Apple> listOfApples() {
		var list = new ArrayList<Apple>();
		list.add(new Apple(Color.RED));
		list.add(new Apple(Color.YELLOW));
		list.add(new Apple(Color.GREEN));

		return list;
	}	
}
