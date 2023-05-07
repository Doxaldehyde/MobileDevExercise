package com.dox.mobiledevexercise

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Gesture1(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
       var txtState by remember{ mutableStateOf(0)}
        Box(modifier = Modifier
            .size(200.dp)
            .clickable {txtState += 1 },
        contentAlignment = Alignment.Center) {
          Text(text = "Clicked $txtState times")
        }
    }
}