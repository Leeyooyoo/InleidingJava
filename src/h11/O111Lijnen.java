package h11;

import java.awt.*;
import java.applet.Applet;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O111Lijnen extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int x = 0;

        for(teller = 1;teller <11;teller++){
            x+=20;
            g.drawLine(x,50,x,100);
            g.drawString(""+teller,x,25);
        }
    }
}