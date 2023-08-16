package com.kat4x.decomposeplayground.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kat4x.decomposeplayground.ui.theme.DecomposeplaygroundTheme

@Composable
fun ListItem(
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.tertiaryContainer)
            .padding(16.dp)
    ) {
        Text(
            text = value,
            style = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onTertiaryContainer)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ListItemPreview() {
    DecomposeplaygroundTheme {
        Box(Modifier.padding(16.dp)) {
            ListItem(
                value = "Item",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}