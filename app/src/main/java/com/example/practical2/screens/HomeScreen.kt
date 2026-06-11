
package com.example.practical2.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController, username: String) {
    Column(
        modifier = Modifier.fillMaxSize().systemBarsPadding().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome, $username!", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(24.dp))

        Button(onClick = {
            navController.navigate("login") {
                popUpTo("login") { inclusive = true }
            }
        }) {
            Text("Logout")
        }
    }
}