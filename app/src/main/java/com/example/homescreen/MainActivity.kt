package com.example.homescreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.homescreen.ui.theme.HomescreenTheme
import androidx.compose.ui.Modifier as Modifier2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomescreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier2.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DemoScreenContent()

                }
            }
        }
    }
}

@Composable
fun DemoScreenContent(
    modifier: Modifier=Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.home_bg),
                contentScale = ContentScale.FillBounds
            )
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Spacer(modifier = Modifier.height(180.dp))
            Text (
                text = "Lorem",
                modifier = Modifier
                    .offset(0.dp,270.dp ),
                style = TextStyle(
                    color = Color.Magenta,
                    fontWeight = FontWeight.Bold
                ),
                fontSize = 70.sp
            )
            Spacer(modifier = Modifier.height(200.dp))
            Text(
                text = "Believing in the power of collective impact. Our mission is to provide a platform where individuals, communities, and organizations come together to make a positive change in the world.",
                modifier = Modifier
                    .width(290.dp)
                    .height(30.dp),
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(500.dp))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Magenta),
                modifier = Modifier
                    .width(360.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "GET STARTED",
                    style = TextStyle(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    ),
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "By continuing, you are agreeing to our Terms of Service and Privacy Policies",
                modifier = Modifier
                    .width(295.dp)
                    .height(32.dp),
                style = TextStyle(
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
        }
    }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HomescreenTheme {
        DemoScreenContent()
    }
}
