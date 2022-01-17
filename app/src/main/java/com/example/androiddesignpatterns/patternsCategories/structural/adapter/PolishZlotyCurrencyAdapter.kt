package com.example.androiddesignpatterns.patternsCategories.structural.adapter

import com.example.androiddesignpatterns.patternsCategories.structural.adapter.api.PolishZlotyApi

class PolishZlotyCurrencyAdapter : MoneyAdapter {

    // not using DI just for simplicity
    private val api = PolishZlotyApi()

    override fun getPriceInZloty() = api.money
}