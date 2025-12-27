package pl.michal_cyran.tutor_website.components.sections.lessons

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.icons.fa.FaAndroid
import com.varabyte.kobweb.silk.components.icons.fa.FaBell
import com.varabyte.kobweb.silk.components.icons.fa.FaBook
import com.varabyte.kobweb.silk.components.icons.fa.FaCalendarDay
import com.varabyte.kobweb.silk.components.icons.fa.FaCalendarDays
import com.varabyte.kobweb.silk.components.icons.fa.FaCalendarMinus
import com.varabyte.kobweb.silk.components.icons.fa.FaComment
import com.varabyte.kobweb.silk.components.icons.fa.FaDumbbell
import com.varabyte.kobweb.silk.components.icons.fa.FaLocationPin
import com.varabyte.kobweb.silk.components.icons.fa.FaPencil
import com.varabyte.kobweb.silk.components.icons.fa.FaPerson
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text

@Composable
fun LessonsSection(
    modifier: Modifier = Modifier
) {
    H1 {
        Text(
            "O zajęciach",
        )
    }

    SimpleGrid(
        numColumns(base = 1, md = 2),
        modifier = Modifier.gap(20.px)
            .then(modifier)
            .id("lessons"),
    ) {
        PropertyCard(
            icon = { size -> FaLocationPin(size = size) },
            title = "Online lub stacjonarnie",
            description = "Zajęcia prowadzę online lub stacjonarnie w Krakowie - na terenie Ruczaju i Pychowic.",
        )
        PropertyCard(
            icon = { size -> FaBook(size = size) },
            title = "Materiały",
            description = "Na moim serwerze dostępne są materiały w postaci plików PDF, dzięki którym możesz nauczyć się teorii i przykładowych zadań z danych tematów.",
        )
        PropertyCard(
            icon = { size -> FaCalendarMinus(size = size) },
            title = "Odwoływanie lekcji",
            description = "Jeśli dasz mi znać dzień wcześniej, że nie dasz rady pojawić się na lekcji, nie będzie żadnego problemu. W nagłych przypadkach (np. choroba) możesz odwołać lekcję nawet kilka godzin wcześniej.",
        )
        PropertyCard(
            icon = { size -> FaBell(size = size) },
            title = "Przypomnienia o lekcjach",
            description = "Napisałem skrypt, który codziennie wieczorem przypomina o zajęciach zaplanowanych na następny dzień. Dzięki temu nie zapomnisz o lekcji, a jeśli okaże się wówczas, że musisz ją odwołać, nie będzie problemu.",
        )
        PropertyCard(
            icon = { size -> FaAndroid(size = size) },
            title = "Aplikacja do nauki matematyki",
            description = "Jestem autorem aplikacji mobilnej do nauki matematyki. Jest jeszcze we wczesnej fazie rozwoju, Twój feedback może mieć realny wpływ na jej rozwój.",
        )
        PropertyCard(
            icon = { size -> FaCalendarDays(size = size) },
            title = "Elastyczny grafik",
            description = "Mój grafik jest dostępny dla wszystkich na Discordzie i aktualizowany na bieżąco. Możesz więc umawiać się na zajęcia w dogodnych dla Ciebie terminach.",
        )
        PropertyCard(
            icon = { size -> FaPerson(size = size) },
            title = "Indywidualne podejście",
            description = "Każde zajęcia są dostosowane do Twoich potrzeb i poziomu zaawansowania.",
        )
        PropertyCard(
            icon = { size -> FaComment(size = size) },
            title = "Kontakt poza zajęciami",
            description = "Jeśli przygotowując się do spawdzianu lub matury, będziesz mieć pilne pytanie odnośnie danego zadania, możesz zapytać mnie o to na Discordzie. Postaram się odpowiedzieć jak najszybciej.",
        )
        PropertyCard(
            icon = { size -> FaDumbbell(size = size) },
            title = "Zadania do rozwiązywania",
            description = "Jeśli będziesz tego potrzebować, mogę po zajęciach wysłać Ci zadania/próbny test do samodzielnego rozwiązania. Po ich rozwiązaniu możesz je wysłać do mnie, a ja je sprawdzę.",
        )
        PropertyCard(
            icon = { size -> FaPencil(size = size) },
            title = "Dodatkowe materiały",
            description = "Jeśli będziesz potrzebować dodatkowych materiałów do nauki, mogę je dla Ciebie przygotować. Wystarczy, że powiesz mi, czego potrzebujesz.",
        )
    }

}

