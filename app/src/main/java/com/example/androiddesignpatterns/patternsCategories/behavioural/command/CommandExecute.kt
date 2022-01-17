package com.example.androiddesignpatterns.patternsCategories.behavioural.command

import java.io.File

interface CommandExecute {

    fun writeNewFile() {}

    fun appendText(appendText: String) {}

    fun getFile(): File? = null

}