package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Leeyoo on 22-9-2016.
 */
public class Opdracht4pt2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(110, 130, 260, 130);
        g.drawLine(100, 140, 180, 50);
        g.drawLine(270, 140, 180, 50);
        g.drawLine(110, 130, 110, 235);
        g.drawLine(260, 130, 260, 235);
        g.drawLine(260, 235, 110, 235);
        g.drawLine(220, 190, 220, 235);
        g.drawLine(190, 190, 190, 235);
        g.drawLine(190, 190, 220, 190);
        g.drawLine(125, 200, 170, 200);
        g.drawLine(130, 200, 130, 167);
        g.drawLine(130, 167, 165, 167);
        g.drawLine(165, 167, 165, 200);
    }
}

