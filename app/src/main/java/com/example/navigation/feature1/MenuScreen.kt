package com.example.navigation.feature1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun MenuScreen(
    navigateToHomeButtonClick: () -> Unit,
    navigateToRegisterButtonClick: () -> Unit
) {
    Column {
        Text("Hello from Menu feature")
        Button(onClick = { navigateToHomeButtonClick.invoke() }) {
            Text(text = "Navigate to Home feature")
        }
        Button(onClick = { navigateToRegisterButtonClick.invoke() }) {
            Text(text = "Navigate to Register feature")
        }
    }
}