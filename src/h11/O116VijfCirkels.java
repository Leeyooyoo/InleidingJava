package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O116VijfCirkels extends Applet {

    public void init() {
        setSize(100,100);
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x=0,y=0,a=50,b=50;

        while(teller < 5) {
            teller++;
            x += 14;
            y += 14;
            a -= 7;
            b -= 7;
            g.drawOval(a,b,x,y);
        }
    }
}