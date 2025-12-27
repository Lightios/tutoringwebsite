package pl.michal_cyran.tutor_website.components.sections.offer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.shapes.Shape
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.LineStyle.Companion.Solid
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import pl.michal_cyran.tutor_website.colors.CardStyle
import pl.michal_cyran.tutor_website.colors.ImageBoxStyle

@Composable
fun OfferCard(
    title: String,
    description: String,
    icon: @Composable ((size: IconSize) -> Unit),
    modifier: Modifier = Modifier
) {
    Box(
        modifier = CardStyle.toModifier()
            .padding(16.px)
            .height(200.px)
            .fillMaxWidth()
            .then(modifier)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
//            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.px)
        )  {
            Box(
                modifier = ImageBoxStyle.toModifier()
            ) {
                icon(IconSize.XXL)
            }
            Column {
                H4 {
                    Text(
                        title,
                    )
                }
                P {
                    Text(
                        description,
                    )
                }
            }
        }

    }
}