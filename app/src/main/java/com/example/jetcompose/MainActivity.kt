package com.example.jetcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
//            MaterialTheme {
////                Greeting("Android")
//                NewsStory()
//
//            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun NewsStory() {
    Text("A day in Shark Fin Cove")
    Text("Davenport, California")
    Text("December 2018")
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}

//@Preview
//@Composable
//fun DefaultPreview() {
//    MaterialTheme {
//        Greeting("Android")
//    }
//}