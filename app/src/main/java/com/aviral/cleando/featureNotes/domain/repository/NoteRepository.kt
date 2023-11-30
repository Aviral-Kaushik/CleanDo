package com.aviral.cleando.featureNotes.domain.repository

import com.aviral.cleando.featureNotes.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes() : Flow<List<Note>>

    suspend fun getNoteById(id: Int) : Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteMote(note: Note)

}