package com.example.firstcomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstcomposeapp.R
import com.example.firstcomposeapp.ui.list_implementation.PreviewItems

class ComposeModifiers : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
        // CircularImage()

            PreviewItems()
    }
}
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
private fun PreviewModifiers() {
//    Text(
//        "Hello",
//        color = Color.White,
//        modifier = Modifier
//            .clickable { }
//            .background(Color.Blue)
//            .size(100.dp)
//            .padding(10.dp)
//            .border(2.dp, Color.Red)
//            .clip(CircleShape)
//            .background(Color.Yellow)
//    )

    CircularImage()
}

@Composable
fun CircularImage() {
    Image(
        painter = painterResource(R.drawable.iv_rectangle),
        contentDescription = "Rectangular Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape)
    )
}
