package com.example.androiddesignpatterns.patternsCategories.behavioural.observer

sealed class ObserveViewState {
    object SetNewName: ObserveViewState()
    object RemoveName: ObserveViewState()
}