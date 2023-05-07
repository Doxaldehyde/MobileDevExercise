package com.dox.mobiledevexercise

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Amenam(){
    Column(modifier = Modifier.padding(4.dp)) {
        var txtList by remember { mutableStateOf(listOf(""))}
        AmenamInput{
            item ->
            txtList = txtList + listOf(item)
        }
        AmenamList(txtList)
    }
}

@Composable
fun AmenamInput(onAddedItem: (String) -> Unit){
    var txtState by remember { mutableStateOf("")}
    Column(modifier = Modifier.padding(8.dp)) {
        TextField(modifier = Modifier.fillMaxWidth(),
            value = txtState, onValueChange = {txtState = it} )
        Button(onClick = { onAddedItem(txtState)
        txtState = ""}) {
            Text(text = "Add task")
        }
    }

}
@Composable
fun AmenamList(Task: List<String>){

    LazyColumn{
        items(Task.size){
            index ->
           Text(text = Task[index])
        }
    }
}