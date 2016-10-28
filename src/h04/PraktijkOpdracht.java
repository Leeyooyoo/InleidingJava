package h04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 21-9-2016.
 */

public class PraktijkOpdracht extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        super.paint(g);
        //Lijn
        g.drawLine(30, 60, 240, 60);
        g.drawString("Lijn", 120, 75);

        //Rechthoek
        g.drawRect(30, 90, 210, 100);
        g.drawString("Rechthoek", 105, 205);

        //Afgeronde rechthoek
        g.drawRoundRect(30, 210, 210, 100, 30, 30);
        g.drawString("Afgeronde rechthoek", 80, 325);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(250, 90, 210, 100);
        g.setColor(Color.black);
        g.drawOval(250, 90, 210, 100);
        g.drawString("Gevulde rechthoek met ovaal", 270, 205);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(250, 210, 210, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 310, 325);

        //Taartpunt met ovaal eromheen
        g.drawOval(470, 90, 210, 100);
        g.setColor(Color.magenta);
        g.fillArc(470, 90, 210, 100, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 500, 205);

        //Cirkel
        g.setColor(Color.black);
        g.drawOval(520, 210, 115, 105);
        g.drawString("Cirkel",565,325);
    }
}