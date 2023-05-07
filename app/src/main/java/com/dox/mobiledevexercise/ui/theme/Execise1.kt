package com.dox.mobiledevexercise.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun Exercise1() {
    Column(modifier = Modifier.background(Color.Gray),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .background(Color.Blue)
            ) {}
            Box(
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .background(Color.Black)
            ) {}
            Box(
                modifier = Modifier
                    .size(100.dp, 50.dp)
                    .background(Color.White)
            ) {}
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(50.dp)
                .background(Color.Yellow)
        ) {}
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(50.dp)
                .background(Color.Red)
        ) {}
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(50.dp)
                .background(Color.Magenta)
        ) {}

        Box(modifier = Modifier,
        contentAlignment = Alignment.Center) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .size(300.dp, 150.dp)
                    .background(Color(0xff0055ff))
            ) {}
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)
                    .size(300.dp, 100.dp)
                    .background(Color(0xFF8000FF))
            ) {}
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 60.dp, end = 60.dp)
                    .size(300.dp, 50.dp)
                    .background(Color(0xFF00ccff))
            ) {}

        }
        AsyncImage(
            model = "https://upload.wikimedia.org/wikipedia/en/thumb/0/04/Facebook_f_logo_%282021%29.svg/150px-Facebook_f_logo_%282021%29.svg.png"
            , contentDescription = null)
    }
   // AsynImage(
// modmodel = ImageRequest.Builder(LocalContext.current)
      //  .data("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.mirror.co.uk%2Fall-about%2Ffacebook&psig=AOvVaw3oO5evpXHFtxiabZqaA1Mk&ust=1670251995687000&source=images&cd=vfe&ved=0CBAQjRxqFwoTCOjQiNmb4PsCFQAAAAAdAAAAABAI")
       // .crossfade(true)
      //  .build()
//  )
}