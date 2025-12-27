package pl.michal_cyran.tutor_website.components.sections.offer

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaC
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H5
import org.jetbrains.compose.web.dom.Text

@Composable
fun OfferHeading(
    title: String,
    icon: @Composable (size: IconSize) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(leftRight = 16.px, topBottom = 8.px)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.px)
    ) {
        Box(
            modifier = Modifier
                .size(100.px)
                .borderRadius(8.px),
            contentAlignment = Alignment.Center
        ) {
            icon(IconSize.X5)
        }

        H5 {
            Text(
                title,
            )
        }
    }
}