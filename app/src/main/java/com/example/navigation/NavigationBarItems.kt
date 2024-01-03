package com.example.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.navigation.feature1.navigation.FirstFeatureScreens
import com.example.navigation.feature2.navigation.SecondFeatureScreens

sealed class NavigationBarItems(val route: String, val title: String, val icon: ImageVector) {

    object FirstFeature : NavigationBarItems(
        route = FirstFeatureScreens.FIRST_FEATURE_ROUTE,
        title = "Фича 1",
        icon = Icons.Filled.Star
    )

    object SecondFeature : NavigationBarItems(
        route = SecondFeatureScreens.SECOND_FEATURE_ROUTE,
        title = "Фича 2",
        icon = Icons.Filled.AccountBox
    )

    companion object {
        fun getBarItems() = listOf(FirstFeature, SecondFeature)
    }
}
