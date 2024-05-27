import androidx.room.RoomDatabase
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import database.NoteDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import org.koin.dsl.module
import viewmodel.NotesViewModel

fun appModule(databaseBuilder: RoomDatabase.Builder<NoteDatabase>) = module {
    single {
        databaseBuilder
            .fallbackToDestructiveMigration(true)
            .setDriver(BundledSQLiteDriver())
            .setQueryCoroutineContext(Dispatchers.IO)
            .build()
    }

    viewModelDefinition { NotesViewModel() }
}