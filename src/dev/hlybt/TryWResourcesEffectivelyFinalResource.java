package dev.hlybt;

class Door implements AutoCloseable {

	public Door() {
		System.out.println("The door is created.");
	}

	@Override
	public void close() {
		System.out.println("The door is closed.");
	}

}

public class TryWResourcesEffectivelyFinalResource {

	private static void tryWithResources_afterJava9() {
		Door door = new Door();
//		door = new Door(); // compiler error: door must be final or effectively final
		try (door) {
			// ...
		}
		// 'door' is still available!!!
	}

	private static void tryWithResources_beforeJava9() {
		// does not support 'door' coming from a method call, DI mechanism, etc.
		try (Door door = new Door()) {
			// ...
		}
	}
}
