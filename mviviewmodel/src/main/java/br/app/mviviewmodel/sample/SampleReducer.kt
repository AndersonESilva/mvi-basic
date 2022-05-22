package br.app.mviviewmodel.sample

import br.app.mviviewmodel.Reducer

class SampleReducer: Reducer<SampleState, SampleEvent> {

    override fun invoke(state: SampleState?, event: SampleEvent): SampleState = state?.let{ state->
        when(event){
            is SampleEvent.Initial -> state.copy(lastEvent = event)
            is SampleEvent.Final -> state.copy(lastEvent = event)
        }
    } ?: SampleState()
}
