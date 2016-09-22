package h01;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Pamela Currie on 22-9-2016.
 */
public class HelloWorld extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("Hallo wereld!", 50, 50);
    }
}
