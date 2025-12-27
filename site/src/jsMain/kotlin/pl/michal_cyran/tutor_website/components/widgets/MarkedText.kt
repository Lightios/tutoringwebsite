package pl.michal_cyran.tutor_website.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.textShadow
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun MarkedText(
    text: String,
) {
    SpanText(
        text = text,
        modifier = Modifier
            .fontWeight(800)
            .color(Colors.Cyan)
            .textShadow(0.px, 0.px, blurRadius = 0.5.cssRem, color = if (ColorMode.current.isDark)
                Colors.Gray else Colors.White)
    )
}