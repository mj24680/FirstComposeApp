package com.example.firstcomposeapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hello Compose...!")
            TextInput()
        }
    }
}

@Composable
fun SayName(name: String) {
    Text(
        "Hello $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.SemiBold,
        color = Color.Red,
        fontSize = 16.sp,
        textAlign = TextAlign.Right
    )
}

//@Preview(showBackground = true, showSystemUi = true, name = "Hello Message 2")
//@Composable
//fun sayName2(name: String = "Jawad"){
//    Text("Hello $name")
//}
@Preview(showBackground = true, name = "Hello Message", widthDp = 200, heightDp = 200)
@Composable
fun previewFunction() {
    SayName("Jawad")

    Image(
        painter = painterResource(R.drawable.baseline_heart_broken_24),
        "Heart Image",
        colorFilter = ColorFilter.tint(Color.Blue),
        contentScale = ContentScale.Crop
    )

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(contentColor = Color.Red, containerColor = Color.Blue)
    ) {
        Text("Hello")
        Image(
            painter = painterResource(R.drawable.baseline_heart_broken_24),
            "Dummy"
        )
    }

    TextField(
        value = "Hello",
        onValueChange = {},
        label = { Text("Enter Message") },
        placeholder = {}
    )
}

@Composable
fun TextInput() {
    // In this case user try to type in field but UI not Updating, because of static value
//    TextField(
//        value = "Hello",
//        onValueChange = {
//            Log.d("JAWAD", it)
//        },
//        label = {Text("Enter Message")},
//    )

    val state = remember { mutableStateOf("") }

    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text("Enter Message") },
    )
}