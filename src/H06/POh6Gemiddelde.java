package H06;

import java.applet.Applet;
import java.awt.*;
/**
 * Created by Lionel Nolten on 28-10-2016.
 */
public class POh6Gemiddelde extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double uitkomst1;
    int uitkomst2;
    double Uitkomst3;

    @Override
    public void init() {
        super.init();
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        uitkomst1 = (cijfer1 + cijfer2 + cijfer3)/3*10;
        uitkomst2 = (int) uitkomst1;
        Uitkomst3 = (double) uitkomst2 /10;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("het gemiddelde is: "+ Uitkomst3,20,20);
    }
}