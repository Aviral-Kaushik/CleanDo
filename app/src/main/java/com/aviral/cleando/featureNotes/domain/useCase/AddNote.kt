package com.aviral.cleando.featureNotes.domain.useCase

import com.aviral.cleando.featureNotes.domain.model.InvalidNotesException
import com.aviral.cleando.featureNotes.domain.model.Note
import com.aviral.cleando.featureNotes.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNotesException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNotesException("Title of the note cannot be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNotesException("Content of the note cannot be empty")
        }
        repository.insertNote(note)
    }

}