package com.example.androiddesignpatterns.patternsCategories.creational.builder

/*
* In a builder pattern, you are only concerned about what you need from a class and not everything that a class has.
* */

class Hamburger private constructor(
    val cheese: Boolean,
    val beef: Boolean,
    val onions: Boolean
) {

    class Builder {
        private var cheese: Boolean = true
        private var beef: Boolean = true
        private var onions: Boolean = true

        fun cheese(value: Boolean) = apply { cheese = value }

        fun beef(value: Boolean) = apply { beef = value }

        fun onions(value: Boolean) = apply { onions = value }

        fun build() = Hamburger(cheese, beef, onions)
    }

}