import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingDemo1 implements ActionListener {
    JLabel jl;

    SwingDemo1() {

        JFrame jFrame = new JFrame("A button Exampple"); // Create a new JFrame Container
        jFrame.setLayout(new FlowLayout()); // Specify the Layout for button
        jFrame.setSize(300, 400); // specify the width and height
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate the perogram

        JButton jbtnUp = new JButton("Up"); // create two button
        JButton JbtnDown = new JButton("Down");
        

        jbtnUp.addActionListener(this); // Add action listener
        JbtnDown.addActionListener(this); // Add the action listener
        

        jFrame.add(jbtnUp); // add the button on content pane
        jFrame.add(JbtnDown);

        jl = new JLabel("Press a Button"); // Create a Label to the Frame
        jFrame.add(jl);
        jFrame.setVisible(true); // Display the Frame
    }

    /* Handle the event */

    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Up"))
            jl.setText("You Pressed Up");
        else
            jl.setText("You pressed Down");

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo1();
            }
        });
    }

}
