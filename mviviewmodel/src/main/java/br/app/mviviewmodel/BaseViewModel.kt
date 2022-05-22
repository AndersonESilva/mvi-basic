package br.app.mviviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel<State, Event>(private val reducer: Reducer<State, Event>): ViewModel() {
    val state = MutableLiveData<State>().apply { value = setInitialState() }

    val currentState: State?
        get() = state.value

    abstract fun setInitialState(): State

    fun updateState(newEvent: Event) {
        state.value = reducer(currentState, newEvent)
    }
}
