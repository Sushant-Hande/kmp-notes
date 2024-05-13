package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import composables.FilterView
import composables.NoteView
import kmp_notes.composeapp.generated.resources.Res
import kmp_notes.composeapp.generated.resources.notes
import models.Filter
import models.Note
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val notes = listOf(
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
        Note(
            title = "Tax payment before 15th Jan",
            content = "This is reminder note, so as  not to forget to pay taxes. This is reminder note, so as  not to forget to pay taxes."
        ),
    )

    val filterList = listOf(
        Filter(id = 1, name = "All(20)"),
        Filter(id = 2, name = "Important"),
        Filter(id = 3, name = "Bookmarked"),
        Filter(id = 4, name = "Work"),
        Filter(id = 5, name = "Personal"),
    )

    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(Res.string.notes), color = Color.White) },
            colors = TopAppBarColors(
                containerColor = Color.Black,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White,
                scrolledContainerColor = Color.Black
            ),
            actions = {
                IconButton(onClick = { }) {
                    Icon(Icons.Filled.Settings, contentDescription = null)
                }
            }
        )
    }, content = { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues = paddingValues)) {
            FilterView(filterList = filterList)

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.background(Color.Black)
            ) {
                items(notes.size) {
                    NoteView(notes[it])
                }
            }
        }
    }, floatingActionButton = {
        FloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "")
        }
    })
}