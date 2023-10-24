package com.example.navigation.navigation

sealed class Screens(val route: String) {

    object Home : Screens(HOME_ROUTE)

    object Menu : Screens(MENU_ROUTE)

    object Register : Screens(REGISTER_ROUTE)

    companion object {
        const val FIRST_FEATURE_ROUTE = "FIRST_FEATURE_ROUTE"

        private const val HOME_ROUTE = "HOME_ROUTE"
        private const val MENU_ROUTE = "MENU_ROUTE"
        private const val REGISTER_ROUTE = "REGISTER_ROUTE"
    }
}
