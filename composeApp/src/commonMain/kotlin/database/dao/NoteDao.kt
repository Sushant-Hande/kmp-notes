package database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import database.entities.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Insert
    suspend fun insert(item: Note)

    @Update
    suspend fun update(note: Note)

    @Delete
    suspend fun delete(note: Note): Int

    @Query("SELECT count(*) FROM Note")
    suspend fun count(): Int

    @Query("SELECT * FROM Note")
    fun getAllNotes(): Flow<List<Note>>
}