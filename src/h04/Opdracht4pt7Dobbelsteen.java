package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Pamela Currie on 4-10-2016.
 */
public class Opdracht4pt7Dobbelsteen extends Applet {

    public void init() {
    }

    //Dobbelsteenzijde4
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRoundRect(50, 50, 145, 145, 20, 20);
        g.fillOval(70, 70, 40, 40);
        g.fillOval(137, 70, 40, 40);
        g.fillOval(70, 137, 40, 40);
        g.fillOval(137, 137, 40, 40);
    }

}
