package com.example.androiddesignpatterns.patternsCategories.behavioural.architecture.mvp

import com.example.androiddesignpatterns.R

/*
* Model View Presenter or MVP is a set of guidelines that are followed to make the code reusable
* and testable because it decouples the whole code. MVP divides the application into three parts:
*
* - Model: It is the place where you write all your Business logic and data state. So, all the data classes of your application are considered as Model.
* - View: It is the user interface that a user sees. In Android, the user interface is built with the help of XML.
*   So, all the views that the user sees come under this category.
* - Presenter: The presenter is responsible for giving the data to the view. If view demands some data from the Model,
*   then it is the presenter that will fetch the data from the Model and provide the data to the view to display the required details.
* */

class AboutMVP {

    fun ilustratePattern() {
        R.drawable.mvp
    }
}
