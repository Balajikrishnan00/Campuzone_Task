package com.example.campuzone

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LevelOneScreen(navController:NavHostController){
    val quesOne = "Imagine you're given a writing assessment. Selected any of them:-"
    val ansOne = listOf(
        "A) Describe the Planets in the Solar system",
        "B) Write about your favorite fairy tale that you want to be",
        "C) Either of both A) & B) i won't do",
        "D) None")

    val selectedButton = remember {mutableStateOf(ansOne.last())}

    val quesTwo = "How will you dressed up, based on"
    val ansTwo = listOf(
        "A) The outfit you planned",
        "B) Whatever is good to have",
        "C) Either of Both A) & B) i won't do",
        "D) None")

    val quesThree = "In a theatre production, what would you do"
    val ansThree = listOf(
        "A) To be a director",
        "B) To be a lead Actor",
        "C) Either of both A) & B) i won't do",
        "D) None"
    )

    val quesFour ="SomeOne just told you you're mad,You think to yourself"
    val ansFour = listOf(
        "A) That's unfair",
        "B) Thinking of i really might be",
        "C) Either of both A) & B) i won't do",
        "D) None")

    val quesFive ="if you watch a sad movie in your classroom, what would you do"
    val ansFive = listOf(
        "A) Control your emotions",
        "B) Cry little",
        "C) Either of both A) & B) i won't do",
        "D) None")

    val quesSix = "When you eat Gems chocolate, you tempted do:-"
    val ansSiX = listOf(
        "A) Arrange them in colours and then eat in order",
        "B) Will hide in class and eat during my bored times",
        "C) Either of both A) & B) i won't do",
        "D) None")


    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.Magenta)
                .padding(20.dp), horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "")
            }

            Column() {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "1)",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = quesOne, color = Color.Blue,
                        fontSize = 20.sp,
                    )
                }
                ansOne.forEach {
                    val isSelected = it == selectedButton.value
                    val colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.DarkGray,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selectedButton.value = it },
                            colors = colors
                        )
                        Text(text = it, modifier = Modifier.clickable { })
                    }
                }

                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "2)",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = quesTwo, color = Color.Blue,
                        fontSize = 20.sp
                    )
                }
                ansTwo.forEach {
                    val isSelected = it == selectedButton.value
                    val colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.DarkGray,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selectedButton.value = it },
                            colors = colors
                        )
                        Text(text = it)
                    }
                }

                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "3)",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = quesThree, color = Color.Blue,
                        fontSize = 20.sp
                    )
                }
                ansThree.forEach {
                    val isSelected = it == selectedButton.value
                    val colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.DarkGray,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selectedButton.value = it },
                            colors = colors
                        )
                        Text(text = it)
                    }
                }

                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "4)",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = quesFour, color = Color.Blue,
                        fontSize = 20.sp
                    )
                }
                ansFive.forEach {
                    val isSelected = it == selectedButton.value
                    val colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.DarkGray,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selectedButton.value = it },
                            colors = colors
                        )
                        Text(text = it)
                    }
                }

                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "5)",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = quesFive, color = Color.Blue,
                        fontSize = 20.sp
                    )
                }
                ansFive.forEach {
                    val isSelected = it == selectedButton.value
                    val colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.DarkGray,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selectedButton.value = it },
                            colors = colors
                        )
                        Text(text = it)
                    }
                }


                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "6)",
                        color = Color.Blue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = quesSix, color = Color.Blue,
                        fontSize = 20.sp
                    )
                }
                ansSiX.forEach {
                    val isSelected = it == selectedButton.value
                    val colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Blue,
                        unselectedColor = Color.DarkGray,
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = isSelected,
                            onClick = { selectedButton.value = it },
                            colors = colors
                        )
                        Text(text = it)
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(onClick = {navController.navigate(route =Screens.LevelTwoScreen.route ) },) {
                        Text(text = "Next", color = Color.White)
                    }
                }
            }
        }
    }
}