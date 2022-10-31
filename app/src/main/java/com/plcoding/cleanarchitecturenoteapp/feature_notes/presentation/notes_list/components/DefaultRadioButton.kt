package com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.notes_list.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.ui.theme.CleanArchitectureNoteAppTheme

@Composable
fun DefaultRadioButton(
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean,
    onSelect: () -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = isSelected,
            onClick = onSelect,
            colors = RadioButtonDefaults.colors(
                selectedColor = MaterialTheme.colors.primary,
                unselectedColor = MaterialTheme.colors.onBackground
            )
        )
        Spacer(modifier = modifier.width(8.dp))
        Text(
            text = text,
            style = MaterialTheme.typography.body1
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewComposable() {
    CleanArchitectureNoteAppTheme {
        DefaultRadioButton(
            text = "Preview",
            isSelected = true,
            onSelect = {}
        )
    }
}