// Jacob Auclair
// CS 151
// 30354920

import java.awt.*;
import javax.swing.*;

public class NestedPanels
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up first subpanel
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize(new Dimension(200, 150));
        subPanel1.setBackground(new Color(50,22,200));
        JLabel label1 = new JLabel("Kattywampus");
        label1.setForeground(new Color(205,233,55));
        subPanel1.add(label1);
        
        // Set up second subpanel
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize(new Dimension(200, 150));
        subPanel2.setBackground(new Color(100,44,150));
        JLabel label2 = new JLabel("Fuddy-Duddy");
        label2.setForeground(new Color(155,211,105));
        subPanel2.add(label2);
        
        // Set up third subpanel
        JPanel subPanel3 = new JPanel();
        subPanel3.setPreferredSize(new Dimension(200, 150));
        subPanel3.setBackground(new Color(150,66,100));
        JLabel label3 = new JLabel("Kerfuffle");
        label3.setForeground(new Color(105,189,155));
        subPanel3.add(label3);
        
        // Set up fourth subpanel
        JPanel subPanel4 = new JPanel();
        subPanel4.setPreferredSize(new Dimension(200, 150));
        subPanel4.setBackground(new Color(200,88,50));
        JLabel label4 = new JLabel("Collywobbles");
        label4.setForeground(new Color(55,167,205));
        subPanel4.add(label4);
        
        // Set up primary panel
        JPanel primary = new JPanel();
        primary.setBackground(Color.blue);
        primary.add(subPanel1);
        primary.add(subPanel2);
        primary.add(subPanel3);
        primary.add(subPanel4);

        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
    }
}