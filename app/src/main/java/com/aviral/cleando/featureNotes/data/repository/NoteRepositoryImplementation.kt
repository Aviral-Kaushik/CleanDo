package com.aviral.cleando.featureNotes.data.repository

import com.aviral.cleando.featureNotes.data.dataSource.NoteDao
import com.aviral.cleando.featureNotes.domain.model.Note
import com.aviral.cleando.featureNotes.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImplementation(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteMote(note: Note) {
        dao.deleteNote(note)
    }

}