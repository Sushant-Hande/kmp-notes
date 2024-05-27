package com.sushanthande.noteapp.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import database.NoteDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<NoteDatabase> {
    val dbFile = context.getDatabasePath("notes.db")
    return Room.databaseBuilder<NoteDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    )
}