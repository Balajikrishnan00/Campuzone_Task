package com.example.campuzone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun LoginScreen(navController:NavHostController){

    val scaffold = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    var nameText by remember { mutableStateOf("") }
    var emailText by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    val education by remember { mutableStateOf("") }
    val genderOptions = listOf("Male","Female","Trans")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(genderOptions[0]) }

    
    Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffold) {
        Box(modifier = Modifier.fillMaxSize()){
            Column(modifier = Modifier.fillMaxSize()) {

                Column(modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Magenta)) {
                }

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center) {

                    Text(text = "Campuzone",Modifier.padding(top = 60.dp),
                        fontSize = 24.sp,
                        color =Color.Magenta, fontWeight = FontWeight.Bold )
                }
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {

                    TextField(value = nameText,
                        label = {Text("Enter Your Name")},
                        onValueChange = {nameText=it}, singleLine = true)

                    TextField(value = emailText,
                        label = { Text(text = "Enter Your Email")},
                        onValueChange = {emailText = it},singleLine = true)

                    TextField(value = phone,
                        label = { Text(text = "Enter Your Age")},
                        onValueChange = {phone = it},singleLine = true)

                    ExposedDropdownMenuBox(expanded =expanded ,
                        onExpandedChange ={
                            expanded = !expanded
                        } ) {
                        TextField(value = selectedOptionText,
                            onValueChange ={},
                            readOnly = true, label = {Text(text = "Gender")},
                            trailingIcon ={ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)},
                            colors = ExposedDropdownMenuDefaults.textFieldColors())

                        ExposedDropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                            genderOptions.forEach { selectedText ->
                                DropdownMenuItem(onClick = { selectedOptionText = selectedText
                                    expanded = false} ) {
                                    Text(text = selectedText)
                                }
                            }
                        }
                    }

                    TextField(value = age, label = { Text(text = "Age")},onValueChange ={
                        age = it },singleLine = true)

                    TextField(value = education,
                        label={ Text(text = "Education/Work")},
                        onValueChange = {age = it}, singleLine = true)

                    Button(onClick =
                        {
                            navController.navigate(route = Screens.LevelOneScreen.route) },) {
                        Text(
                            text = "Test Your Brain",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(20.dp)
                        )
                    }
                }
            }
        }
    }



}
