package dev.hlybt.collections;

import java.util.Collection;
import java.util.List;

public class CollectionUtils {
	public static <T> void modifyCollection(Collection<T> col, T t) {
		try {
			col.add(t);
		} catch (UnsupportedOperationException e) {
			unmodifiableCollectionMessage(col, "ADD");
		}

		try {
			if (col.size() > 0)
				col.remove(0);
		} catch (UnsupportedOperationException e) {
			unmodifiableCollectionMessage(col, "REMOVE");
		}
	}

	private static <T> void unmodifiableCollectionMessage(Collection<T> col, String op) {
		System.out.println(op + " -> The collection cannot be modified: " + col);
	}

}
