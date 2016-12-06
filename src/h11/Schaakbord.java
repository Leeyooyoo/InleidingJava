package h11;

import java.awt.*;
import java.applet.Applet;

/**
 * Created by Lionel Nolten on 2-11-2016.
 */
public class Schaakbord extends Applet {


    private int marge;
    private int breedteVeld;
    private int hoogteVeld;
    private Color wit;
    private Color zwart;
    private Color achtergrond;


    public void init() {
        wit = Color.WHITE;
        zwart = Color.BLACK;
        achtergrond = Color.LIGHT_GRAY;
        marge = 60;
        breedteVeld = 60;
        hoogteVeld = breedteVeld;

        int breedteScherm = 2 * marge + 8 * breedteVeld;
        int hoogteScherm = 2 * marge + 8 * hoogteVeld;
        setSize(breedteScherm, hoogteScherm);
        setBackground(achtergrond);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int y = marge;
        for (int rij = 0; rij < 8; rij++) {
            int x = marge;
            for (int kolom = 0; kolom < 8; kolom++) {
                if ( (rij + kolom) % 2 == 0 ) {
                    g.setColor(zwart);
                }else {
                    g.setColor(wit);
                }
                g.fillRect(x, y, breedteVeld, hoogteVeld);
                x += breedteVeld;
            }


            y += hoogteVeld;
            
        }
    }
}