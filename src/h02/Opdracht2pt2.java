package h02;

import java.awt.*;
import java.applet.*;

/**
 * Created by Pamela Currie on 22-9-2016.
 */
public class Opdracht2pt2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Lionel", 150, 150 );
        g.setColor(Color.red);
        g.drawString("Nolten", 150, 160 );
    }
}
