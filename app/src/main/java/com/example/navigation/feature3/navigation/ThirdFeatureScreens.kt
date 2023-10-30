package com.example.navigation.feature3.navigation

sealed class ThirdFeatureScreens(val route: String) {

    object DeeplinkScreen : ThirdFeatureScreens(DEEPLINK_ROUTE)

    companion object {
        const val THIRD_FEATURE_ROUTE = "THIRD_FEATURE_ROUTE"

        private const val DEEPLINK_ROUTE = "DEEPLINK_ROUTE"
    }
}