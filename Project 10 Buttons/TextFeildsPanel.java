// Jacob Auclair
// CS 152
// 5/4/17

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class TextFeildsPanel extends JPanel
{
    // int for the counter, the rest are interactables on the jframe
    private JButton solve;
    private JLabel result, labelA, labelB, labelC, Error;
    private JTextField textA, textB, textC;
    private JPanel buttonPanel;
    //-----------------------------------------------------------------
    // Constructor: Sets up the GUI.
    //-----------------------------------------------------------------
    public TextFeildsPanel()
    {
        solve = new JButton("Solve");
        result = new JLabel("Result");
        labelA = new JLabel("A");
        labelB = new JLabel("B");
        labelC = new JLabel("C");
        Error = new JLabel(" ");
        textA = new JTextField(5);
        textB = new JTextField(5);
        textC = new JTextField(5);

        ButtonListener listener = new ButtonListener();
        solve.addActionListener(listener);

        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(500, 150));
        buttonPanel.setBackground(Color.white);
        buttonPanel.add(solve);
        buttonPanel.add(labelA);
        buttonPanel.add(textA);
        buttonPanel.add(labelB);
        buttonPanel.add(textB);
        buttonPanel.add(labelC);
        buttonPanel.add(textC);
        buttonPanel.add(result);
        buttonPanel.add(Error);

        setSize(new Dimension(400, 100));
        setBackground(Color.cyan);
        add(buttonPanel);
    }
    //*****************************************************************
    // Represents a listener for the three buttons.
    //*****************************************************************
    private class ButtonListener implements ActionListener
    {
        //--------------------------------------------------------------
        // Determines which button was pressed and sets the label
        // text accordingly.
        //--------------------------------------------------------------
        private double a;
        private double b;
        private double c;
        private double x1 = 0;
        private double x2 = 0;

        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == solve){
                a = Integer.parseInt(textA.getText());
                b = Integer.parseInt(textB.getText());
                c = Integer.parseInt(textC.getText());

                if (a == 0 && b == 0){
                    result.setText(" ");
                    Error.setText("Error");
                }else if (a == 0){
                    result.setText("  -" + c + "/" + b);
                }else{
                    if ((Math.pow(b, 2) - 4*a*c) <= 0){
                        result.setText("No real solution");
                    }else{
                        x1 =(-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
                        x2 =(-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
                        result.setText("The x values are:" + x1 + " , " + x2);
                    }
                }
            }
        }
    }
}