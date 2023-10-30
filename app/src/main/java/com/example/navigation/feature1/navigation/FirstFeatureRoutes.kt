package com.example.navigation.feature1.navigation

import androidx.navigation.NavHostController


/**
 * Навигироваться на главный экран используя дефолтную реализацию
 */
fun NavHostController.navigateToHomeScreen() {
    navigate(FirstFeatureScreens.Home.route)
}

/**
 * Навигироваться на экран меню используя launchSingleTop = true
 */
fun NavHostController.navigateToMenuScreen() {
    navigate(FirstFeatureScreens.Menu.route)
}

/**
 * Навигироваться на экран регистрации
 */
fun NavHostController.navigateToRegisterScreen() {
    navigate(FirstFeatureScreens.Register.route)
}

/**
 * Навигироваться на первую фичу
 */
fun NavHostController.navigateToFirstFeature() {
    navigate(FirstFeatureScreens.FIRST_FEATURE_ROUTE)
}