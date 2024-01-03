package com.example.navigation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navigation.feature1.navigation.registerFirstFeature
import com.example.navigation.feature2.navigation.registerSecondFeature
import com.example.navigation.navigation.NavigationLogger
import com.example.navigation.navigation.navigatePopUpTo
import com.example.navigation.ui.theme.NavigationTheme

/**
 * TODO Добавить свой NavType!!!
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                val navController = rememberNavController()
                MainScreen(navController)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MainScreen(navHostController: NavHostController) {
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()

    val barItemRoutes = NavigationBarItems.getBarItems().map { it.route }
    val currentRouteIsStartRoute =
        navBackStackEntry?.destination?.parent?.startDestinationRoute == navBackStackEntry?.destination?.route
    val isBottomBarVisible =
        barItemRoutes.contains(navBackStackEntry?.destination?.parent?.route) && currentRouteIsStartRoute

    Column {
        NavigationLogger(navHostController, LOGGER_HEIGHT)
        Scaffold(
            bottomBar = {
                if (isBottomBarVisible) {
                    BottomBar(navHostController, navBackStackEntry)
                }
            },
            modifier = Modifier.fillMaxSize()
        ) { padding ->
            NavHost(
                modifier = Modifier.padding(padding),
                navController = navHostController,
                startDestination = NavigationBarItems.FirstFeature.route,
            ) {
                registerFirstFeature(navHostController)
                registerSecondFeature(navHostController)
            }
        }
    }
}

@Composable
private fun BottomBar(navHostController: NavHostController, navBackStackEntry: NavBackStackEntry?) {
    val hierarchy = navBackStackEntry?.destination?.hierarchy
    Log.d("Hierarchy", hierarchy?.toList().toString())
    Log.d("NavDest", navBackStackEntry?.destination?.parent?.route.toString())

    val barItems = NavigationBarItems.getBarItems()
    NavigationBar {
        barItems.forEachIndexed { index, item ->
            val isSelected = hierarchy?.any { navDestination ->
                navDestination.route == item.route
            } ?: false

            NavigationBarItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = isSelected,
                onClick = {
                    navHostController.navigatePopUpTo(barItems[index].route)
                },
            )
        }
    }
}

/**
 * Высота логгера
 */
private val LOGGER_HEIGHT = 100.dp
