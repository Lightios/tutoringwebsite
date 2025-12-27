package pl.michal_cyran.tutor_website.components.sections.offer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.silk.components.icons.fa.FaClock
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.colors.ImageBoxStyle

@Composable
fun PricingSection() {
    SimpleGrid(
        numColumns(base=1, md=2)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = ImageBoxStyle.toModifier()
            ) {
                FaClock(size = IconSize.XL)
            }

            H1 {
                Text(
                    "70zł"
                )
            }
            P {
                Text(
                    "za godzinę"
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            H3 {
                Text(
                    "Elastyczne opcje czasowe"
                )
            }

            P {
                Text("Poza standardowymi godzinnymi zajęciami istnieje możliwość umówienia się na spotkania trwające 1,5 godziny lub 2 godziny.")
            }
        }
    }
}