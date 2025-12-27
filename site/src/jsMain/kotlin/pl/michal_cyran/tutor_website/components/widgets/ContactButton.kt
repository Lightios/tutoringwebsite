package pl.michal_cyran.tutor_website.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.dom.Text

@Composable
fun ContactButton() {
    Link(
        path = "mailto:michalcyran77777@gmail.com?subject=Korepetycje"
    ) {
        Button(onClick = {
        }, colorPalette = ColorPalettes.Cyan) {
            Text("Skontaktuj się")
        }
    }
}