package dev.hlybt.sealed;

// No need for 'permits' since they're all in the same file
abstract sealed class Fruit { 
}

//Must be one of these three modifiers: sealed, final or non-sealed
sealed class Apple extends Fruit {
}

final class GreenApple extends Apple {
}

non-sealed class Orange extends Fruit {
}
