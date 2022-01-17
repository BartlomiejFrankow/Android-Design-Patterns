package com.example.androiddesignpatterns.patternsCategories.behavioural.command

import java.io.File

class GetFile : CommandExecute {

    override fun getFile(): File? {
        return WriteFile.newFile
    }
}