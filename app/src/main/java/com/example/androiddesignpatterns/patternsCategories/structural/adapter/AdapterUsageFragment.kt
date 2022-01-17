package com.example.androiddesignpatterns.patternsCategories.structural.adapter

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class AdapterUsageFragment : Fragment() {

    // not using DI just for simplicity
    private val ticketPriceView = TicketPriceView(requireContext())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpTicketForPolishZloty()
        setUpTicketForEuro()
    }

    private fun setUpTicketForPolishZloty() {
        ticketPriceView.showTicketPrice(PolishZlotyCurrencyAdapter())
    }

    private fun setUpTicketForEuro() {
        ticketPriceView.showTicketPrice(EuroCurrencyAdapter())
    }
}