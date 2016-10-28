package H06;

import java.applet.*;
import java.awt.*;

/**
 * Created by Pamela Currie on 26-9-2016.
 */
public class Seconden2 extends Applet {
    int uur;
    int jaar;
    int dag;
    Font mijfont;

    int uur2;
    int jaar2;
    int dag2;
    @Override
    public void init() {
        super.init();
        uur = 5;
        dag = 1;
        jaar = 9;

        //Uitrekenen hoeveel uren/dagen/jaren het zijn
        uur2 = uur/1;
        dag2 = dag/1;
        jaar2 = jaar/1;

        //Omrekenen naar seconden
        dag = dag * 24 * 3600;
        uur = uur *  3600;
        jaar = jaar * 365 *24 * 3600;
        mijfont = new Font("default", Font.BOLD, 15);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(mijfont);
        g.drawString("Er zitten zoveel seconden in "+uur2+" uur: "+ uur+ " Seconden",10,15);
        g.drawString("Er zitten zoveel seconden in "+dag2+" dag: "+ dag + " Seconden",10,35);
        g.drawString("Er zitten zoveel seconden in "+jaar2+" Jaar: " + jaar + " Seconden",10,55);
    }
}