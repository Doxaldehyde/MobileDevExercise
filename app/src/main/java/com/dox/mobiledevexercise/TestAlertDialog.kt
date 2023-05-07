package com.dox.mobiledevexercise

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TestAlertDialog(){
    var openDialog by remember{ mutableStateOf(false)}

    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        Button(onClick = { openDialog = true}) {
            Text(text = "open dialog")
        }
        if (openDialog)
            AlertDialog(onDismissRequest = { openDialog = false},
            title = { Text(text = "Congratulation")},
            text = { Text(text = "you score 100%")},
            confirmButton = {
                Button(onClick = {  }) {
                    Text(text = "Play Again")
                }
            },
            dismissButton = {
                Button(onClick = { }) {
                    Text(text = "Exit")
                }
            })
    }
}