package com.example.androiddesignpatterns.patternsCategories.behavioural.command

import android.content.Context
import android.widget.Toast
import com.example.androiddesignpatterns.R

class PayOrder : Order {
    override fun execute(context: Context) {
        Toast.makeText(context, context.getString(R.string.pay_order), Toast.LENGTH_LONG).show()
    }
}
