package H05;

import java.awt.*;
import java.applet.*;

/**
 * Created by Lionel Nolten on 22-9-2016.
 */
public class Staafdiagram extends Applet {
    //Valerie:  40kg
    int V ;
    //Jeroen:   100kg
    int J;
    //Hans:     80kg
    int H;

    int V1;
    int V2;
    int H1;
    int H2;
    int J1;
    int J2;
    int X;
    public void init() {
        J = 100;
        H = 80;
        V = 40;

//Gewicht omrekenen naar coördinaten
        X = 15;
        V1 = 200 - (X * V) / 10;
        V2 = X * V / 10;
        H1 = 200 - (H * X) / 10;
        H2 = H * X / 10;
        J1 = 200 - (J * X) / 10;
        J2 = X * J / 10;
    }

    public void paint(Graphics g) {
        //Lijnen
        g.drawLine(40, 130, 40, 250);
        g.drawLine(35, 250, 300, 250);
        g.drawLine(35, 230, 300, 230);
        g.drawLine(35, 210, 300, 210);
        g.drawLine(35, 190, 300, 190);
        g.drawLine(35, 170, 300, 170);
        g.drawLine(35, 150, 300, 150);
        g.drawLine(35, 130, 300, 130);

        //Hoeveelheid gewicht in kg
        g.drawString("0", 26, 255);
        g.drawString("20", 19, 235);
        g.drawString("40", 19, 215);
        g.drawString("60", 19, 195);
        g.drawString("80", 19, 175);
        g.drawString("100", 12, 155);
        g.drawString("120", 12, 135);

        //Namen
        g.drawString("Valerie", 70, 265);
        g.drawString("Jeroen", 145, 265);
        g.drawString("Hans", 220, 265);

        //Valerie
        g.setColor(Color.magenta);
        g.fillRect(70, 210, 45, 40);

        //Jeroen
        g.setColor(Color.YELLOW);
        g.fillRect(145, 150, 45, 100);

        //Hans
        g.setColor(Color.BLUE);
        g.fillRect(220, 170, 45, 80);
    }
}