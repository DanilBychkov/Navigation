package com.example.navigation.feature2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CourseScreen() {
    Scaffold(
        topBar = { AppBar() }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            Text("Hello from CourseScreen")

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppBar() {
    TopAppBar(
        title = {
            Text("Course Top App Bar")
        },
        navigationIcon = {
            Icon(imageVector = Icons.Filled.Star, contentDescription = null)
        }
    )
}