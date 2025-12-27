package pl.michal_cyran.tutor_website.components.sections.contact

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.colors.CardStyle
import pl.michal_cyran.tutor_website.components.widgets.ContactButton


@Composable
fun ContactSection(
    modifier: Modifier = Modifier
) {
    H1 {
        Text(
            "Kontakt"
        )
    }

    H3(
        Modifier
            .textAlign(TextAlign.Center)
            .fillMaxWidth()
            .toAttrs { }
    ) {
        Text(
            "Skontaktuj się ze mną, aby umówić lekcję lub zadać pytanie.",
        )
    }

    Row(
        modifier = Modifier.fillMaxWidth()
            .id("contact"),
        horizontalArrangement = Arrangement.spacedBy(16.px)
    ) {
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                CardStyle.toModifier()
            ) {
                Column(
                    modifier = Modifier.padding(20.px),
                    verticalArrangement = Arrangement.spacedBy(10.px)
                ) {
                    H4 {
                        Text(
                            "Informacje kontaktowe",
                        )
                    }

                    P {
                        Text(
                            "Aby umówić lekcję, skontaktuj się ze mną używając poniższego przycisku.",
                        )
                    }

                    ContactButton()

                    ContactItem(
                        "date_range",
                        title = "Godziny pracy",
                        value = "Poniedziałek - Sobota: 10:00 - 20:00\n"
                    )
                }
            }
        }
    }
}
