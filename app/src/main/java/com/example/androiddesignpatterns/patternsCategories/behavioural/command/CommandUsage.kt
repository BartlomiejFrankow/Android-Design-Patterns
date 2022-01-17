package com.example.androiddesignpatterns.patternsCategories.behavioural.command

/*
* In the Command pattern, we give commands and we want our output and nothing else.
* We are not bothered about who will do our operation to give the desired result.
* All we want is our things to be done at the right time.
*
* For example, You have an "CommandExecute" interface and there are two classes that are implementing this "Execute" interface.
* One class is responsible for writing something in the file and the other class is responsible for appending
* the contents of a file. So, you can call any of these two classes i.e. the "WriteFile" and "AppendFile"
* with the help of "CommandExecute" interface.
* */

class CommandUsage(private val commandExecute: CommandExecute) {

    fun use() {
        commandExecute.writeNewFile()
        commandExecute.appendText("additional text")
        commandExecute.getFile()
    }

}