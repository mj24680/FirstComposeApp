package com.example.firstcomposeapp.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class Recomposition : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Recomposable()
        }
    }
}

// this example shows -> when state changes whole screen not updated only the updated part updated
@Composable
fun Recomposable() {
    val state = remember { mutableStateOf(0.0) }
    Log.d("TAGGED", "Logged during Initial Composition")
    Button(onClick = {
        state.value = Math.random()
    }) {
        Log.d("TAGGED", "Logged during both Composition & Recomposition")
        Text(state.value.toString())
    }
}