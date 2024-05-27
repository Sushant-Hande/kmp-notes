import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.room.RoomDatabase
import database.NoteDatabase
import navigation.AppNavHost
import org.koin.compose.KoinApplication
import ui.KMPNotesTheme

@Composable
fun App(databaseBuilder: RoomDatabase.Builder<NoteDatabase>) {
    KoinApplication(application = {
        modules(appModule(databaseBuilder))
    }) {
        KMPNotesTheme {
            val navController = rememberNavController()
            AppNavHost(navController = navController)
        }
    }
}