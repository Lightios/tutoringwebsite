package pl.michal_cyran.tutor_website.components.sections.testimonials

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.gridAutoRows
import com.varabyte.kobweb.compose.ui.modifiers.gridTemplateColumns
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fr
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.components.widgets.ContactButton
import pl.michal_cyran.tutor_website.components.widgets.MarkedText


@Composable
fun TestimonialsSection(
    modifier: Modifier = Modifier
) {
    H1 {
        Text(
            "Opinie uczniów",
        )
    }

    H3 {
        Text(
            "Zobacz, co mówią o mnie moi uczniowie i ich rodzice.",
        )
    }

    SimpleGrid(
        numColumns(1, md = 3),
        modifier = Modifier
            .display(DisplayStyle.Grid)
            .gridAutoRows { size(1.fr) }
            .gap(16.px)
            .id("testimonials"),
    ) {
        TestimonialCard(
            text = "\"Michał bardzo fajnie prowadzi zajecia, zawsze odpisuje i widac ze zalezy mu na jego uczniach, polecam!!!\"",
            author = "Julka",
            description = ", uczennica 1 klasy liceum",
        )

        TestimonialCard(
            text = "\"Idealne przygotowanie pod kątem matury! Świetna atmosfera, empatyczna osoba i duża wyrozumiałość dla ucznia.\"",
            author = "Aleksandra",
            description = ", maturzystka",
        )

        TestimonialCard(
            text = "\"Polecam z całego serca. Bardzo zadowoleni z lekcji. Córka napisała egzamin 8 klasisty na 100%!\"",
            author = "Pavel",
            description = ", rodzic uczennicy 8 klasy",
        )
    }

    Span {
        Text("Wszystkie opinie są ")
        MarkedText("autentyczne")
        Text(" i pochodzą z mojego profilu na stronie Superprof.pl.")
    }


}

