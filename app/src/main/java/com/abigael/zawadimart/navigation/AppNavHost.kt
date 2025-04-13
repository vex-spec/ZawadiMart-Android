package com.abigael.zawadimart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abigael.zawadimart.ui.screens.about.AboutScreen
import com.abigael.zawadimart.ui.screens.cryptocurrency.CryptocurrencyScreen
import com.abigael.zawadimart.ui.screens.dashboard.DashboardScreen
import com.abigael.zawadimart.ui.screens.form.FormScreen
import com.abigael.zawadimart.ui.screens.home.HomeScreen
import com.abigael.zawadimart.ui.screens.intent.IntentScreen
import com.abigael.zawadimart.ui.screens.item.ItemScreen
import com.abigael.zawadimart.ui.screens.service.ServiceScreen
import com.abigael.zawadimart.ui.screens.splash.SplashScreen
import com.abigael.zawadimart.ui.screens.start.StartScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)

        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)

        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)

        }
        composable(ROUT_CRYPTOCURRENCY) {
            CryptocurrencyScreen(navController)

        }
        composable(ROUT_FORM) {
            FormScreen(navController)

        }






    }
}