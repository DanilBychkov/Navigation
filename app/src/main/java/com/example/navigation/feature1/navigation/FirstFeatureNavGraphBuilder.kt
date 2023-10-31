package com.example.navigation.feature1.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.feature1.RegisterScreen

fun NavGraphBuilder.registerFirstFeature(navController: NavHostController) {
    navigation(
        startDestination = FirstFeatureScreens.Register.route,
        route = FirstFeatureScreens.FIRST_FEATURE_ROUTE
    ) {
        composable(route = FirstFeatureScreens.Register.route) {
            RegisterScreen()
        }
    }
}


