package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 30-11-2016.
 */
public class O114Tafel3 extends Applet {

    public void paint(Graphics g)
    {
        int teller = 1, drie = 3 , uitslag = 0 ;
        int x = 1;
        while(teller <13){
            x+= 15;
            uitslag = drie*teller;
            g.drawString(drie+" x "+teller+" = "+uitslag,100,x);
            teller++;
        }
    }
}