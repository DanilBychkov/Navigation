package com.example.navigation.feature2.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.feature2.CourseScreen
import com.example.navigation.feature2.CoursesScreen
import com.example.navigation.navigation.navigateSingleTopTo

fun NavGraphBuilder.registerSecondFeature(navController: NavHostController) {
    navigation(
        route = SecondFeatureScreens.SECOND_FEATURE_ROUTE,
        startDestination = SecondFeatureScreens.Courses.route
    ) {
        composable(route = SecondFeatureScreens.Course.route) {
            CourseScreen()
        }
        composable(route = SecondFeatureScreens.Courses.route) {
            CoursesScreen {
                navController.navigateSingleTopTo(SecondFeatureScreens.Course.route)
            }
        }
    }
}