package com.example.navigation.feature2.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.navigation.feature2.RegisterScreen
import com.example.navigation.navigation.Screens
import com.example.navigation.navigation.navigateToHomeScreen
import com.example.navigation.navigation.navigateToMenuScreen

fun NavGraphBuilder.registerSecondFeature(navController: NavController) {
    composable(route = Screens.Register.route) {
        RegisterScreen(
            navigateToHomeButtonClick = { navController.navigateToHomeScreen() },
            navigateToMenuButtonClick = { navController.navigateToMenuScreen() }
        )
    }
}