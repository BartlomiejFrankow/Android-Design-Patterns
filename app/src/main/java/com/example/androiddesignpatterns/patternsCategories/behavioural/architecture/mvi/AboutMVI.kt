package com.example.androiddesignpatterns.patternsCategories.behavioural.architecture.mvi

import com.example.androiddesignpatterns.R

/*
* MVI is a mixture of MVP and MVVM adapted to reactive programming.
* It eliminates the use of callback and significantly reduces the number of input/output methods.
* It is also a great solution for synchronization states between view and the business logic layer.
*
* - View: The view layer observes user actions and system events. As a result, it sets the intention for the triggered event.
*   Also, it listens and reacts to the change in state of the model.
* - Model: A model is a representation of the view state. It contains all the information necessary to render the view correctly.
* - Intent: A representation of a future action that changes the state of the model.
* - User: Many people also include the application user as a part of MVI architecture.
*   He or she observes and reacts to view state changes by playing with the application. You can see it on the diagram below.
* */

class AboutMVI {

    fun ilustratePattern() {
        R.drawable.mvi
        // Repository with clean architecture MVVM app: https://github.com/BartlomiejFrankow/mvi-example
    }
}
