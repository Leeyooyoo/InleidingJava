package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 2-12-2016.
 */
public class WhileLus1 extends Applet {

    public void init() {
        setSize(600, 600);
    }

    public void paint(Graphics g) {
        int i = 0;
        int j = 0;
        int x = 50;
        int y = 50;

        while (j < 30){
            x = 50;
            y += 20;
            while (x < getWidth() - 50) {
                g.drawString("X", x, y);
                x += 10;
                i++;
            }
            i = 0;
            j++;
        }
    }
}