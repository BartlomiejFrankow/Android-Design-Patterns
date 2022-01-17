package com.example.androiddesignpatterns.patternsCategories.behavioural.observer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ObserveViewModel @Inject constructor() : ViewModel() {

    private val _viewState = MutableSharedFlow<ObserveViewState>()
    val viewState = _viewState.asSharedFlow()

    init {
        changeName()
    }

    private fun changeName() {
        viewModelScope.launch {
            _viewState.emit(ObserveViewState.SetObserveName)
        }
    }

}
