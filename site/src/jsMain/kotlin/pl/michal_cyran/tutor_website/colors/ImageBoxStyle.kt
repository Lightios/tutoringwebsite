package pl.michal_cyran.tutor_website.colors

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.JustifyContent
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.alignItems
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.display
import com.varabyte.kobweb.compose.ui.modifiers.flexShrink
import com.varabyte.kobweb.compose.ui.modifiers.justifyContent
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import pl.michal_cyran.tutor_website.toSitePalette

val ImageBoxStyle = CssStyle {
    base {
        Modifier
            .borderRadius(16.px)
            .background(
                Background.of(
                    image = linearGradient(135.deg) {
                        add(Color.rgba(6, 182, 212, 0.2f), 0.percent)
                        add(Color.rgba(34, 211, 238, 0.1f), 100.percent)
                    }.toImage()
                )
            )
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .padding(12.px)
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.3f))
            .boxShadow(
                BoxShadow.of(
                    0.px,
                    8.px,
                    24.px,
                    0.px,
                    Color.rgba(6, 182, 212, 0.2f),
                ),
                BoxShadow.of(
                    0.px,
                    1.px,
                    0.px,
                    0.px,
                    Color.rgba(255, 255, 255, 0.1f),
                    true,
                )
            )
            .flexShrink(0)
            .size(80.px)
    }
}
val ImageBoxStyleLight = CssStyle {
    base {
        Modifier
            .borderRadius(16.px)
            .background(
                colorMode.toSitePalette().imageBoxBackground
            )
            .display(DisplayStyle.Flex)
            .alignItems(AlignItems.Center)
            .justifyContent(JustifyContent.Center)
            .padding(12.px)
            .border(1.px, LineStyle.Solid, Color.rgba(6, 182, 212, 0.35f))
            .boxShadow(
                colorMode.toSitePalette().imageBoxShadow
            )
            .flexShrink(0)
            .size(80.px)
    }
}
