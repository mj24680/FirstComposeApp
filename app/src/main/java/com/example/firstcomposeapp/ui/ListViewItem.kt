package com.example.firstcomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.R

class ListViewItem : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Preview(showBackground = true, widthDp = 150, heightDp = 200)
@Composable
fun previewFun() {

    Column() {
//        ListItem(R.drawable.ic_profile, "M Jawad", "App Developer")
//        ListItem(R.drawable.ic_profile, "M Jawad", "App Developer")
//        ListItem(R.drawable.ic_profile, "M Jawad", "App Developer")
//        ListItem(R.drawable.ic_profile, "M Jawad", "App Developer")
    }
}

@Composable
fun ListItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(2.dp)
    ) {
        Image(
            painter = painterResource(imgId),
            "profile image",
            modifier = Modifier.size(40.dp)
        )

        Column(
            modifier = Modifier.padding(start = 4.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                name,
                fontWeight = FontWeight.Bold
            )
            Text(
                occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}