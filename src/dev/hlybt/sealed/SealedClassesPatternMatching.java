package dev.hlybt.sealed;

/**
 * {@link #moveWithInstanceof(CanJump jumper)} does the same job with
 * {@link #moveWithSwitchExpression(CanJump jumper)}.
 * 
 * When null is passed as a parameter:
 * {@link #moveWithSwitchExpression(CanJump jumper)} will throw a
 * NullPointerException but {@link #moveWithInstanceof(CanJump jumper)} will
 * not. Because calling instanceof on a null reference returns false.
 */
public class SealedClassesPatternMatching {

	void moveWithInstanceof(CanJump jumper) {
		if (jumper instanceof Frog frog) {
			frog.swim();
		} else if (jumper instanceof Rabbit rabbit) {
			rabbit.sprint();
		}
	}

	void moveWithSwitchExpression(CanJump jumper) {
		switch (jumper) {
		case Frog frog -> frog.swim();
		case Rabbit rabbit -> rabbit.sprint();
		// no need for default
		// because CanJump is a sealed interface only permits Frog and Rabbit
		}
		;
	}
}
