package dev.hlybt.sealed;

//Must be defined in the same package With CanJump
public non-sealed class Rabbit implements CanJump {
	public void sprint() {
		System.out.println("sprinting...");
	}
}
