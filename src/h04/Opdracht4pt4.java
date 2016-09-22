package h04;

import java.awt.*;
import java.applet.*;

/**
 * Created by Pamela Currie on 22-9-2016.
 */
public class Opdracht4pt4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(40, 40, 40, 250);
        g.drawLine(35, 250, 300, 250);
        g.drawLine(35, 230, 300, 230);
        g.drawLine(35, 210, 300, 210);
        g.drawLine(35, 190, 300, 190);
        g.drawLine(35, 170, 300, 170);
        g.drawLine(35, 150, 300, 150);
        g.drawLine(35, 130, 300, 130);
        g.drawLine(35, 110, 300, 110);
        g.drawLine(35, 90, 300, 90);
        g.drawString("0", 26, 255);
        g.drawString("20", 19, 235);
        g.drawString("40", 19, 215);
        g.drawString("60", 19, 195);
        g.drawString("80", 19, 175);
        g.drawString("100", 12, 155);
        g.setColor(Color.magenta);
        g.fillRect(70, 210, 45, 40);
        g.setColor(Color.YELLOW);
        g.fillRect(145, 150, 45, 100);
        g.setColor(Color.BLUE);
        g.fillRect(220, 170, 45, 80);
    }
}
