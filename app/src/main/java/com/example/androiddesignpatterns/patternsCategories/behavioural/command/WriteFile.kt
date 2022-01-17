package com.example.androiddesignpatterns.patternsCategories.behavioural.command

import java.io.File

object WriteFile : CommandExecute {

    var newFile: File? = null

    override fun writeNewFile() {
        writeFile()
    }

    private fun writeFile() {
        newFile = File("path")
    }
}