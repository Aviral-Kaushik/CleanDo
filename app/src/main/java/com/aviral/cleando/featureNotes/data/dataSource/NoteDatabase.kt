package com.aviral.cleando.featureNotes.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aviral.cleando.featureNotes.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase(){

    abstract val noteDao: NoteDao

}