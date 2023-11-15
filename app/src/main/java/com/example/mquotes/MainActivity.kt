package com.example.mquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.mquotes.ui.theme.MQuotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MQuotesTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 30.dp, vertical = 50.dp)
            .background(
                color = Color.Black.copy(alpha = 0.05f),
                shape = RoundedCornerShape(50.dp)
            ),
        contentAlignment = Alignment.Center,

    ) {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            AsyncImage(
                model = "https://w0.peakpx.com/wallpaper/891/853/HD-wallpaper-jason-statham-wrath-of-man.jpg",
                contentDescription = "Jason Statham",
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
            )
            Text(
                text = "Волк не волк, если не волк...",
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MQuotesTheme {
        Greeting()
    }
}