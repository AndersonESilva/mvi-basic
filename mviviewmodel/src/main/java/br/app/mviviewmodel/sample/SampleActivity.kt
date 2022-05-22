package br.app.mviviewmodel.sample

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SampleActivity: AppCompatActivity() {

    private lateinit var viewModel: SampleViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        viewModel = SampleViewModel(SampleReducer())

        viewModel.state.observe(this) { state ->
            when(state.lastEvent){
                is SampleEvent.Initial -> {}
                is SampleEvent.Final -> action(state.lastEvent.bool)
            }
        }
    }

    private fun action(boolean: Boolean){}
}
