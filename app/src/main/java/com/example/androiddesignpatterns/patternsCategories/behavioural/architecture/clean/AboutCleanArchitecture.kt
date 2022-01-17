package com.example.androiddesignpatterns.patternsCategories.behavioural.architecture.clean

import com.example.androiddesignpatterns.R

/*
* Clean Architecture defines the way in which the various layers of an app i.e. presentation, use case, domain, data, and framework layer interact with each other.
* The Clean Architecture produce a system that is testable, UI-independent, and independent of external agencies and libraries.
*
* Inside clean_architecture drawable circles represent the various levels in our application.
* As we move inward in the circle, each circle is more abstract and higher-level.
* The inner circle is not dependent on any outer circle and the most inner circle denotes the business logic of the application.
* */

class AboutCleanArchitecture {

    fun ilustratePattern() {
        R.drawable.clean_architecture
    }
}
