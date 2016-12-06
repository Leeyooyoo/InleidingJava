package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O115VijfVierkanten extends Applet{

    public void paint(Graphics g)
    {
        int teller = 1;
        int x = 0, y = 0;
        while(teller <13){
            x+= 60;
            while(teller <6){
                teller++;
                x+=25;
                y+=25;
                g.drawRect(x,y,25,25);
            }
        }
    }
}