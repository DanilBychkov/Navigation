package com.example.navigation.feature2

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CoursesScreen(onCourseClick: () -> Unit) {
    Column {
        Text("Hello from CoursesScreen")
        Button(onClick = { onCourseClick.invoke() }) {
            Text(text = "Button")
        }
    }
}