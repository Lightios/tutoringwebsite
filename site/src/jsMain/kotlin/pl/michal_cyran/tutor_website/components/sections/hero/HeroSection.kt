package pl.michal_cyran.tutor_website.components.sections.hero

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.components.widgets.ContactButton
import pl.michal_cyran.tutor_website.components.widgets.MarkedText

@Composable
fun HeroSection() {
    SimpleGrid(
        numColumns = numColumns(1, md = 2),
        modifier = Modifier
            .gap(20.px)
    ) {
        Column(
            modifier = Modifier.minWidth(0.px),
            verticalArrangement = Arrangement.spacedBy(
                16.px,
                Alignment.CenterVertically
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            H1 {
                Span {
                    Text("Korepetycje z ")
                    MarkedText("matematyki")
                    Text(" i ")
                    MarkedText("informatyki")
                    Text(" dla uczniów szkół podstawowych i średnich.")
                }
            }

            P {
                Text(
                    "Pomogę Ci zrozumieć matematykę i osiągnąć lepsze wyniki. Indywidualne podejście i skuteczne metody nauczania."
                )
            }
            ContactButton()
        }

        Box(
            modifier = Modifier
                .overflow(Overflow.Hidden),
        ) {
            Image(
                src = "un0.jpg",
                modifier = Modifier
                    .height(500.px)
                    .minWidth(0.px)
            )
        }
    }
}