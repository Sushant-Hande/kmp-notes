package screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import kmp_notes.composeapp.generated.resources.Res
import kmp_notes.composeapp.generated.resources.app_name
import kotlinx.coroutines.delay
import navigation.NavigationItem
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun SplashScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(Res.string.app_name))
    }

    LaunchedEffect(key1 = true) {
        delay(3000L)
        navController.navigate(NavigationItem.Home.route) {
            popUpTo(NavigationItem.Splash.route) {
                inclusive = true
            }
        }
    }
}