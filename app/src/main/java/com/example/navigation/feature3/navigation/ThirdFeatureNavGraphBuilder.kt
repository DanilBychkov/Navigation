package com.example.navigation.feature3.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.feature3.DeeplinkScreen

fun NavGraphBuilder.registerThirdFeature(navHostController: NavHostController) {
    navigation(
        startDestination = ThirdFeatureScreens.DeeplinkScreen.route,
        route = ThirdFeatureScreens.THIRD_FEATURE_ROUTE
    ) {
        composable(route = ThirdFeatureScreens.DeeplinkScreen.route) {
            DeeplinkScreen()
        }
    }
}