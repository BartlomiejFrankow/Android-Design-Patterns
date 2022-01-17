package com.example.androiddesignpatterns.patternsCategories.behavioural.observer

sealed class ObserveViewState {
    object SetObserveName: ObserveViewState()
    object RemoveName: ObserveViewState()
}