package composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import models.Filter

@Composable
fun FilterView(filterList: List<Filter>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black)
            .padding(10.dp)
    ) {
        items(items = filterList, itemContent = {
            Box(
                modifier = Modifier.padding(end = 8.dp)
                    .border(BorderStroke(1.dp, Color.Gray), RoundedCornerShape(20.dp))
                    .padding(5.dp)
            ) {
                Text(
                    it.name,
                    color = Color.Gray,
                    modifier = Modifier.padding(start = 3.dp, end = 3.dp, top = 2.dp, bottom = 2.dp)
                )
            }
        })
    }
}