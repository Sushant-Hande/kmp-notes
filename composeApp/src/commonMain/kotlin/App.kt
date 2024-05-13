import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import navigation.AppNavHost
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.KMPNotesTheme

@Composable
@Preview
fun App() {
    KMPNotesTheme {
        val navController = rememberNavController()
        AppNavHost(navController = navController)
    }
}