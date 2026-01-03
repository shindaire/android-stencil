package com.app.feature.example.presentation.mvi
        
import androidx.compose.runtime.Immutable
import com.app.core.ui.mvi.UiState

internal object ExampleContract {
        
    @Immutable
    data class State(
        override val isLoading: Boolean = false,
        override val error: Throwable? = null
       // Define your state properties here
    ) : UiState
            
    sealed interface Intent {
        // Define your intents here
    }
            
    sealed interface Effect {
        // Define your effects here
    }
}