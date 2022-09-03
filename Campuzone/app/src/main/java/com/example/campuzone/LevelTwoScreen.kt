package com.example.campuzone

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LevelTwoScreen(navController:NavHostController) {

    val quesOne =
        "A Train running at the Speed of 60Km/hr Crosses a pole in 9 seconds. what is the length of train"

    val ansOne = listOf(
        "A) 120 metres",
        "B) 180 metres", "C) 324 metres", "D) None"
    )

    val quesTwo = "A train 125m long passes a man," +
            " running at 5 km/hr,in the same direction,in which the train is going in 10 seconds"

    val ansTwo = listOf("A) 45 km/hr", "B) 50km/hr", "C)60 km/hr", "D) None")

    val quesThree = "the length of the bridge which a train 130 metres " +
            "long and travelling at 45 km/hr can cross in 30 seconds is:"

    val ansThree = listOf("A) 200m", "B) 225m", "C) 245m", "4) None")

    val quesFour =
        "Tow trains running in opposite directions cross a man standing on the platform in 27" +
                "seconds and 17 respectively and they cross each other each other in 23 seconds the ratio if their speeds is"

    val ansFour = listOf("A) 1:3", "B) 3:2", "C) 3:4", "D) None")

    val selectedButton = remember { mutableStateOf(ansOne.last()) }

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
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(onClick = {navController.navigate(route =Screens.SubmittedScreen.route ) },) {
                    Text(text = "Submitted", color = Color.White)
                }
            }
        }
    }
}