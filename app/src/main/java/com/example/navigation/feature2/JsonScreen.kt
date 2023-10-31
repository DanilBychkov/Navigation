package com.example.navigation.feature2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigation.feature2.data.TransferData

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JsonScreen(data: TransferData, onBackPressClick: () -> Unit) {
    Scaffold(
        topBar = { AppBar(onBackPressClick) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(horizontal = 16.dp)
        ) {
            Text("Hello from JsonScreen")
            Text("Data $data")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppBar(onBackPressClick: () -> Unit) {
    TopAppBar(
        title = { Text("Json Top App Bar") },
        navigationIcon = {
            IconButton(onClick = { onBackPressClick.invoke() }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = null)
            }
        }
    )
}