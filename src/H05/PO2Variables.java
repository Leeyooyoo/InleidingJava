package H05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Lionel Nolten on 22-9-2016.
 * Praktijkopdracht van h04 redone met variabelen.
 */

public class PO2Variables extends Applet {
    Color Achtergrondkleur;
    Color kleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    public void init() {
        Achtergrondkleur = Color.WHITE;
        kleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 210;
        hoogte = 100;
        setBackground(Achtergrondkleur);
    }
    public void paint(Graphics g) {

        //Lijn
        g.drawLine(30, 60, 240, 60);
        g.drawString("Lijn", 120, 75);

        //Rechthoek
        g.drawRect(30, 90, breedte, hoogte);
        g.drawString("Rechthoek", 105, 205);

        //Afgeronde rechthoek
        g.drawRoundRect(30, 210, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 80, 325);

        //Gevulde rechthoek met ovaal
        g.setColor(kleur);
        g.fillRect(250, 90, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(250, 90, 210, 100);
        g.drawString("Gevulde rechthoek met ovaal", 270, 205);

        //Gevulde ovaal
        g.setColor(kleur);
        g.fillOval(250, 210, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 310, 325);

        //Taartpunt met ovaal eromheen
        g.drawOval(470, 90, breedte, hoogte);
        g.setColor(kleur);
        g.fillArc(470, 90, 210, 100, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 500, 205);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawOval(520, 210, 115, 105);
        g.drawString("Cirkel",565,325);
    }
}