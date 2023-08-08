package dev.hlybt;

import java.time.LocalDate;

public interface InterfacePrivateMethod {
	default void sayHi(String name) {
		hello(name); 
	}

	private void hello(String name) {
		System.out.println("Hi " + name + "! Today is " + today());
	}

	private static String today() {
		return LocalDate.now().getDayOfWeek().toString();
	}
}
