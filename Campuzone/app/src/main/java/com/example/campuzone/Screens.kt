package com.example.campuzone

import java.util.*

sealed class Screens(val route:String){

    object LoginScreen:Screens("Login")
    object LevelOneScreen:Screens("LevelOne")
    object LevelTwoScreen:Screens("LevelTwo")
    object SubmittedScreen:Screens("Submitted")

}