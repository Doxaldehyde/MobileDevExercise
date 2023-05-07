package com.dox.mobiledevexercise

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt


@Composable
fun Gesture2() {
    val context = LocalContext.current
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }
    Column(modifier = Modifier.fillMaxSize(1f)) {
        Box(modifier = Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .background(Color.Red)
            .clickable {
                Toast
                    .makeText(context, "I love you", Toast.LENGTH_LONG)
                    .show()
            }
            .size(100.dp)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consumeAllChanges()
                    offsetX += dragAmount.x
                    offsetY += dragAmount.y
                }
            },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "O")
        }

    }
    Gest2()
    Gest3()
}

@Composable
fun Gest2() {
    val context = LocalContext.current
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }
    Column(modifier = Modifier.fillMaxSize(1f)) {
        Box(modifier = Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .background(Color.Cyan)
            .clickable {
                Toast
                    .makeText(context, "Let me think about it", Toast.LENGTH_LONG)
                    .show()
            }
            .size(100.dp)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consumeAllChanges()
                    offsetX += dragAmount.x
                    offsetY += dragAmount.y
                }
            },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Tari")
        }
    }
}

@Composable
fun Gest3() {
    val context = LocalContext.current
    var offsetX by remember { mutableStateOf(0f) }
    var offsetY by remember { mutableStateOf(0f) }
    Column(modifier = Modifier.fillMaxSize(1f)) {
        Box(modifier = Modifier
            .offset { IntOffset(offsetX.roundToInt(), offsetY.roundToInt()) }
            .background(Color.LightGray)
            //.clickable { Toast.makeText(context, "Let me think about it", Toast.LENGTH_LONG).show() }
            .size(300.dp, 100.dp)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consumeAllChanges()
                    offsetX += dragAmount.x
                    offsetY += dragAmount.y
                }
            },
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Garden Terrace table")
        }
    }
}