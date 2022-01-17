package com.example.androiddesignpatterns.patternsCategories.structural.adapter

import android.content.Context
import android.view.View
import android.widget.Toast

class TicketPriceView(context: Context) : View(context) {

    // no matter which adapter will be used it will always receive price in polish zloty
    fun showTicketPrice(adapter: MoneyAdapter) {
        Toast.makeText(context, "Ticket price: ${adapter.getPriceInZloty()}", Toast.LENGTH_LONG).show()
    }
}