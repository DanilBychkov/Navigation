package com.example.navigation.feature2.navigation

import androidx.navigation.NavHostController

/**
 * Навигироваться на 2ую фичу
 */
fun NavHostController.navigateToSecondFeature() {
    navigate(SecondFeatureScreens.SECOND_FEATURE_ROUTE)
}