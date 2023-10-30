package com.example.navigation.feature3.navigation

import androidx.navigation.NavHostController

/**
 * Навигироваться на 3ую фичу
 */
fun NavHostController.navigateToThirdFeature() {
    navigate(ThirdFeatureScreens.THIRD_FEATURE_ROUTE)
}