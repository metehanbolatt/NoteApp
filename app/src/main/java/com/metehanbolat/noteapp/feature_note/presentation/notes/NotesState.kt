package com.metehanbolat.noteapp.feature_note.presentation.notes

import com.metehanbolat.noteapp.feature_note.domain.model.Note
import com.metehanbolat.noteapp.feature_note.domain.util.NoteOrder
import com.metehanbolat.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
