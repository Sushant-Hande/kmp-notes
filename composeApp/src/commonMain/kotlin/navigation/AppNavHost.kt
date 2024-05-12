package navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import screens.HomeScreen
import screens.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Splash.route
) {
    NavHost(
        modifier = modifier, navController = navController, startDestination = startDestination
    ) {

        composable(NavigationItem.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(NavigationItem.Home.route) {
            HomeScreen()
        }
    }
}