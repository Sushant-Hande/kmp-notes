package navigation

enum class Screen {
    SPLASH,
    REGISTER,
    LOGIN,
    FORGOT_PASSWORD,
    HOME,
    HELP
}
sealed class NavigationItem(val route: String) {
    data object Splash : NavigationItem(Screen.SPLASH.name)
    data object Register : NavigationItem(Screen.REGISTER.name)
    data object Login : NavigationItem(Screen.LOGIN.name)
    data object ForgotPassword : NavigationItem(Screen.FORGOT_PASSWORD.name)
    data object Home : NavigationItem(Screen.HOME.name)
    data object Help : NavigationItem(Screen.HELP.name)
}