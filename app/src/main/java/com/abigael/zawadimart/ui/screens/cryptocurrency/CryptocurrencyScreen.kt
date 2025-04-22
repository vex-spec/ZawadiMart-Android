package com.abigael.zawadimart.ui.screens.cryptocurrency

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abigael.zawadimart.R
import com.abigael.zawadimart.navigation.ROUT_HOME
import com.abigael.zawadimart.ui.screens.about.AboutScreen
import com.abigael.zawadimart.ui.theme.newOrange
import com.abigael.zawadimart.ui.theme.newblue
import com.abigael.zawadimart.ui.theme.newgreen
import com.abigael.zawadimart.ui.theme.newgrey
import com.abigael.zawadimart.ui.theme.newred
import com.abigael.zawadimart.ui.theme.newtt
import com.abigael.zawadimart.ui.theme.newwhite
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CryptocurrencyScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


//BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Black
            ){

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Profile") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    })

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "home") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    })





            }
        },


        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                Text(
                    text = "Hi there",
                    fontWeight = FontWeight.Bold

                )
                Text(text =
                    "Here are your projects",
                    fontWeight = FontWeight.Bold
                )


                Spacer(modifier = Modifier.height(40.dp))

                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Box {
                        Row {
                            //Card 1
                            Card (
                                modifier = Modifier.width(200.dp).height(300.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(newblue),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.cryptograph),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(80.dp)
                                            .background(color = newblue)

                                    )

                                    Text(
                                        text = "CrytoCurrency Loading Page",
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontSize = 20.sp
                                    )
                                }
                            }//end of card1
                            Spacer(modifier = Modifier.width(10.dp))



                            //card2
                            Card (
                                modifier = Modifier.width(200.dp).height(300.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(newOrange),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.statistic),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(80.dp)
                                            .background(color = newOrange)

                                    )

                                    Text(
                                        text = "Statistic Dashboard",
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontSize = 20.sp
                                    )
                                }
                            }//end of card2
                            Spacer(modifier = Modifier.width(10.dp))


                            // card 3
                            Card (
                                modifier = Modifier.width(200.dp).height(300.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(newblue),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.cryptograph),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(80.dp)
                                            .background(color = newblue)

                                    )

                                    Text(
                                        text = "CrytoCurrency Loading Page",
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontSize = 20.sp
                                    )
                                }
                            }//end of card3
                            Spacer(modifier = Modifier.width(10.dp))

                            //card4
                            Card (
                                modifier = Modifier.width(200.dp).height(300.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(newblue),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.cryptograph),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(80.dp)
                                            .background(color = newblue)

                                    )

                                    Text(
                                        text = "CrytoCurrency Loading Page",
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontSize = 20.sp
                                    )
                                }
                            }//end of card4
                            Spacer(modifier = Modifier.width(10.dp))

                            //card5
                            Card (
                                modifier = Modifier.width(200.dp).height(300.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(newblue),

                                ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.cryptograph),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(80.dp)
                                            .background(color = newblue)

                                    )

                                    Text(
                                        text = "CrytoCurrency Loading Page",
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontSize = 20.sp
                                    )
                                }
                            }//end of card5
                            Spacer(modifier = Modifier.width(10.dp))

                            //card6
                            Card (
                                modifier = Modifier.width(200.dp).height(300.dp),
                                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 20.dp, topEnd = 20.dp),
                                colors = CardDefaults.cardColors(newblue)

                            ){
                                Column (
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                                {
                                    Image(
                                        painter = painterResource(R.drawable.cryptograph),
                                        contentDescription = "graph",
                                        modifier = Modifier.size(80.dp)
                                            .background(color = newblue)

                                    )

                                    Text(
                                        text = "CrytoCurrency Loading Page",
                                        color = Color.White,
                                        textAlign = TextAlign.Center,
                                        fontSize = 20.sp
                                    )
                                }
                            }//end of card6

                        }

                        //End of Card 1

                    }
                }



                Spacer(modifier = Modifier.height(15.dp))

                //Card personal
                Card (
                    modifier = Modifier.fillMaxWidth().height(300.dp),
                    shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp, topStart = 17.dp, topEnd = 20.dp),
                    colors = CardDefaults.cardColors(newtt)
                ){
                    Column() {
                        Text(
                            text = "Personal Tasks",
                            modifier = Modifier.padding(5.dp),
                          
                            fontWeight = FontWeight.Bold

                            )
                        Spacer(modifier = Modifier.height(10.dp))


                        //Card1
                        Card (modifier = Modifier.fillMaxWidth()
                            .height(100.dp)

                        ) {
                            //Row1
                            Row(modifier = Modifier.padding(start = 20.dp)) {
                                Image(
                                    painter = painterResource(R.drawable.video),
                                    contentDescription = "tokita",
                                    modifier = Modifier.width(80.dp).height(90.dp),
                                    contentScale = ContentScale.FillWidth
                                )

                                Spacer(modifier = Modifier.width(20.dp))

                                Column {
                                    val mContext = LocalContext.current
                                    Text(
                                        text = "NDA Review for website project",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold
                                    )


                                    Text(
                                        text = "Today - 10pm",
                                        fontSize = 15.sp,

                                        )

                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))
                        Card (modifier = Modifier.fillMaxWidth().height(100.dp))
                             {
                            //row email
                            Row(modifier = Modifier.padding(start = 20.dp)) {
                                Image(
                                    painter = painterResource(R.drawable.email),
                                    contentDescription = "tokita",
                                    modifier = Modifier.width(80.dp).height(90.dp),
                                    contentScale = ContentScale.FillWidth
                                )

                                Spacer(modifier = Modifier.width(20.dp))

                                Column {
                                    val mContext = LocalContext.current
                                    Text(
                                        text = "Email Reply for Green Project",
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold
                                    )


                                    Text(
                                        text = "Today - 10pm",
                                        fontSize = 15.sp,

                                        )

                                }
                            }
                        }













































                    }




                        //End of Card1


                    }


                }
                //end of card personal


























        }
    )

//End of scaffold


}



@Preview(showBackground = true)
@Composable
fun CryptocurrencyScreenPreview(){
    CryptocurrencyScreen(rememberNavController())


}





