package com.aviral.cleando.featureNotes.domain.useCase

import com.aviral.cleando.featureNotes.domain.model.Note
import com.aviral.cleando.featureNotes.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int) : Note? {
        return repository.getNoteById(id)
    }

}