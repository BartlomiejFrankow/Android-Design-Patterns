package com.example.androiddesignpatterns.patternsCategories.behavioural.command

class AppendFile : CommandExecute {

    override fun appendText(appendText: String) {
        WriteFile.newFile?.appendText(appendText)
    }
}