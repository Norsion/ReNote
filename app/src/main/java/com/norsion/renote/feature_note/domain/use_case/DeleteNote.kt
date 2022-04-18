package com.norsion.renote.feature_note.domain.use_case

import com.norsion.renote.feature_note.domain.model.Note
import com.norsion.renote.feature_note.domain.repository.INoteRepository

class DeleteNote(
    private val repository: INoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }

}