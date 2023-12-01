package com.aviral.cleando.featureNotes.presentation.notes

import com.aviral.cleando.featureNotes.domain.model.Note
import com.aviral.cleando.featureNotes.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val notes: Note) : NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
