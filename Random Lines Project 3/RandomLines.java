// Jacob Auclair
// CS 152 Sec 71
// Project 3

import javax.swing.*;
import java.awt.*;
public class RandomLines
{
    public static void main(String[] args)
    {
        // creates the frame
        JFrame frame = new JFrame("Splat");
        // sets the close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // gets the contenet pannel and adds the radom lines
        frame.getContentPane().add(new RandomLinesPanel());
        // packs it all
        frame.pack();
        // sets size
        frame.setSize(500,500);
        // sets the background color
        frame.setBackground(Color.white);
        // makes it visible
        frame.setVisible(true);
    }
}