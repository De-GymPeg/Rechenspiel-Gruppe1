import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class Darstellung
{
    /* Attribute deklarieren */
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JLabel zahl1Label;
    JLabel operationLabel;
    JLabel zahl2Label;
    JTextField ergebnisField;
    JButton button;
    JLabel feedbackLabel;
    int zahl1;
    int zahl2;
    String operation;
    
    Darstellung(Steuerung steuerung)
    {
        /* Fenster initialisieren */
        frame = new JFrame("Rechenspiel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1));

        /* die beiden Panel initialisieren */
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1.setLayout(new GridLayout(0, 1));
        panel2.setLayout(new GridLayout(0, 1));
        panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Antwort"));
       
        /* übrige Objekte initialisieren */
        zahl1Label =new JLabel("", SwingConstants.CENTER); 
        zahl2Label =new JLabel("", SwingConstants.CENTER); 
        operationLabel =new JLabel("", SwingConstants.CENTER); 
        ergebnisField = new JTextField();
        button = new JButton("Prüfen!!");
        feedbackLabel = new JLabel();
        /* Hierarchie herstellen */
        frame.add(panel1);
        frame.add(panel2);
        panel1.add(zahl1Label);
        panel1.add(operationLabel);
        panel1.add(zahl2Label);
        
        panel2.add(ergebnisField);
        panel2.add(button);
        panel2.add(feedbackLabel);

        frame.pack();
        frame.setVisible(true);
    }
}
