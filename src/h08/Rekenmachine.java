package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by Pamela Currie on 28-9-2016.
 */
public class Rekenmachine extends Applet {

    TextField vak1;
    TextField vak2;
    Button keerKnop;
    Button deelKnop;
    Button minKnop;
    Button plusKnop;

    double getal1;
    double getal2;
    double uitkomst;


    @Override
    public void init() {
        super.init();
        vak1 = new TextField("", 20);
        add(vak1);

        vak2 = new TextField("", 20);
        add(vak2);

        keerKnop = new Button("x");
        add(keerKnop);
        KeerKnoplistener kkl = new KeerKnoplistener();
        keerKnop.addActionListener(kkl);

        deelKnop = new Button("/");
        add(deelKnop);
        DeelKnoplistener dkl = new DeelKnoplistener();
        deelKnop.addActionListener(dkl);

        minKnop = new Button("-");
        add(minKnop);
        MinKnopListener mkl = new MinKnopListener ();
        minKnop.addActionListener(kkl);

        plusKnop = new Button("+");
        add(plusKnop);
        plusKnoplistener pkl = new plusKnoplistener();
        plusKnop.addActionListener(pkl);
    }
    class KeerKnoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 * getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }


    class DeelKnoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 / getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }


    class MinKnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 - getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }


    class plusKnoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 + getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");
        }
    }
}
