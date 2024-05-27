package viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class NotesViewModel : ViewModel() {

    private val _timer = MutableStateFlow(0)

    init {
        startTimer()
    }

    private fun startTimer() {
        viewModelScope.launch(Dispatchers.IO) {
            while (true) {
                delay(1000)
                _timer.value++
            }
        }
    }

}