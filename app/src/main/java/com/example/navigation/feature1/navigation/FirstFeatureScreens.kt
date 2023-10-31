package com.example.navigation.feature1.navigation

sealed class FirstFeatureScreens(val route: String) {

    object Register : FirstFeatureScreens(REGISTER_ROUTE)

    companion object {
        const val FIRST_FEATURE_ROUTE = "FIRST_FEATURE_ROUTE"

        private const val REGISTER_ROUTE = "REGISTER_ROUTE"
    }
}
