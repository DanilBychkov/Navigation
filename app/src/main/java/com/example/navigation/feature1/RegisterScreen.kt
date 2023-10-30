package com.example.navigation.feature1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RegisterScreen(
    navigateToHomeButtonClick: () -> Unit,
    navigateToMenuButtonClick: () -> Unit
) {
    Column {
        Text("Hello from Register screen")
        Button(onClick = { navigateToHomeButtonClick.invoke() }) {
            Text(text = "Navigate to Home feature")
        }
        Button(onClick = { navigateToMenuButtonClick.invoke() }) {
            Text(text = "Navigate to Menu feature")
        }
    }
}
