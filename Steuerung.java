import java.awt.Color;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

public class Steuerung implements Observer, ActionListener
{
    Logik logik;
    Darstellung darstellung;
     
    Steuerung()
    {
        logik = new Logik();
        darstellung = new Darstellung(this);
        logik.addObserver(this);
        logik.initialisiere();
    }
    
    public void update(Observable observable, Object arg)
    {
        if (observable == logik) {
            darstellung.zahl1Label.setText("" + logik.zahl1);
            darstellung.zahl2Label.setText("" + logik.zahl2);
            darstellung.operationLabel.setText(logik.operation);
        }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        logik.initialisiere();
    }
}