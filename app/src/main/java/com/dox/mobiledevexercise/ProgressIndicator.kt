package com.dox.mobiledevexercise

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun ProgressIndicator(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceEvenly) {
        LinearProgressIndicator()
        LinearProgressIndicator(0.8f)
        CircularProgressIndicator()
        CircularProgressIndicator(0.75f)
    }
}