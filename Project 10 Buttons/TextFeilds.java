//********************************************************************
// LeftRight.java Authors: Lewis/Loftus
//
// Demonstrates the use of one listener for multiple buttons.
//********************************************************************
import javax.swing.JFrame;
public class TextFeilds
{
    //-----------------------------------------------------------------
    // Creates the main program frame.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Left Right");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TextFeildsPanel());
        frame.pack();
        frame.setVisible(true);
    }
}