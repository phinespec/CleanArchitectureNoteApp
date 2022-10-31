package com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.add_edit_note

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
