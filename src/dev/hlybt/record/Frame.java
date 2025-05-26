package dev.hlybt.record;

/**
 * An immutable object that holds the width and height values ​​of a rectangular
 * frame.
 * <p>
 * {@code Frame} is implicitly final. Its fields {@link #width} and
 * {@link #height} are private and final. It cannot be abstract. It cannot be
 * extended or inherited.
 * <p>
 * Compiler automatically generates:
 * <ul>
 * <li>a canonical constructor {@link #Frame(int width, int height)}
 * <li>two accessor methods {@link #width()} and {@link #height()}
 * <li>{@link #equals()}, {@link #hashCode()} and {@link #toString()} methods
 * </ul>
 */
record Frame(int width, int height) implements Colorable {

	// static methods, fields and initializers can be declared
	static final String MATERIAL = "METAL";

//	private int num = 0; // instance fields are not allowed 

	/**
	 * Compact canonical constructor can be used for validation or normalization of
	 * the parameters.
	 * <p>
	 * No need for parameter declaration. Assignment to record fields is done
	 * implicitly at the end of the constructor:
	 * {@snippet :
	 * this.width = width;
	 * this.height = height;
	 * }
	 * <p>
	 */
	Frame {
		if (width < 0 || height < 0)
			throw new IllegalArgumentException(String.format("Negative width and/or height (%d,%d)", width, height));

//		Only the constructor parameters can be changed, not the record's fields.
//		this.width = 9; // Illegal explicit assignment of a final field width in compact constructor
	}

	Frame(int width, int height, String color) {
		// A non-canonical constructor must start with an explicit invocation to a
		// constructor
		this(width, height);
		paint(color);
	}

	/**
	 * Overriding accessors are allowed but be careful. Records are immutable.
	 * Returning any value other than exact data can cause problems.
	 */
	@Override
	public int height() {
		return height;
	}

	@Override
	public void paint(String color) {
	}
}