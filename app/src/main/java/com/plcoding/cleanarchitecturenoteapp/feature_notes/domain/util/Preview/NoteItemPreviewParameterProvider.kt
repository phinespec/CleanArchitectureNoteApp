package com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.util.Preview

import android.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.model.Note

class NoteItemPreviewParameterProvider : PreviewParameterProvider<Note> {
    override val values: Sequence<Note>
        get() = sequenceOf(
            Note(
                "Some Title",
                "Some note content. Blah blah blah. Yadda yadda yadda",
                0,
                Color.CYAN,
                null
            )
        )
}