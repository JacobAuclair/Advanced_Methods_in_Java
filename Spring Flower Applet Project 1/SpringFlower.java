// Author: Jacob Auclair
// ID: 30354920
// This is a spring time flower applet. 500 X 500

import javax.swing.JApplet;
import java.awt.*;

public class SpringFlower extends JApplet
{
   public void paint(Graphics page)
    {
        // This sets the color to cyan and makes the backround
        page.setColor(Color.cyan);
        page.fillRect(0, 0, 500, 500);
        // Sets color to yellow and creates a small springtime sun in the corner
        page.setColor(Color.yellow);
        page.fillOval(-40, -40, 80, 80);
        // Sets the color to green for everything that is green, this makes the stem
        page.setColor(Color.green);
        page.fillRect(240, 200, 20, 300);
        // Creates the ground
        page.fillRect(0, 400, 500, 100);
        // Makes the first leaf on the lower left of the stem
        page.fillArc(160,300,100,100,20,140);
        page.fillArc(160,275,100,100,192,150);
        // Makes the second leaf on the upper right of the stem
        page.fillArc(240,225,100,100,20,140);
        page.fillArc(240,200,100,100,200,150);
        // Sets color yellow and creates the center of the flower
        page.setColor(Color.yellow);
        page.fillOval(210,150,80,80);
        // Creates the outer ring of red petals. These are created first so the inner petals 
        // may over lap them. The numbers are clockwise starting with the upper most top petal
        page.setColor(Color.red);
        page.fillOval(210,130,35,35); //1
        page.fillOval(250,130,35,35); //2
        page.fillOval(273,188,35,35); //3
        page.fillOval(273,148,35,35); //4
        page.fillOval(250,210,35,35); //5
        page.fillOval(210,210,35,35); //6
        page.fillOval(190,188,35,35); //7
        page.fillOval(190,148,35,35); //8
        // Creates the inner ring of pink petals. Again, the numbers correspond in a clockwise
        // fashion starting with the uppermost top petal
        page.setColor(Color.pink);
        page.fillOval(230,130,35,35); //1
        page.fillOval(254,142,35,35); //2
        page.fillOval(273,168,35,35); //3
        page.fillOval(254,193,35,35); //4
        page.fillOval(230,210,35,35); //5
        page.fillOval(204,193,35,35); //6
        page.fillOval(190,168,35,35); //7
        page.fillOval(204,142,35,35); //8
    }
}
