package com.example.navigation.feature2.navigation

sealed class SecondFeatureScreens(val route: String) {

    object Courses : SecondFeatureScreens(COURSES_ROUTE)

    object Course : SecondFeatureScreens(COURSE_ROUTE)

    companion object {
        const val SECOND_FEATURE_ROUTE = "SECOND_FEATURE_ROUTE"

        private const val COURSES_ROUTE = "COURSES"
        private const val COURSE_ROUTE = "COURSE"
    }
}
