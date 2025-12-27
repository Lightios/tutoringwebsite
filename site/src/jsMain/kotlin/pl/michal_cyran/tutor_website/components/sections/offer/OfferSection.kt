package pl.michal_cyran.tutor_website.components.sections.offer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaAt
import com.varabyte.kobweb.silk.components.icons.fa.FaAtom
import com.varabyte.kobweb.silk.components.icons.fa.FaBagShopping
import com.varabyte.kobweb.silk.components.icons.fa.FaCalculator
import com.varabyte.kobweb.silk.components.icons.fa.FaCompactDisc
import com.varabyte.kobweb.silk.components.icons.fa.FaComputer
import com.varabyte.kobweb.silk.components.icons.fa.FaComputerMouse
import com.varabyte.kobweb.silk.components.icons.fa.FaExpand
import com.varabyte.kobweb.silk.components.icons.fa.FaGraduationCap
import com.varabyte.kobweb.silk.components.icons.fa.FaK
import com.varabyte.kobweb.silk.components.icons.fa.FaKeyboard
import com.varabyte.kobweb.silk.components.icons.fa.FaLaptopCode
import com.varabyte.kobweb.silk.components.icons.fa.FaMemory
import com.varabyte.kobweb.silk.components.icons.fa.FaRobot
import com.varabyte.kobweb.silk.components.icons.fa.FaSchool
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.theme.shapes.Shape
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun OfferSection(
    modifier: Modifier = Modifier
) {
    H1 {
        Text(
            "Moja oferta",
        )
    }

    H3 {
        Text(
            "Oferuję korepetycje dostosowane do Twoich potrzeb i poziomu zaawansowania.",
        )
    }

    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier.fillMaxWidth().gap(1.cssRem)
            .id("offer"),
    ) {
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(1.cssRem)
        ) {
            OfferHeading(
                title = "Matematyka",
                icon = { size -> FaCalculator(size = size) },
                modifier = Modifier.padding(bottom = 16.px)
            )

            OfferCard(
                icon = { size -> FaGraduationCap(size=size) },
                title = "Szkoła podstawowa",
                description = "Pomoc w zrozumieniu podstawowych pojęć matematycznych i przygotowanie do egzaminu ósmoklasisty.",
            )

            OfferCard(
                icon = { size -> FaSchool(size=size) },
                title = "Szkoła średnia - poziom podstawowy",
                description = "Wsparcie w bieżących lekcjach i przygotowanie do matury na poziomie podstawowym.",
            )

            OfferCard(
                icon = { size -> FaAtom(size=size) },
                title = "Szkoła średnia - poziom rozszerzony",
                description = "Zaawansowane zagadnienia matematyczne i przygotowanie do matury rozszerzonej.",
            )

        }

        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.spacedBy(1.cssRem)
        ) {
            OfferHeading(
                title = "Informatyka",
                icon = { size -> FaComputer(size = size) },
                modifier = Modifier.padding(bottom = 16.px)
            )

            OfferCard(
                icon = { size -> FaRobot(size=size) },
                title = "Szkoła podstawowa",
                description = "Informatyka w szkole podstawowej - nauka i pomoc w bieżących lekcjach, w szczególności Scratch.",
            )

            OfferCard(
                icon = { size -> FaLaptopCode(size=size) },
                title = "Szkoła średnia",
                description = "Pomoc w bieżących lekcjach z informatyki ogólnej i zajęć na kierunkach technik informatyk i technik programista.",
            )

            OfferCard(
                icon = { size -> FaCompactDisc(size=size) },
                title = "Egzamin zawodowy",
                description = "Pomoc w przygotowaniu do egzaminu z poziomu kwalifikacji E.13 i E.14 / EE.09 / INF.03 i INF.04.",
            )
        }
    }

    Box(modifier = Modifier.height(24.px))

    H2 {
        Text(
            "Cennik",
        )
    }

    PricingSection()
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceAround
//    ) {
//        PriceCard(duration = "30 minut", price = "35 zł")
//        PriceCard(duration = "60 minut", price = "70 zł")
//        PriceCard(duration = "90 minut", price = "105 zł")
//        PriceCard(duration = "120 minut", price = "140 zł")
//    }
}


