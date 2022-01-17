package com.example.androiddesignpatterns.patternsCategories.structural.adapter

/*
* An Adapter is something like a connector that is used to connect two or more incompatible interface.
* This pattern lets the classes work together.
*
* Adapter pattern example: RecyclerView.Adapter, ArrayAdapter etc.
* */

interface MoneyAdapter {

    fun getPriceInZloty(): Double
}
