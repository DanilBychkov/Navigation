package com.example.navigation.feature1.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.feature1.HomeScreen
import com.example.navigation.feature1.MenuScreen
import com.example.navigation.navigation.Screens
import com.example.navigation.navigation.navigateToHomeScreen
import com.example.navigation.navigation.navigateToMenuScreen
import com.example.navigation.navigation.navigateToRegisterScreen

fun NavGraphBuilder.registerFirstFeature(navController: NavController) {
    navigation(
        startDestination = Screens.Home.route,
        route = Screens.FIRST_FEATURE_ROUTE
    ) {
        composable(route = Screens.Home.route) {
            HomeScreen(
                navigateToMenuButtonClick = { navController.navigateToMenuScreen() },
                navigateToRegisterButtonClick = { navController.navigateToRegisterScreen() }
            )
        }
        composable(route = Screens.Menu.route) {
            MenuScreen(
                navigateToHomeButtonClick = { navController.navigateToHomeScreen() },
                navigateToRegisterButtonClick = { navController.navigateToRegisterScreen() }
            )
        }
    }
}