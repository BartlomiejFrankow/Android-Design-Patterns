package com.example.androiddesignpatterns.patternsCategories.structural.adapter

import com.example.androiddesignpatterns.patternsCategories.structural.adapter.api.EuroApi

class EuroCurrencyAdapter : MoneyAdapter {

    // not using DI just for simplicity
    private val api = EuroApi()

    override fun getPriceInZloty() = convertToPolishZloty()

    private fun convertToPolishZloty() = api.money * api.euroToZlotyExchangeRate
}