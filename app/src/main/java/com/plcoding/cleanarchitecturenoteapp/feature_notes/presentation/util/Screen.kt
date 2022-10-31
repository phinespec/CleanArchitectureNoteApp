package com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.util

sealed class Screen(val route: String) {
    object NotesListScreen: Screen("notes_list_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}