package pl.michal_cyran.tutor_website.components.sections.about

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
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
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.components.widgets.MarkedText
import pl.michal_cyran.tutor_website.components.widgets.WebsiteButton


@Composable
fun AboutSection() {
    H1 {
        Text("O mnie")
    }
        SimpleGrid(
            numColumns = numColumns(1, md = 2),
            modifier = Modifier
                .gap(20.px)
                .id("about"),
        ) {
            Box(
                modifier = Modifier
                    .overflow(Overflow.Hidden),
            ) {

                Image(
                    src = "un1.jpg",
                    modifier = Modifier
                        .height(500.px)
                        .minWidth(0.px)
                )
            }
            Column(
                modifier = Modifier.minWidth(0.px),
                verticalArrangement = Arrangement.spacedBy(
                    16.px,
                    Alignment.CenterVertically
                )
            ) {
//
                Span {
                    Text("Jestem absolwentem ")
                    MarkedText("Uniwersytetu Jagiellońskiego")
                    Text(". Matematyka i informatyka to moje pasje od wielu lat. Lubię zdobywać wiedzę z tych dziedzin, a także pomagać innym w ich poznawaniu.")
                }
//
                Span {
                    Text("Posiadam ")
                    MarkedText("cztery lata doświadczenia")
                    Text(" w udzielaniu profesjonalnych korepetycji oraz wieloletnie doświadczenie w nauczaniu swoich koleżanek i kolegów z klasy.")
                }

                Span {
                    Text("Już w technikum prowadziłem zajęcia z ")
                    MarkedText("programowania dla szkół podstawowych.")
                }
            }
        }

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
                )
            ) {
                Span {
                    Text("Z natury jestem bardzo ")
                    MarkedText("empatyczną")
                    Text(" osobą, dzięki czemu łatwo zrozumieć mi sposób myślenia innych; wiem, które zagadnienia mogą sprawić problem.")
                }

                Span {
                    Text("Posiadam także ")
                    MarkedText("ogromną cierpliwość")
                    Text(", więc każdemu jestem w stanie wszystko od początku wyjaśnić, tyle razy, ile trzeba.")
                }

                Span {
                    Text("Moje umiejętności dydaktyczne stale rozwijam, czytając książki na temat ")
                    MarkedText("psychologii i nauczania")
                    Text(" oraz przeglądając strony z propozycjami ciekawych lekcji matematyki. Dzięki psychologii lepiej rozumiem potrzeby i motywacje moich uczniów, co pozwala mi skuteczniej przekazywać wiedzę.")
                }
            }

            Box(
                modifier = Modifier
                    .overflow(Overflow.Hidden),
            ) {

                Image(
                    src = "un2.jpg",
                    modifier = Modifier
                        .height(500.px)
                        .minWidth(0.px)
                )
            }
        }
        SimpleGrid(
            numColumns = numColumns(1, md = 2),
            modifier = Modifier
                .gap(20.px)
        ) {
            Box(
                modifier = Modifier
                    .overflow(Overflow.Hidden),
            ) {
                Image(
                    src = "un3.jpg",
                    modifier = Modifier
                        .height(500.px)
                        .minWidth(0.px)
                )
            }
            Column(
                modifier = Modifier.minWidth(0.px),
                verticalArrangement = Arrangement.spacedBy(
                    16.px,
                    Alignment.CenterVertically
                ),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Span {
                    Text("Jeśli chcesz zobaczyć moje projekty i umiejętności ")
                    MarkedText("informatyczne")
                    Text(", to zapraszam do mojej strony internetowej.")
                }
                WebsiteButton()
            }
        }
    }
