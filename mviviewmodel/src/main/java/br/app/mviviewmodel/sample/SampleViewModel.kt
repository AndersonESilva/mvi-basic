package br.app.mviviewmodel.sample

import br.app.mviviewmodel.BaseViewModel

class SampleViewModel(reducer: SampleReducer): BaseViewModel<SampleState, SampleEvent>(reducer) {

    override fun setInitialState() = SampleState()
}