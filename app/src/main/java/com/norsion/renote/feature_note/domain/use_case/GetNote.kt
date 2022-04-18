package com.norsion.renote.feature_note.domain.use_case

import com.norsion.renote.feature_note.domain.model.Note
import com.norsion.renote.feature_note.domain.repository.INoteRepository

class GetNote(
    private val repository:INoteRepository
) {

    suspend operator fun invoke(id:Int): Note? {
        return repository.getNoteById(id)
    }
}