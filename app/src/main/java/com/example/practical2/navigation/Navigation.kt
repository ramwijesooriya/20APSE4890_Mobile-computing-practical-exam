package com.example.practical2.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practical2.screens.HomeScreen
import com.example.practical2.screens.LoginScreen
import com.example.practical2.screens.RegisterScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "register") {

        composable("register") { RegisterScreen(navController) }

        composable("login") { LoginScreen(navController) }

        composable(
            route = "home/{username}",
            arguments = listOf(navArgument("username") { type = NavType.StringType })
        ) { backStackEntry ->
            val username = backStackEntry.arguments?.getString("username") ?: ""
            HomeScreen(navController, username)
        }
    }
}