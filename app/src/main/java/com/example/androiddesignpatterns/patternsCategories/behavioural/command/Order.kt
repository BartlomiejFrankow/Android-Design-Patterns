package com.example.androiddesignpatterns.patternsCategories.behavioural.command

import android.content.Context

/*
* In the Command pattern, we give commands and we want our output and nothing else.
* We are not bothered about who will do our operation to give the desired result.
* All we want is our things to be done at the right time.
* */

interface Order {
    fun execute(context: Context)
}
