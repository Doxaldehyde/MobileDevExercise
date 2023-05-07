package com.dox.mobiledevexercise

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TestSideEffect(){
    var showProgress by remember { mutableStateOf(false)}
    var launchEffect by remember { mutableStateOf(false)}
    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { showProgress = true
                            launchEffect = true }) {
            Text(text = "show progress")
        }
        if (showProgress)
            CircularProgressIndicator()
        if (launchEffect){
            val coroutineScope = rememberCoroutineScope()
        LaunchedEffect(key1 = Unit){
            coroutineScope.launch {
                delay(3000)
                Toast.makeText(context, "operation successful", Toast.LENGTH_LONG).show()
                showProgress = false
                launchEffect = false
            }
        }
    }
    }
}