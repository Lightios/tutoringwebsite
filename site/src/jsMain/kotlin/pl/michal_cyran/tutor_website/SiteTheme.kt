package pl.michal_cyran.tutor_website

import com.varabyte.kobweb.compose.css.Background
import com.varabyte.kobweb.compose.css.BoxShadow
import com.varabyte.kobweb.compose.css.functions.Gradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.css.functions.toImage
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.setVariable
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.color
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

/**
 * @property nearBackground A useful color to apply to a container that should differentiate itself from the background
 *   but just a little.
 */
class SitePalette(
    val nearBackground: Color,
    val cobweb: Color,
    val brand: Brand,
    val textMuted: Color,
    val backgroundCardGradient: Background,
    val backgroundCardShadow: List<BoxShadow.Listable>,
    val backgroundCardHoverShadow: List<BoxShadow.Listable>,
    val imageBoxBackground: Background,
    val imageBoxShadow: List<BoxShadow.Listable>,
) {
    class Brand(
        val primary: Color = Color.rgb(0x3C83EF),
        val accent: Color = Color.rgb(0xF3DB5B),
    )
}

object SitePalettes {
    val light = SitePalette(
        nearBackground = Color.rgb(0xF4F6FA),
        cobweb = Colors.LightGray,
        brand = SitePalette.Brand(
            primary = Color.rgb(0x3C83EF),
            accent = Color.rgb(0xFCBA03),
        ),
        textMuted = Colors.Black.copy(alpha = 150),
        backgroundCardGradient = Background.of(
            image = linearGradient(135.deg) {
                add(Color.rgb(248, 250, 252), 0.percent)
                add(Color.rgb(241, 245, 249), 100.percent)
            }.toImage()
        ),
        backgroundCardShadow = listOf(
            BoxShadow.of(
                0.px,
                10.px,
                30.px,
                0.px,
                Color.rgba(15, 23, 42, 0.12f), // soft neutral shadow
            ),
            BoxShadow.of(
                0.px,
                0.px,
                0.px,
                1.px,
                Color.rgba(255, 255, 255, 0.8f),
                true
            )
        ),
        backgroundCardHoverShadow = listOf(
            BoxShadow.of(
                0.px,
                20.px,
                40.px,
                0.px,
                Color.rgba(15, 23, 42, 0.18f),
            ),
            BoxShadow.of(
                0.px,
                0.px,
                40.px,
                0.px,
                Color.rgba(6, 182, 212, 0.25f),
            )
        ),
        imageBoxBackground = Background.of(
            image = linearGradient(135.deg) {
                add(Color.rgb(236, 254, 255), 0.percent) // cyan-50
                add(Color.rgb(240, 249, 255), 100.percent) // light airy surface
            }.toImage()
        ),
        imageBoxShadow = listOf(
            BoxShadow.of(
                0.px,
                6.px,
                18.px,
                0.px,
                Color.rgba(15, 23, 42, 0.15f), // neutral soft shadow
            ),
            BoxShadow.of(
                0.px,
                0.px,
                20.px,
                0.px,
                Color.rgba(6, 182, 212, 0.2f), // cyan glow
            ),
            BoxShadow.of(
                0.px,
                1.px,
                0.px,
                0.px,
                Color.rgba(255, 255, 255, 0.9f),
                true,
            )
        ),
    )
    val dark = SitePalette(
        nearBackground = Color.rgb(0x13171F),
        cobweb = Colors.LightGray.inverted(),
        brand = SitePalette.Brand(
            primary = Color.rgb(0x3C83EF),
            accent = Color.rgb(0xF3DB5B),
        ),
        textMuted = Colors.White.copy(alpha = 150),
        Background.of(
            image = linearGradient(135.deg) {
                add(Color.rgba(15, 23, 42, 0.9f), 0.percent)
                add(Color.rgba(30, 41, 59, 0.8f), 100.percent)
            }.toImage()
        ),
        backgroundCardShadow = listOf(
            BoxShadow.of(
                0.px,
                20.px,
                60.px,
                0.px,
                Color.rgba(0, 0, 0, 0.5f),
            ),
            BoxShadow.of(

                0.px,
                0.px,
                0.px,
                1.px,
                Color.rgba(6, 182, 212, 0.1f),
                true
            ),
            BoxShadow.of(
                0.px,
                1.px,
                0.px,
                0.px,
                Color.rgba(255, 255, 255, 0.05f)
            )
        ),
        backgroundCardHoverShadow = listOf(
            BoxShadow.of(
                0.px,
                30.px,
                60.px,
                0.px,
                Color.rgba(0, 0, 0, 0.6f),
            ),
            BoxShadow.of(
                0.px,
                0.px,
                60.px,
                0.px,
                Color.rgba(6, 182, 212, 0.3f),
            ),
            BoxShadow.of(
                0.px,
                0.px,
                0.px,
                1.px,
                Color.rgba(6, 182, 212, 0.2f),
                true,
            ),
            BoxShadow.of(
                0.px,
                1.px,
                0.px,
                0.px,
                Color.rgba(255, 255, 255, 0.1f)
            )
        ),
        imageBoxBackground = Background.of(
            image = linearGradient(135.deg) {
                add(Color.rgba(6, 182, 212, 0.2f), 0.percent)
                add(Color.rgba(34, 211, 238, 0.1f), 100.percent)
            }.toImage()
        ),
        imageBoxShadow = listOf(
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
        ),
    )
}

fun ColorMode.toSitePalette(): SitePalette {
    return when (this) {
        ColorMode.LIGHT -> SitePalettes.light
        ColorMode.DARK -> SitePalettes.dark
    }
}

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes.light.background = Color.rgb(0xFAFAFA)
    ctx.theme.palettes.light.color = Colors.Black
    ctx.theme.palettes.dark.background = Color.rgb(0x06080B)
    ctx.theme.palettes.dark.color = Colors.White
}
