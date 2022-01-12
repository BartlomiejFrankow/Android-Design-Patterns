package com.example.androiddesignpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddesignpatterns.Builder.Hamburger
import com.example.androiddesignpatterns.Factory.DialogFactory
import com.example.androiddesignpatterns.Factory.DialogType
import com.example.androiddesignpatterns.Singleton.Singleton

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