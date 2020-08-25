package me.zeroeightsix.kami.gui.kami.theme.kami;

import java.awt.*;

/**
 * @author dominikaaaa
 * Class for all the main GUI colours used by the default kami theme
 * mfw I make it easier for skids to customize kami
 */
public class KamiGuiColors {
    public enum GuiC {
        bgColour(new Color(42, 191, 40)), // normal colored
        bgColourHover(new Color(52, 201, 50)), // light colored

        buttonPressed(new Color(68, 252, 22)),

        // N = normal T = toggled
        buttonIdleN(new Color(200, 200, 200)), // lighter grey
        buttonHoveredN(new Color(190, 190, 190)), // light grey

        buttonIdleT(new Color(184, 227, 180)), // lighter colored
        buttonHoveredT((new Color(buttonIdleT.color.getRGB())).brighter()),

        windowOutline(new Color(68, 252, 22)),
        windowOutlineWidth(1.8f),

        pinnedWindow(new Color(68, 252, 22)),
        unpinnedWindow(168.3),
        lineWindow(112.2),

        sliderColour(new Color(16, 165, 0)),

        enumColour(new Color(68, 252, 22)),

        chatOutline(new Color(145, 229, 123)),

        scrollBar(new Color(68, 252, 22));

        public Color color;
        public float aFloat;
        public double aDouble;

        GuiC(Color color) {
            this.color = color;
        }

        GuiC(float aFloat) {
            this.aFloat = aFloat;
        }

        GuiC(double aDouble) {
            this.aDouble = aDouble;
        }
    }
}