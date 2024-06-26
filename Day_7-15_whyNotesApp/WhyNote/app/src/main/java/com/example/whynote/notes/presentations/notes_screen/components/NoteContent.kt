package com.example.whynote.notes.presentations.notes_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.whynote.notes.data.room.NoteViewModel

@Composable
fun NoteContent(viewModel: NoteViewModel, navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(top = 60.dp)
            .fillMaxHeight(0.9f)
            .background(MaterialTheme.colorScheme.onPrimary)
    ) {
        NoteList(
            viewModel,
            navController
        )
    }

}