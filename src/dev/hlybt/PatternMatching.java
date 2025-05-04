package dev.hlybt;

public class PatternMatching {
	void showType(Number number) {
		if (number instanceof Integer num) { // num is the pattern variable
//			Integer num = (Integer)number; // boilerplate
			System.out.println(num + " is an Integer.");
		} else if (number instanceof Double num) {
			System.out.println(num + " is a Double.");
		}
	}

	void preventReassigningPatternVariable(Number number) { // using 'final'
		if (number instanceof final Integer num) {
//			num = 5; // The pattern variable num is final and cannot be assigned again
		}
	}

	void filterPatternVariableInIfStatement(Number number) {
		if (number instanceof Integer num && num % 2 == 0) {
			System.out.println("Even integer");
		} else {
			System.out.println("Odd integer");
		}
	}

	void variableIsOutOfScope(Number number) {
//		if(number instanceof Integer num || num%2==0) 
		/*
		 * The right side of the expression will be executed even if 'number' is not an
		 * Integer. The compiler complains about this.
		 */
	}

	void variableIsStillInScope(Number number) {
		if (!(number instanceof Integer num)) {
			return;
		}
		// Because the compiler is absolutely sure that 'num' is an integer.
		System.out.println(num + " is an Integer");
	}
}
