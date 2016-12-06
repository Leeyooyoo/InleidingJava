package h11;

import java.applet.*;
import java.awt.*;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O112Getallen extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int y=20;
        int x=20;
        int teller = 20;

        while(teller>10){
            x+=20;
            y+=20;

            g.drawString(""+teller,x,y);
            teller--;
        }
    }
}