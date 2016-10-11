package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Pamela Currie on 4-10-2016.
 */
public class PraktijkOpdracht extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(30, 60, 240, 60);
        g.drawString("Lijn", 120, 75);
        g.drawRect(30, 90, 210, 100);
        g.drawString("Rechthoek", 105, 205);
        g.drawRoundRect(30, 210, 210, 100, 20, 20);
        g.drawString("Afgeronde rechthoek", 80, 325);
    }
}
