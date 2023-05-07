package com.dox.mobiledevexercise.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun listApp(){
    var txtState by remember { mutableStateOf("")}
    Column() {
        TextField(value = txtState, onValueChange = {txtState = it })
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Add new item")
        }

    LazyColumn{
        item {
            Card(modifier = Modifier.padding(4.dp), elevation = 4.dp) {
               Text(text = "List of item")
            }
        }
        items(5){
                index ->
            Text("List #$index")
        }
    }
    }
}