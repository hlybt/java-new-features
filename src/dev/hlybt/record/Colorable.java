package dev.hlybt.record;

sealed interface Colorable permits Frame {
	void paint(String color);
}
