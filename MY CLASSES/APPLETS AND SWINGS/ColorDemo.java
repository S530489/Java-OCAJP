

import java.applet.Applet;
import java.awt.*;
import java.applet.*;

public class ColorDemo extends Applet {

    
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
public void paint(Graphics g)
{
    setBackground(Color.blue);
    setForeground(Color.red);
    g.drawString("Its a colourful applet",50,30);
    Color newcolor = new Color(255,255,0);
    g.setColor(newcolor);
    g.drawString("Its a colorful applet", 50, 70);
    }
}
