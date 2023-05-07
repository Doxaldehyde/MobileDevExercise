package com.dox.mobiledevexercise.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.dox.mobiledevexercise.R

@Composable
fun Exercise2() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Text(
            text = stringResource(id = R.string.term_condition),
        style = MaterialTheme.typography.h2)
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum))
        Text(text = stringResource(id = R.string.lorem_ipsum ))
    }
}