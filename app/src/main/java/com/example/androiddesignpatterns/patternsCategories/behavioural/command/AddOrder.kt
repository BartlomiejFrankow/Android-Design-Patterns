package com.example.androiddesignpatterns.patternsCategories.behavioural.command

import android.content.Context
import android.widget.Toast
import com.example.androiddesignpatterns.R

class AddOrder : Order {
    override fun execute(context: Context) {
        Toast.makeText(context, context.getString(R.string.add_order), Toast.LENGTH_LONG).show()
    }
}
