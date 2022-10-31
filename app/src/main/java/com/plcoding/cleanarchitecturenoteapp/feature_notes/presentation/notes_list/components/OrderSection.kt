package com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.notes_list.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_notes.domain.util.OrderType
import com.plcoding.cleanarchitecturenoteapp.feature_notes.presentation.ui.theme.CleanArchitectureNoteAppTheme


@Composable
fun OrderSection(
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onChangeOrder: (NoteOrder) -> Unit = {}
) {

    val horizontalSpacing = 8.dp
    val verticalSpacing = 16.dp

    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            DefaultRadioButton(
                text = "Title",
                isSelected = noteOrder is NoteOrder.Title,
                onSelect = { onChangeOrder(NoteOrder.Title(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(horizontalSpacing))
            DefaultRadioButton(
                text = "Date",
                isSelected = noteOrder is NoteOrder.Date,
                onSelect = { onChangeOrder(NoteOrder.Date(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(horizontalSpacing))
            DefaultRadioButton(
                text = "Color",
                isSelected = noteOrder is NoteOrder.Color,
                onSelect = { onChangeOrder(NoteOrder.Color(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(horizontalSpacing))
        }
        Spacer(modifier = Modifier.height(verticalSpacing))
        Row(Modifier.fillMaxWidth()) {
            DefaultRadioButton(
                text = "Ascending",
                isSelected = noteOrder.orderType is OrderType.Ascending,
                onSelect = { onChangeOrder(noteOrder.copy(OrderType.Ascending)) }
            )
            Spacer(modifier = Modifier.width(horizontalSpacing))
            DefaultRadioButton(
                text = "Descending",
                isSelected = noteOrder.orderType is OrderType.Descending,
                onSelect = { onChangeOrder(noteOrder.copy(OrderType.Descending)) }
            )
        }
    }

}

@Preview
@Composable
fun OrderSectionPreviewComposable(

) {
    CleanArchitectureNoteAppTheme {
        OrderSection()
    }
}