package com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.notes_list

import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.util.NoteOrder

sealed class NotesListEvent {
    data class Order(val noteOrder: NoteOrder): NotesListEvent()
    data class DeleteNote(val note: Note): NotesListEvent()
    object RestoreNote: NotesListEvent()
    object ToggleOrderSection: NotesListEvent()
}
