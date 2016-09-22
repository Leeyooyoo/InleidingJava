package h01;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Leeyoo on 22-9-2016.
 */
public class HelloWorld extends Applet {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString("Hello Wooouurrlldd!", 50, 50);
    }
}
