package dev.hlybt.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class FromOptionals {
	
	private static void streamOfOptionals() {
		Stream<Optional<Integer>> streamOfOpts = Stream.of(Optional.of(1), Optional.of(2));

		streamOfOpts.forEach(opt -> System.out.println(opt.orElseThrow()));
	}
}
