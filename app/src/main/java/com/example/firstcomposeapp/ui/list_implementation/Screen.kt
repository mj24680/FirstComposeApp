package com.example.firstcomposeapp.ui.list_implementation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
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

// contains only composables functions

@Preview(heightDp = 500)
@Composable
fun PreviewItems() {
//    BlogCategory(
//        R.drawable.ic_profile,
//        "Programming",
//        "Learn Different Languages"
//    )

//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map { item ->
//            BlogCategory(item.img, item.title, item.subTitle)
//        }
//    }

    // recyclable list
    LazyColumn(content = {
        items(getCategoryList()) { item ->
            BlogCategory(item.img, item.title, item.subTitle)
        }
    })

}

@Composable
fun BlogCategory(img: Int, title: String, subTitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "Profile Image",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subTitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subTitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            title,
            //fontWeight = FontWeight.Bold
            style = MaterialTheme.typography.titleLarge // for re-usable
        )
        Text(
            subTitle,
            style = MaterialTheme.typography.titleSmall, // for re-usable
            fontWeight = FontWeight.Thin,
            //fontSize = 12.sp
        )
    }
}

data class Category(val img: Int, val title: String, val subTitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(
        Category(
            R.drawable.ic_security,
            "Cyber Security",
            "Protect Systems & Networks"
        )
    )
    list.add(
        Category(
            R.drawable.ic_cloud,
            "Cloud Computing",
            "AWS, Azure & Google Cloud"
        )
    )
    list.add(
        Category(
            R.drawable.ic_web,
            "Web Development",
            "Frontend & Backend Tutorials"
        )
    )
    list.add(
        Category(
            R.drawable.ic_mobile,
            "Android Development",
            "Build Modern Android Apps"
        )
    )
    list.add(
        Category(
            R.drawable.ic_database,
            "Databases",
            "Master SQL & NoSQL"
        )
    )
    list.add(
        Category(
            R.drawable.ic_ai,
            "Artificial Intelligence",
            "Explore AI & Machine Learning"
        )
    )
    list.add(
        Category(
            R.drawable.ic_security,
            "Cyber Security",
            "Protect Systems & Networks"
        )
    )
    list.add(
        Category(
            R.drawable.ic_cloud,
            "Cloud Computing",
            "AWS, Azure & Google Cloud"
        )
    )
    list.add(
        Category(
            R.drawable.ic_web,
            "Web Development",
            "Frontend & Backend Tutorials"
        )
    )
    list.add(
        Category(
            R.drawable.ic_mobile,
            "Android Development",
            "Build Modern Android Apps"
        )
    )
    list.add(
        Category(
            R.drawable.ic_database,
            "Databases",
            "Master SQL & NoSQL"
        )
    )
    list.add(
        Category(
            R.drawable.ic_ai,
            "Artificial Intelligence",
            "Explore AI & Machine Learning"
        )
    )

    return list
}

