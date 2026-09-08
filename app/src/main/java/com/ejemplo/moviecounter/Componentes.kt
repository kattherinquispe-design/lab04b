package com.example.moviecounter
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.TextButton
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DemoLazyColumn() {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(count = 5) { index ->
            Text(text = "Elemento #$index")
        }
    }
}

@Composable
fun DemoCardAndFab() {
    Card {
        Text(text = "Tarjeta de prueba", modifier = Modifier.padding(16.dp))
    }
    FloatingActionButton(onClick = { }) {
        Text("+")
    }
}
@Composable
fun DemoAlertDialog() {
    AlertDialog(
        onDismissRequest = { },
        confirmButton = {
            TextButton(onClick = { }) { Text("OK") }
        },
        title = { Text("Aviso") },
        text = { Text("Este es un AlertDialog de prueba.") }
    )
}