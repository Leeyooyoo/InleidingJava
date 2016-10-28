package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Lionel Nolten on 25-10-2016.
 */
public class POH10 extends Applet {
    TextField T1;
    Button B1;
    int INT;
    String D;
    String E;
    String s;
    double A;
    Label titel;

    @Override
    public void init() {
        super.init();
        EnterClass ec = new EnterClass();
        B1 = new Button("Enter");
        B1.addActionListener(ec);
        T1 = new TextField("", 5);
        T1.addActionListener(ec);
        titel = new Label("Voer hier je eind cijfer in: ");

        add(titel);
        add(T1);

        add(B1);
        s="";
        D="";
    }

    class EnterClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            A = Double.parseDouble(T1.getText());

            D=String.valueOf(A);
            E=String.valueOf(A);

            INT= (int)A;



            if (A>10){
                D ="Geen geldig nummer";

                repaint();
            }
            else {


                switch (INT) {
                    case 1:
                        D = E+" =Onvoldoende je bent gezakt";
                        break;
                    case 2:
                        D = E+" =Onvoldoende je bent gezakt";
                        break;
                    case 3:
                        D = E+" =Onvoldoende je bent gezakt";
                        break;
                    case 4:
                        D = E+" =Onvoldoende je bent gezakt";
                        break;
                    case 5:
                        D = E+" =Onvoldoende je bent gezakt";
                        break;
                    case 6:
                        D = E+" =Voldoende je bent geslaagd";
                        break;
                    case 7:
                        D = E+" =Voldoende je bent geslaagd";
                        break;
                    case 8:
                        D = E+" =Voldoende je bent geslaagd";
                        break;
                    case 9:
                        D = E+" =Voldoende je bent geslaagd";
                        break;
                    case 10:
                        D = E+" =Goed je bent geslaagd!";
                        break;
                    default:
                        D = E+" Wat is dat?!";
                        break;
                }


            }

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(""+D,50,50);
    }
}