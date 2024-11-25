package man.run2.myloginpage

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import man.run2.myloginpage.pages.HomePage
import man.run2.myloginpage.pages.LoginPage
import man.run2.myloginpage.pages.SignupPage

@Composable
fun MyAppNavigation (modifier : Modifier= Modifier,authViewModel :AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login") {
            LoginPage(modifier,navController, authViewModel)
        }
        composable("home") {
            HomePage(modifier,navController, authViewModel)
        }
        composable("signup") {
            SignupPage(modifier,navController, authViewModel)
        }
    })

}