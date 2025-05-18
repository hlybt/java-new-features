package dev.hlybt.sealed;

// Must be defined in the same package with CanJump
non-sealed class Frog implements CanJump {
	public void swim() {
		System.out.println("swimming...");
	}
}
