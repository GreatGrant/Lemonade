package com.gralliams.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.gralliams.lemonade.ui.theme.LemonadeTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun LemonadeApp(){

    var paintResource by remember { mutableStateOf(R.drawable.lemon_tree)}
    var promptText by remember { mutableStateOf(R.string.prompt1) }

    val painterResources = listOf(
        R.drawable.lemon_tree,
        R.drawable.lemon_squeeze,
        R.drawable.lemon_drink,
        R.drawable.lemon_restart, )

    val prompts = listOf(
        R.string.prompt1,
        R.string.prompt2,
        R.string.prompt3,
        R.string.prompt4,
    )
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color.Green)
                .padding(bottom = 8.dp)
                .clickable {
                    for (paint in painterResources) {
                        paintResource = paint
                    }

                    for (prompt in prompts) {
                        promptText = prompt
                    }
                }

        ){
            Image(
                painter = painterResource(id = paintResource),
                contentDescription = null,
                modifier = Modifier.padding(16.dp),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(id = promptText))
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
    )
@Composable
fun LemonadePreview() {
    LemonadeTheme {
        LemonadeApp()
    }
}