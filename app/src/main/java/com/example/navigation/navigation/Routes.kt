package com.example.navigation.navigation

import androidx.navigation.NavController

fun NavController.navigateToHomeScreen() {
    navigate(Screens.Home.route)
}

fun NavController.navigateToMenuScreen() {
    navigate(Screens.Menu.route)
}

fun NavController.navigateToRegisterScreen() {
    navigate(Screens.Register.route)
}