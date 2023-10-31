package com.example.navigation.feature2.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navigation.feature2.CoursesScreen
import com.example.navigation.feature2.IdScreen
import com.example.navigation.feature2.JsonScreen
import com.example.navigation.feature2.data.TransferData
import com.example.navigation.navigation.navigateSingleTopTo
import com.google.gson.Gson

fun NavGraphBuilder.registerSecondFeature(navController: NavHostController) {
    navigation(
        route = SecondFeatureScreens.SECOND_FEATURE_ROUTE,
        startDestination = SecondFeatureScreens.Courses.route
    ) {
        composable(
            route = SecondFeatureScreens.IdScreen.route,
            arguments = listOf(
                navArgument(SecondFeatureScreens.ID_KEY) {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val id = backStackEntry.arguments
                ?.getInt(SecondFeatureScreens.ID_KEY) ?: -1
            IdScreen(id) {
                navController.popBackStack()
            }
        }
        composable(route = SecondFeatureScreens.Courses.route) {
            CoursesScreen(onIdClick = { id ->
                navController.navigateSingleTopTo(
                    SecondFeatureScreens.IdScreen.getRouteWithArgs(
                        id
                    )
                )
            }, onJsonClick = { data ->
                navController.navigateSingleTopTo(
                    SecondFeatureScreens.JsonScreen.getRouteWithArgs(
                        data
                    )
                )
            }
            )
        }
        composable(
            route = SecondFeatureScreens.JsonScreen.route
        ) { backStackEntry ->
            /**
             * Специально не указал arguments
             */
            val jsonData = backStackEntry.arguments?.getString(SecondFeatureScreens.JSON_KEY) ?: ""
            val data = Gson().fromJson(jsonData, TransferData::class.java)
            JsonScreen(data = data) {
                navController.popBackStack()
            }
        }
    }
}