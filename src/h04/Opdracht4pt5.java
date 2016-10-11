package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Pamela Currie on 27-9-2016.
 */
public class Opdracht4pt5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 100, 50, 90, 135);
    }
}
