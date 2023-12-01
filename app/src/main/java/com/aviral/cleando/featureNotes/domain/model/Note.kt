package com.aviral.cleando.featureNotes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.aviral.cleando.ui.theme.BabyBlue
import com.aviral.cleando.ui.theme.LightGreen
import com.aviral.cleando.ui.theme.RedOrange
import com.aviral.cleando.ui.theme.RedPink
import com.aviral.cleando.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNotesException(message: String) : Exception(message)
