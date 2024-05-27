package database

import androidx.room.Room
import androidx.room.RoomDatabase
import java.io.File

fun getDatabaseBuilder(): RoomDatabase.Builder<NoteDatabase> {
    val dbFile = File(System.getProperty("java.io.tmpdir"), "notes.db")
    return Room.databaseBuilder<NoteDatabase>(
        name = dbFile.absolutePath,
    )
}