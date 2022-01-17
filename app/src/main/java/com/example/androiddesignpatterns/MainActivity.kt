package com.example.androiddesignpatterns

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.androiddesignpatterns.patternsCategories.behavioural.command.AddOrder
import com.example.androiddesignpatterns.patternsCategories.behavioural.observer.ObserveViewModel
import com.example.androiddesignpatterns.patternsCategories.behavioural.observer.ObserveViewState
import com.example.androiddesignpatterns.patternsCategories.creational.builder.Hamburger
import com.example.androiddesignpatterns.patternsCategories.creational.singleton.Singleton
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.Currency
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.Currency.EURO
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.Currency.POLISH_ZLOTY
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.EuroCurrencyAdapter
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.PolishZlotyCurrencyAdapter
import com.example.androiddesignpatterns.patternsCategories.structural.adapter.TicketPriceView
import com.example.androiddesignpatterns.patternsCategories.structural.factory.DialogFactory
import com.example.androiddesignpatterns.patternsCategories.structural.factory.DialogType
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: ObserveViewModel by viewModels()

    @Inject
    lateinit var ticketPriceView: TicketPriceView

    @Inject
    lateinit var addOrder: AddOrder

    @Inject
    lateinit var payOrder: AddOrder

    private val title = findViewById<TextView>(R.id.mainTitle)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Singleton
        singletonUsage()

        // Factory
        factoryUsage()

        // Builder
        builderUsage()

        // Adapter
        adapterUsage(POLISH_ZLOTY)
        adapterUsage(EURO)

        // Command
        commandUsage()

        // Observer
        observerUsage()
    }

    private fun factoryUsage() {
        DialogFactory.createDialog(DialogType.DIALOG_DELETE_MESSAGE)
    }

    private fun singletonUsage() {
        Singleton.doSomething()
    }

    private fun builderUsage() {
        Hamburger.Builder()
            .beef(false)
            .onions(false)
            .build()
    }

    private fun commandUsage() {
        addOrder.execute(applicationContext)
        payOrder.execute(applicationContext)
    }

    private fun adapterUsage(currency: Currency) {
        when (currency) {
            POLISH_ZLOTY -> ticketPriceView.showTicketPrice(PolishZlotyCurrencyAdapter())
            EURO -> ticketPriceView.showTicketPrice(EuroCurrencyAdapter())
        }
    }

    private fun observerUsage() {
        lifecycleScope.launchWhenStarted {
            viewModel.viewState.collect { state ->
                when (state) {
                    ObserveViewState.SetObserveName -> title.text = getString(R.string.new_text_info)
                    ObserveViewState.RemoveName -> title.text = getString(R.string.removed_text_info)
                }
            }
        }
    }

}