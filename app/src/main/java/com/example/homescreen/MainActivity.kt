package com.example.homescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.homescreen.ui.theme.HomescreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomescreenTheme {
                // A surface container using the 'background' color from the theme
                UserHomeScreen()
            }
        }
    }
}



@Preview()
@Composable
fun GreetingPreview() {
    HomescreenTheme {
        UserHomeScreen()
    }
}
