package com.example.navigation.feature1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    navigateToMenuButtonClick: () -> Unit,
    navigateToRegisterButtonClick: () -> Unit,
    navigateToHomeButtonClick: () -> Unit
) {
    Column {
        Text("Hello from Home feature")
        Button(onClick = { navigateToMenuButtonClick.invoke() }) {
            Text(text = "Navigate to Menu feature")
        }
        Button(onClick = { navigateToRegisterButtonClick.invoke() }) {
            Text(text = "Navigate to Register feature")
        }
        Button(onClick = { navigateToHomeButtonClick.invoke() }) {
            Text(text = "Navigate to This feature")
        }
    }
}
