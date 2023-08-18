package dev.hlybt.collections.basket;

import java.util.ArrayList;
import java.util.List;

public final class Orange {
	private final Color color;

	public Orange(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return color + " orange";
	}

	public static Orange[] arrayOfOranges() {
		return new Orange[] { new Orange(Color.RED), new Orange(Color.ORANGE), new Orange(Color.YELLOW) };
	}

	public static List<Orange> listOfOranges() {
		var list = new ArrayList<Orange>();
		list.add(new Orange(Color.RED));
		list.add(new Orange(Color.ORANGE));
		list.add(new Orange(Color.YELLOW));

		return list;
	}
}
