package pl.michal_cyran.tutor_website.components.sections.testimonials

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaStar
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorPalettes
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.colors.CardStyle
import pl.michal_cyran.tutor_website.components.widgets.ContactButton
import pl.michal_cyran.tutor_website.components.widgets.MarkedText

@Composable
fun TestimonialCard(
    text: String,
    author: String,
    description: String,
    modifier: Modifier = Modifier
) {
//    val interactionSource = remember { MutableInteractionSource() }
//    val isHovered by interactionSource.collectIsHoveredAsState()
//    val scale by animateFloatAsState(
//        targetValue = if (isHovered) 1.05f else 1f,
//        label = "CardScale"
//    )
//
//    val boxColor = if (isHovered) {
//        MaterialTheme.colorScheme.primary.copy(alpha = 0.4f)
//    } else {
//        MaterialTheme.colorScheme.secondaryContainer
//    }

    Box(
        modifier = CardStyle.toModifier()
            .then(modifier)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.px),
                modifier = Modifier.padding(bottom = 8.px)
            ) {
                repeat(5) {
                    FaStar(
                        style = IconStyle.FILLED,
                        modifier = Modifier
                            .color(Colors.Cyan)
                    )
                }
            }

            P(
                attrs = Modifier.weight(1).toAttrs()
            ) {
                Text(
                    text,
                )
            }

            Span {
                MarkedText(author)
                Text(description)
            }
        }
    }
}
