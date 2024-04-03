package com.example.interfacedesign

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfacedesign.ui.theme.InterfaceDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Design()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Design() {
    LazyColumn {
        item { 
            
             Column(
                 modifier = Modifier
                     .padding(10.dp),
                 horizontalAlignment = Alignment.CenterHorizontally


             ) {
                 Row (
                     modifier = Modifier
                         .padding(20.dp),
                     horizontalArrangement = Arrangement.Center,


                 ){
                     Text("9:41",
                         color = Color.Black,
                         fontStyle = FontStyle.Normal,
                         fontFamily = FontFamily.Serif,
                         fontSize = 40.sp,
                         )
                     Spacer(modifier = Modifier.width(250.dp))
                     
                        Icon(painter = painterResource(id = R.drawable.images),
                            contentDescription ="",
                                modifier = Modifier
                                    .size(30.dp)
                            )
                     
                     
                 }
             }
            Column(
                modifier =Modifier
                    .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Row {
                    val hotel = LocalContext.current
                    Button(onClick = {hotel.startActivity(Intent(hotel, TestActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.Green),
                        border = BorderStroke(1.dp,
                            Color.Black),
                        shape = RoundedCornerShape(30.dp),

                        ) {
                        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = "",
                            modifier = Modifier
                                .size(10.dp)
                        )
                        Text("Hotel",
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontStyle = FontStyle.Normal,
                        )

                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    val rentals = LocalContext.current
                    Button(onClick = {rentals.startActivity(Intent(rentals, TestActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp,
                            Color.Black),
                        shape = RoundedCornerShape(30.dp),

                        ) {
                        Icon(imageVector = Icons.Default.AccountBox,
                            contentDescription ="",
//                                modifier = Modifier
//                                    .size(10.dp)

                            )
                            Text("Rentals",
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,
                                )


                    }
                    Spacer(modifier = Modifier.width(14.dp))

                    val Restaurants = LocalContext.current
                    Button(onClick = {Restaurants.startActivity(Intent(Restaurants, TestActivity::class.java))},
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp,
                            Color.Black),
                        shape = RoundedCornerShape(30.dp),


                        ) {
                        Icon(imageVector = Icons.Default.Build,
                            contentDescription = "",
//                                modifier =Modifier
//                                    .size(10.dp)

                            )
                        Text("Restaurants",
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontStyle = FontStyle.Normal,
                            )

                        Spacer(modifier = Modifier.height(10.dp))


                    }


                }



            }
            Box(
                modifier = Modifier
            ) {


            }

            Column(

                modifier = Modifier
                    .padding(20.dp)

            ) {

                Row() {
                    Box {
                        Image(painter = painterResource(id = R.drawable.nature),
                            contentDescription = "",
                            modifier =Modifier
                                .fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                        val recommended = LocalContext.current
                        Button(onClick = {recommended.startActivity(Intent(recommended, TestActivity::class.java))},
                            colors = ButtonDefaults.buttonColors(Color.Black),
                            border = BorderStroke(1.dp,
                                Color.Black),
                            shape = RoundedCornerShape(30.dp),
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "",
//                                    modifier = Modifier
//                                        .size(10.dp),

                            )
                            Text("Recommended",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontStyle = FontStyle.Normal,

                                )


                        }


                    }



                    Spacer(modifier = Modifier.width(250.dp))
                    Icon(imageVector = Icons.Default.Favorite,
                        contentDescription = "")

                }


            }


        }
    }
    
}


