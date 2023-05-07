package com.dox.mobiledevexercise

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.dox.mobiledevexercise.ui.theme.Exercise1
import com.dox.mobiledevexercise.ui.theme.Exercise2
import com.dox.mobiledevexercise.ui.theme.MobileDevExerciseTheme
import com.dox.mobiledevexercise.ui.theme.listApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileDevExerciseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                  Amenam()
                    val context = LocalContext.current
                    Toast.makeText(context, "Howdy", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

