package com.example.assignment1_businesscardbytristansagucio

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1_businesscardbytristansagucio.ui.theme.Assignment1BusinessCardByTristanSagucioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1BusinessCardByTristanSagucioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TitleColumn()
                    DetailColumn()
                }
            }
        }
    }
}

@Composable
fun TitleColumn (modifier: Modifier = Modifier){
    Column (
          modifier = modifier
              .absolutePadding(
                  bottom = 200.dp
              ),
          horizontalAlignment = Alignment.CenterHorizontally,
          verticalArrangement = Arrangement.Center,

    ) {

        Column (
            modifier = modifier
                .absolutePadding(
                   left = 100.dp,
                    right = 120.dp,

                )

        ) {

            val image = painterResource(id = R.drawable.android_logo)
            val Red = Color(0xFFEDB7F7)
            Image(

                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .background(
                        color = Red,
                    )
                )
        }
        Text(

            text = "Tristan Sagucio",
            fontSize = 34.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(
                top = 24.dp,
                bottom =16.dp
            )
        )
        Text (
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp
        )
    }
}
@Composable
fun DetailColumn (modifier: Modifier = Modifier){

    Column (
        modifier = modifier
            .absolutePadding(
                top = 400.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ){

        Column (

            modifier = modifier
                .absolutePadding(),
            horizontalAlignment = Alignment.Start,

        ) {

            Row (
                modifier = modifier
                    .absolutePadding(
                        bottom = 10.dp
                    )


            ) {

               val imagePhone = painterResource(id = R.drawable.phoneicon)

               Image(
                   painter = imagePhone,
                   contentDescription = null,
                   Modifier
                       .size(30.dp)
               )

                Text(
                    text = "+1-403-715-6361",
                    Modifier.absolutePadding(
                        left = 20.dp
                    )
                )

            }

            Row (
                modifier = modifier
                    .absolutePadding(
                        bottom = 10.dp
                    )
            ) {

                val imagePhone = painterResource(id = R.drawable.connectionicon)

                Image(
                    painter = imagePhone,
                    contentDescription = null,
                    Modifier
                        .size(30.dp)
                )

                Text(
                    text = "@tjohnsagucio",
                    Modifier.absolutePadding(
                        left = 20.dp
                    )
                )

            }

            Row (
                modifier = modifier
                    .absolutePadding(
                        bottom = 10.dp
                    )
            ) {

                val imagePhone = painterResource(id = R.drawable.emailicon)

                Image(
                    painter = imagePhone,
                    contentDescription = null,
                    Modifier.size(30.dp)
                )

                Text(
                    text = "tjohnsagucio@gmail.com",
                    Modifier.absolutePadding(
                        left = 20.dp
                    )
                )

            }

        }





    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1BusinessCardByTristanSagucioTheme {
       TitleColumn()
        DetailColumn()
    }
}