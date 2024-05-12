package screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmp_notes.composeapp.generated.resources.Res
import kmp_notes.composeapp.generated.resources.notes
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeScreen() {

    val notes = listOf<String>(
        "Note 1",
        "Note 2",
        "Note 3",
        "Note 4",
        "Note 5",
        "Note 6",
        "Note 7",
        "Note 8",
        "Note 9",
        "Note 10",
        "Note 11",
        "Note 12",
        "Note 13",
        "Note 14",
        "Note 15",
        "Note 16",
        "Note 17",
        "Note 18",
        "Note 19",
        "Note 20"
    )

    Scaffold(topBar = {
        TopAppBar(title = { Text(stringResource(Res.string.notes)) })
    }, content = {

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(notes.size) {
                Card(modifier = Modifier.fillMaxWidth().padding(10.dp), elevation = 3.dp) {
                    Text(notes[it], modifier = Modifier.padding(10.dp))
                }
            }
        }

    }, floatingActionButton = {
        FloatingActionButton(onClick = {}) {
            Icon(Icons.Filled.Add, "")
        }
    })
}