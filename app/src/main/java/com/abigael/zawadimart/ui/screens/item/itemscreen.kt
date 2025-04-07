package com.abigael.zawadimart.ui.screens.item

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abigael.zawadimart.R
import com.abigael.zawadimart.navigation.ROUT_HOME
import com.abigael.zawadimart.navigation.ROUT_INTENT
import com.abigael.zawadimart.ui.theme.newOrange
import com.abigael.zawadimart.ui.theme.newred
import com.abigael.zawadimart.ui.theme.newwhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newOrange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications,contentDescription = "")
                }

                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward,contentDescription = "")
                }
            }

        )
    //End
        Image(
            painter = painterResource(R.drawable.baki),
            contentDescription = "tokita",
            modifier = Modifier.fillMaxWidth().height(400.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

        //searchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search...") }
        )
        //End of searchBar

        Spacer(modifier = Modifier.height(10.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Row1
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.cypher),
                    contentDescription = "tokita",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    val mContext = LocalContext.current
                    Text(
                        text = "Latest anime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Ticket fee then: ksh 600",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough,
                    )


                    Text(
                        text = "Ticket fee now : ksh 500",
                        fontSize = 15.sp,
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                    }
                    Button(
                        onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0720245837".toUri()
                            mContext.startActivity(callIntent)

                        },
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )


                    {
                        Text(text = "Contact us")
                    }


                }

            }
            //End of Row1

            Spacer(modifier = Modifier.height(10.dp))

            //Row2
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.img_3),
                    contentDescription = "tokita",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Text(
                        text = "Baki vs Ugiro anime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Ticket fee then: ksh 2000",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough,
                    )


                    Text(
                        text = "Ticket fee now : ksh 1500",
                        fontSize = 15.sp,
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )


                    {
                        Text(text = "Contact us")
                    }


                }

            }
            //End of Row2

            Spacer(modifier = Modifier.height(10.dp))

            //Row3
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.img_2),
                    contentDescription = "tokita",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Text(
                        text = "Latest anime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Ticket fee : ksh 600",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough,
                    )


                    Text(
                        text = "Ticket fee now : ksh 500",
                        fontSize = 15.sp,
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                    }
                    Button(
                        onClick = {
                            navController.navigate(ROUT_HOME)
                        },
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )


                    {
                        Text(text = "Contact us")
                    }


                }

            }
            //End of Row3

            Spacer(modifier = Modifier.height(10.dp))

            //Row4
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.cypher),
                    contentDescription = "tokita",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Text(
                        text = "Latest anime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Ticket fee then: ksh 600",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough,
                    )


                    Text(
                        text = "Ticket fee now : ksh 500",
                        fontSize = 15.sp,
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )


                    {
                        Text(text = "Contact us")
                    }


                }

            }
            //End of Row4
            Spacer(modifier = Modifier.height(10.dp))


            //Row5
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.cypher),
                    contentDescription = "tokita",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Text(
                        text = "Latest anime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Ticket fee then: ksh 600",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough,
                    )


                    Text(
                        text = "Ticket fee now : ksh 500",
                        fontSize = 15.sp,
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )


                    {
                        Text(text = "Contact us")
                    }


                }

            }
            //End of Row5

            Spacer(modifier = Modifier.height(10.dp))



            //Row6
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.cypher),
                    contentDescription = "tokita",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth
                )

                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Text(
                        text = "Latest anime",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )


                    Text(
                        text = "Ticket fee then: ksh 600",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough,
                    )


                    Text(
                        text = "Ticket fee now : ksh 500",
                        fontSize = 15.sp,
                    )

                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newOrange)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newred)
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    )


                    {
                        Text(text = "Contact us")
                    }


                }

            }
            //End of Row6



        }
    }

}



@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())


}