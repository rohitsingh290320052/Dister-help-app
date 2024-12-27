package com.example.saathi3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingScreen()
        }
    }
}

@Composable
fun GreetingScreen() {
    // Using a Box to apply fillMaxSize modifier
    Box(modifier = Modifier.fillMaxSize()) {
        // Column for vertical arrangement
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome to Samay Sarathi", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp)) // Proper usage of Spacer with height modifier
            Button(onClick = { /* Do something */ }) {
                Text("Get Started")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GreetingScreen()
}
