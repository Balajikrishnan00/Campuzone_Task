package com.example.campuzone

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController:NavHostController){
    NavHost(navController = navController, startDestination = "Login"){

        composable(route = Screens.LoginScreen.route){
            LoginScreen(navController=navController)
        }
        composable(route = Screens.LevelOneScreen.route){
            LevelOneScreen(navController=navController)
        }
        composable(route = Screens.LevelTwoScreen.route){
            LevelTwoScreen(navController = navController)
        }
        composable(route = Screens.SubmittedScreen.route){
            SubmittedScreen()
        }
    }
}