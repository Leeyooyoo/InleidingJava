package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Leeyoo on 22-9-2016.
 */
public class Opdracht4pt3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(90, 280, 100, 50);
        g.drawLine(90, 280, 100, 281);
        g.drawLine(100, 279, 106, 50);
        g.setColor(Color.orange);
        g.fillOval(90, 30, 20, 20);
        g.setColor(Color.red);
        g.fillRect(107, 50, 190, 40);
        g.setColor(Color.white);
        g.fillRect(106, 90, 190, 40);
        g.setColor(Color.blue);
        g.fillRect(106, 130, 190, 40);


    }
}