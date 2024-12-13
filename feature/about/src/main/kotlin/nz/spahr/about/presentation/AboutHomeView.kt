package nz.spahr.about.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import nz.spahr.theme.SpahrTheme

@Composable
internal fun AboutHomeView(){
    About()
}

@Composable
fun About(modifier: Modifier = Modifier) {
    Text(
        text = "This is the about view",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SpahrTheme {
        About()
    }
}