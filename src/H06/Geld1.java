package H06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 25-9-2016.
 */
public class Geld1 extends Applet {
    //Variables
    int Geld;
    int Geld2;
    Font myfont;
    @Override
    public void init() {
        super.init();
    //VVV   plaats daar het geld.
        Geld = 113;
    //^^^   Plaats daar het geld.
        myfont = new Font("default", Font.BOLD, 18);
        //Rekent uit hoeveel geld een ieder krijgt
        Geld2 = Geld/4;
    }
    //Hoeveelheid geld dat een ieder krijgt
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(myfont);
        g.drawString("Totaal= €"+Geld+",-",10,20);
        g.drawString("Jan krijgt: €"+ Geld2 + ",-",10 ,50);
        g.drawString("Ali krijgt: €"+ Geld2 + ",-",10 ,80);
        g.drawString("Jeannette krijgt: €"+ Geld2 + ",-",10 ,110);
        g.drawString("Lionel krijgt: €"+ Geld2 + ",-",10, 140);
    }
}