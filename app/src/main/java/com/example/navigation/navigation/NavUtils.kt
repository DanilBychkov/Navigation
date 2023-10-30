package com.example.navigation.navigation

import android.util.Log
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

/**
 * Флаг launchSingleTop позволяет хранить только 1 экземпляр экрана в composable функции вверху стэка
 */
fun NavHostController.navigateSingleTopTo(route: String) =
    navigate(route) { launchSingleTop = true }

/**
 * popUpTo Говорит до какого экрана следует убирать все экраны из BackStack
 * saveState Позволяет сохранить стейт экранов
 * restoreState Позволяет восстановить стейт
 */
fun NavHostController.navigatePopUpTo(route: String) {
    val startDestination = graph.findStartDestination()
    Log.d("StartDestinationRoute", startDestination.route.toString())
    navigate(route) {
        popUpTo(startDestination.id) {
            saveState = true
        }
        restoreState = true
        launchSingleTop = true
    }
}

/**
 * Вариант подписки на изменение BackStack навигации
 */
@Composable
fun NavigationLogger(navHostController: NavHostController, loggerHeight: Dp) {
    val backStackRoutes = rememberSaveable { mutableStateOf("") }

    LaunchedEffect(Unit) {
        val routes = StringBuilder()
        navHostController.currentBackStack.collect { backStackEntry ->
            routes.clear()
            routes.append("Routes: ")
            backStackEntry.forEach { entry ->
                entry.destination.route?.let { route ->
                    routes.append(route)
                    routes.append("; ")
                }
            }
            backStackRoutes.value = routes.toString()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(loggerHeight)
            .background(Color.LightGray)
            .verticalScroll(ScrollState(0))
    ) {
        Text(text = backStackRoutes.value)
    }
}
