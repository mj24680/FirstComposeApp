package com.example.firstcomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class BasicComposables2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview(showBackground = true, widthDp = 250, heightDp = 250)
@Composable
private fun previewComposables() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly, // Arrangement means -> how empty space is divided between the children
        horizontalAlignment = Alignment.CenterHorizontally // other space in alignment
    ) { // act/mimic as linear layout
        Text("A", fontSize = 16.sp)
        Text("B", fontSize = 16.sp)
    }

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("C", fontSize = 16.sp)
        Text("D", fontSize = 16.sp)
    }

    Box( contentAlignment = Alignment.BottomEnd) { // behave like frame layout
//        Image(
//            painter = painterResource(R.drawable.baseline_add_comment_24),
//            "background Icon",
//            modifier = Modifier
//                .width(150.dp)
//                .height(150.dp)
//        )
//        Image(
//            painter = painterResource(R.drawable.baseline_heart_broken_24),
//            "heart"
//        )
    }
}

