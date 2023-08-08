package dev.hlybt;

public class DiamondOpAnonymousInnerClass {
	interface Foo<T> {
		T get();
	}

	Foo<String> name = new Foo<>() {
		@Override
		public String get() {
			return "Alice";
		}
	};

	Foo<? extends Number> grade = new Foo<>() {

		@Override
		public Number get() {
			return 4.9;
		}
	};

	Foo<?> stuff = new Foo<>() {
		@Override
		public Object get() {
			return new Exception("Foo Exception");
		}
	};
}
