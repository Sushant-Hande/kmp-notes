package database

import androidx.room.Database
import androidx.room.RoomDatabase
import database.dao.NoteDao
import database.entities.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun getNoteDao(): NoteDao
}