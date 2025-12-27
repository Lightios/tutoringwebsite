package pl.michal_cyran.tutor_website.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.dom.Text

@Composable
fun WebsiteButton() {
    Link(
        path = "https://lightios.github.io/"
    ) {
        Button(onClick = {
        }, colorPalette = ColorPalettes.Cyan) {
            Text("Otwórz stronę")
        }
    }
}