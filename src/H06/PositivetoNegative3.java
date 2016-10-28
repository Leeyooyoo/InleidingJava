package H06;

import java.applet.*;
import java.awt.*;

/**
 * Created by Lionel Nolten on 26-9-2016.
 */

public class PositivetoNegative3 extends Applet {
    //Variables
    int getal1;
    int getal2;
    int G1;
    int G2;

    Font myfont;
    @Override
    public void init() {
        super.init();
        myfont = new Font("default", Font.BOLD, 18);
        //VVV voer hier de nummers in om opgeteld te worden
        getal1 = 90;
        getal2 = 90;
        //Zorgt dat het getal bij elkaar wordt opgeteld en als negatief wordt gemaakt.
        G1 = (getal1 + getal2) * 2;
        G2= (getal1 + getal2) -G1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(myfont);
        g.drawString(""+G2,20,20);
    }
}