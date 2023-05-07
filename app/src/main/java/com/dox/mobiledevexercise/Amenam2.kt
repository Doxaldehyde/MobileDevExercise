package com.dox.mobiledevexercise

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*

@Composable
fun amenamApp(){

    Scaffold(
        content = {},
        floatingActionButton = {
            FloatingActionButton(onClick = {  }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "Icon")
            }

        }
    )
    var result by remember{ mutableStateOf(1)}
    when (result) {
        1 -> Column {
            var txtState by remember { mutableStateOf("")}
            TextField(value = txtState, onValueChange = {txtState = it})
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add task")
            }
        }
    }
}
/*@Composable
fun TaskInput(){
    var result by remember{ mutableStateOf(1)}
    when (result) {
        1 -> Column {
            var txtState by remember { mutableStateOf("")}
            TextField(value = txtState, onValueChange = {txtState = it})
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add task")
            }
        }
    }
}*/