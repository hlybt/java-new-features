package dev.hlybt.sealed;

/**
 * Only frogs and rabbits can jump, cows cannot. This has been clarified by
 * adding {@link Frog} and {@link Rabbit} to {@code permits}. Since
 * {@link CanJump} is a sealed interface, {@link Cow} is not allowed to
 * implement it.
 */
sealed interface CanJump permits Frog, Rabbit {
}
