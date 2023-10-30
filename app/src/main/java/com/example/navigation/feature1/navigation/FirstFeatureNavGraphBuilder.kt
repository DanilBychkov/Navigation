package com.example.navigation.feature1.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.feature1.HomeScreen
import com.example.navigation.feature1.MenuScreen
import com.example.navigation.feature1.RegisterScreen

fun NavGraphBuilder.registerFirstFeature(navController: NavHostController) {
    navigation(
        startDestination = FirstFeatureScreens.Register.route,
        route = FirstFeatureScreens.FIRST_FEATURE_ROUTE
    ) {
        composable(route = FirstFeatureScreens.Home.route) {
            HomeScreen(
                navigateToMenuButtonClick = { navController.navigateToMenuScreen() },
                navigateToRegisterButtonClick = { navController.navigateToRegisterScreen() },
                navigateToHomeButtonClick = { navController.navigateToHomeScreen() }
            )
        }
        composable(route = FirstFeatureScreens.Menu.route) {
            MenuScreen(
                navigateToHomeButtonClick = { navController.navigateToHomeScreen() },
                navigateToRegisterButtonClick = { navController.navigateToRegisterScreen() },
                navigateToMenuButtonClick = { navController.navigateToMenuScreen() }
            )
        }
        composable(route = FirstFeatureScreens.Register.route) {
            RegisterScreen(
                navigateToHomeButtonClick = { navController.navigateToHomeScreen() },
                navigateToMenuButtonClick = { navController.navigateToMenuScreen() })
        }
    }
}


