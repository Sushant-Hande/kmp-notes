package database

import androidx.room.Room
import androidx.room.RoomDatabase
import platform.Foundation.NSHomeDirectory

fun getDatabaseBuilder(): RoomDatabase.Builder<NoteDatabase> {
    val dbFile = NSHomeDirectory() + "/notes.db"
    return Room.databaseBuilder<NoteDatabase>(
        name = dbFile,
        factory = { NoteDatabase::class.instantiateImpl() }
    )
}