package br.app.mviviewmodel.sample

sealed class SampleEvent{
    object Initial: SampleEvent()
    data class Final(val bool: Boolean): SampleEvent()
}

data class SampleState(
    val lastEvent: SampleEvent? = null
)
