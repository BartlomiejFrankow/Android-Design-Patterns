package com.example.androiddesignpatterns.patternsCategories.behavioural.architecture.cleanmvvm

import com.example.androiddesignpatterns.R

/*
* The Model View ViewModel or MVVC is similar to that of MVC but here the controller is replaced by the ViewModel. The three components of the Model View ViewModel are:
*
* - Model: It is the place where you write all your Business logic and data state. So, all the data classes of your application are considered as Model.
* - View: It is the user interface that a user sees. In Android, the user interface is built with the help of XML. So, all the views that the user sees come under this category.
* - ViewModel: It is a bridge between the Model and the View. Here most of the user interface logic is stored.
* This is mainly used to store and manage the UI-related and it resolves one of the biggest problems of data loss that was faced due to screen rotation.
*
* Clean Architecture defines the way in which the various layers of an app i.e. presentation, use case, domain, data, and framework layer interact with each other.
* The Clean Architecture produce a system that is testable, UI-independent, and independent of external agencies and libraries.
*
* Inside clean_architecture drawable circles represent the various levels in our application.
* As we move inward in the circle, each circle is more abstract and higher-level.
* The inner circle is not dependent on any outer circle and the most inner circle denotes the business logic of the application.
* */

class AboutCleanMVVM {

    fun ilustratePattern() {
        R.drawable.mvvm
        R.drawable.clean_architecture
        // Repository with clean architecture MVVM app: https://github.com/BartlomiejFrankow/Cryptocurrency/tree/develop
    }
}
