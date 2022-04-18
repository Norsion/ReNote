package com.norsion.renote.feature_note.presentation.add_edit_note

data class NoteTextFieldState(
    val text:String = "",
    val hint:String = "",
    val isHintVisible:Boolean = true
)
