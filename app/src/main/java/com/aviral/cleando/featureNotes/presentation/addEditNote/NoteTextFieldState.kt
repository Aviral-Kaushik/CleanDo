package com.aviral.cleando.featureNotes.presentation.addEditNote

data class NoteTextFieldState(
    val text: String = "",
    val hintText: String = "",
    val isHintVisible: Boolean = true
)
