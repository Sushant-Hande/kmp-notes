import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import database.getDatabaseBuilder

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp-notes",
    ) {

        val databaseBuilder = remember { getDatabaseBuilder() }

        App(databaseBuilder = databaseBuilder)
    }
}