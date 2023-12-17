package com.aviral.cleando.featureNotes.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.aviral.cleando.ui.theme.CleanDoTheme

class MainActivity : ComponentActivity() {

    /**
     * TODO Try to figure out the SavedStateHandle that Dragger Hilt automatically handles and put it
     *      as parameter to AddEditNoteViewModer
     * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanDoTheme {

            }
        }
    }
}