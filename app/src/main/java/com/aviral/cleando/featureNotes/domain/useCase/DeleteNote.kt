package com.aviral.cleando.featureNotes.domain.useCase

import com.aviral.cleando.featureNotes.domain.model.Note
import com.aviral.cleando.featureNotes.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        return repository.deleteMote(note)
    }

}