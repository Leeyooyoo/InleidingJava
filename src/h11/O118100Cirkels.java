package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O118100Cirkels extends Applet {
    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x=0,y=0,a=400,b=400;

        while(teller < 100) {
            teller++;
            x += 12;
            y += 12;
            a -= 6;
            b -= 6;
            g.drawOval(a,b,x,y);
        }
    }
}