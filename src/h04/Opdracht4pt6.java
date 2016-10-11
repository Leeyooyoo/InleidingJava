package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Pamela Currie on 27-9-2016.
 */
public class Opdracht4pt6 extends Applet {

    public void init() {
    }

    //stoplicht
    public void paint(Graphics g) {
        super.paint(g);
       g.fillRoundRect(100, 15, 100, 200, 90, 90);
        g.setColor(Color.red);
        g.fillOval(128, 44, 44, 44);
        g.setColor(Color.orange);
        g.fillOval(128, 96, 44, 44);
        g.setColor(Color.green);
        g.fillOval(128, 147, 44, 44);

    }
}
