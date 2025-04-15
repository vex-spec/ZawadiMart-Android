package com.abigael.zawadimart.ui.screens.logapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abigael.zawadimart.R
import com.abigael.zawadimart.navigation.ROUT_CRYPTOCURRENCY
import com.abigael.zawadimart.navigation.ROUT_HOME
import com.abigael.zawadimart.ui.theme.newOrange
import com.abigael.zawadimart.ui.theme.newblue
import com.abigael.zawadimart.ui.theme.newgrey
import com.abigael.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()

    ){
        Box(

        )
        {
            Card(

                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                colors = CardDefaults.cardColors(newblue)

                ) {
                Row(
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = painterResource(R.drawable.app),
                        contentDescription = "tokita",
                        modifier = Modifier.size(100.dp).background(color = newblue),


                        )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Logo App",
                        fontSize = 30.sp,
                        color = Color.White
                    )
                }
                Spacer(modifier = Modifier.height(80.dp))

                Image(

                    painter = painterResource(R.drawable.jotoro),
                    contentDescription = "tokita",
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                        .size(width = 200.dp, height = 200.dp)
                        .background(Color.LightGray)
                        ,


                    contentScale = ContentScale.FillWidth

                )


            }
        }
            //End of Card 1
        // card 2

        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .paint(painter = painterResource(R.drawable.star), contentScale = ContentScale.FillBounds),

            shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 20.dp, bottomEnd = 20.dp),

            ){

            Spacer(modifier = Modifier.height(80.dp))

            Text(
                text = "The Most Worth ",
                color = Color.Red,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "Grocery App",
                color = Color.Red,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            //Variables
            var username by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            //end of variable

            //Username
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "",
                        tint = newOrange
                    )
                },
                label = { Text(text = "Username") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newgrey,
                    focusedBorderColor = Color.Black
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )
            //End
            Spacer(modifier = Modifier.height(10.dp))

            //Password
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "",
                        tint = newgrey
                    )
                },
                label = { Text(text = "Password") },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = newgrey,
                    focusedBorderColor = Color.Black,

                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()

            )
            //End
            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(newOrange),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 30.sp
                )

            }
            Spacer(modifier = Modifier.height(10.dp))



            Row {
                Text(
                    text = "To be a Member?",
                    modifier = Modifier.padding(20.dp),


                )
                Text(
                    text = "Log in",

                    color = Color.Red

                )
            }


        }
        //End of Card 1




    }

}



@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())


}

