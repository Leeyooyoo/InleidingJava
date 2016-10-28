package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by Lionel Nolten on 24-10-2016.
 * Hoogste en laagste getal.
 */
public class Opdr1Plus2 extends Applet {
    TextField T1;
    TextField T2;
    Button Enter;
    double A;
    double B;

    @Override
    public void init() {
        super.init();
        EnterListener El = new EnterListener();
        T1 = new TextField("", 5);
        T1.addActionListener(El);
        T2 = new TextField("", 5);
        T2.addActionListener(El);
        Enter = new Button("Enter");
        Enter.addActionListener(El);

        add(T1);
        add(T2);
        add(Enter);
    }

    class EnterListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            A=Double.parseDouble(T1.getText());
            B=Double.parseDouble(T2.getText());
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("" + A + " is groter dan "+ B + ": " +(A > B ), 50, 60 );
        g.drawString("" + B + " is groter dan "+ A + ": " + (B > A) , 50, 80 );
    }
}