package com.example.moviecounter

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DemoLazyColumn() {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(5) { index ->
            Text(text = "Elemento #$index")
        }
    }
}