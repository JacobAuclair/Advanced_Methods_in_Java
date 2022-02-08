// Jacob Auclair
// CS 152 Sec 71
// Project 3

import javax.swing.*;
import java.awt.*;
import java.util.*;
public class RandomLinesPanel extends JPanel
{
    // Final integers that are set and do not change throughout the program
    final int SIZE = 500;
    private final int MINCOLOR = 0;
    private final int NLINES = 200;
    // public paint component with graphics page used by the Random lines class. 
    public void paintComponent(Graphics page)
    {
        // Makes the page
        super.paintComponent(page);
        // integers and different random generators
        int i = 200;
        Random rand = new Random();
        int x0,y0,x1,y1,a,b,c,Mod;
        // recurring while statement that will make the boundaries in which the lines can be drawn smaller
        // and smaller the more the lines that are drawn. Uses rand for all of the random points and also
        // to makes colors for the lines within certain peramaetyers.. then draws the line and decrements
        while (i > 0){
            Mod = 190;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 25){
            Mod = 175;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 50){
            Mod = 150;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 75){
            Mod = 125;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 100){
            Mod = 100;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 125){
            Mod = 75;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 150){
            Mod = 50;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
        while (i > 175){
            Mod = 25;
            x0 = rand.nextInt(SIZE - Mod);
            y0 = rand.nextInt(SIZE - Mod);
            x1 = rand.nextInt(SIZE - Mod);
            y1 = rand.nextInt(SIZE - Mod);
            a = rand.nextInt(255 - MINCOLOR);
            b = rand.nextInt(255 - MINCOLOR);
            c = rand.nextInt(255 - MINCOLOR);
            page.setColor(new Color(a,b,c));
            page.drawLine(x0,y0,x1,y1);
            i--;
        }
    }
}
