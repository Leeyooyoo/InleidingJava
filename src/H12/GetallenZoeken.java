package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lionel Nolten on 8-11-2016.
 */
public class GetallenZoeken extends Applet {

    int[] getallen = {55, 44, 58, 102, 23, 37, 31, 52, 17};


    TextField textField;
    Button button;
    String schermTekst;

    @Override
    public void init() {

        textField = new TextField("", 8);
        add(textField);
        button = new Button("kies");
        add(button);
        schermTekst = "";

    }


    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;

        g.drawString(schermTekst, x, y);
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());
            boolean isGevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    isGevonden = true;
                    index = i;
                }
            }
            if (isGevonden) {
                schermTekst = "Waarde is gevonden. Index is " + index;
            } else {
                schermTekst = "Waarde is niet gevonden";
            }

            repaint();

        }
    }
}