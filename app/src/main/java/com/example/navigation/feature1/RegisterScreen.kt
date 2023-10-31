package com.example.navigation.feature1

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun RegisterScreen() {
    var countSavedByRemember by remember { mutableIntStateOf(0) }
    var countSavedByRememberSaveable by rememberSaveable { mutableIntStateOf(0) }

    Column {
        Text("Hello from Register screen")
        Button(onClick = { countSavedByRemember++ }) {
            Column {
                Text("Count saved by remember")
                Text("Count $countSavedByRemember")
            }
        }
        Button(onClick = { countSavedByRememberSaveable++ }) {
            Column {
                Text("Count saved by rememberSaveable")
                Text("Count $countSavedByRememberSaveable")
            }
        }
    }
}
