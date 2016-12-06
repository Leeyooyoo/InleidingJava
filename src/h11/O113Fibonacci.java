package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O113Fibonacci extends Applet {
    public void paint(Graphics g) {
        int x = 40;
        int getel1 = 1;
        int getal2 = 1;
        int getal3 = 0;

        g.drawString("" + getal2, x, 80);
        while (getel1 < 89) {
            x += 20;
            getel1 = getal3 + getal2;
            getal3 = getal2;
            getal2 = getel1;
            g.drawString("" + getel1, x, 80);
        }
    }
}