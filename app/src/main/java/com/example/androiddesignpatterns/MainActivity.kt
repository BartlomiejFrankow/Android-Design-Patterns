package com.example.androiddesignpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddesignpatterns.patternsCategories.creational.builder.Hamburger
import com.example.androiddesignpatterns.patternsCategories.structural.factory.DialogFactory
import com.example.androiddesignpatterns.patternsCategories.structural.factory.DialogType
import com.example.androiddesignpatterns.patternsCategories.creational.singleton.Singleton
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Singleton usage
        Singleton.doSomething()

        // Factory usage
        val dialog = DialogFactory.createDialog(DialogType.DIALOG_DELETE_MESSAGE)

        // Builder usage
        val hamburger = Hamburger.Builder()
            .beef(false)
            .onions(false)
            .build()

    }
}