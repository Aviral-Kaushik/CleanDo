package com.aviral.cleando.di

import android.content.Context
import androidx.room.Room
import com.aviral.cleando.featureNotes.data.dataSource.NoteDatabase
import com.aviral.cleando.featureNotes.data.repository.NoteRepositoryImplementation
import com.aviral.cleando.featureNotes.domain.repository.NoteRepository
import com.aviral.cleando.featureNotes.domain.useCase.AddNote
import com.aviral.cleando.featureNotes.domain.useCase.DeleteNote
import com.aviral.cleando.featureNotes.domain.useCase.GetNotes
import com.aviral.cleando.featureNotes.domain.useCase.NoteUseCases

interface AppModule {

    val roomDatabase : NoteDatabase

    val notesRepository: NoteRepository

    val noteUseCases: NoteUseCases

}

class AppModuleImplementation(
    private val context: Context
) : AppModule {

    override val roomDatabase: NoteDatabase by lazy {
        Room.databaseBuilder(
            context,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    override val notesRepository: NoteRepository by lazy {
        NoteRepositoryImplementation(roomDatabase.noteDao)
    }

    override val noteUseCases: NoteUseCases by lazy {
        NoteUseCases(
            getNotes = GetNotes(notesRepository),
            deleteNote = DeleteNote(notesRepository),
            addNote = AddNote(notesRepository)
        )
    }

}