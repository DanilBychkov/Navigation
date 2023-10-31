package com.example.navigation.feature2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.navigation.feature2.data.TransferData

@Composable
fun CoursesScreen(onIdClick: (id: Int) -> Unit, onJsonClick: (data: TransferData) -> Unit) {
    val id = 5
    val data = TransferData()
    Column {
        Text("Hello from CoursesScreen")
        Button(onClick = { onIdClick.invoke(id) }) {
            Text(text = "Navigate to IdScreen")
        }
        Button(onClick = { onJsonClick.invoke(data) }) {
            Text(text = "Navigate to JsonScreen")
        }
    }
}