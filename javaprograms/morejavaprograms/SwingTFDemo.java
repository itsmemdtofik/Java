import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingTFDemo implements ActionListener {
    JTextField jtf;
    JButton jbtnRev;
    JLabel jlPrompt, jlContents;

    SwingTFDemo() {

        JFrame jfrm = new JFrame("Use a Text Field");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");

        JButton jbtnRev = new JButton("Reverse"); /** @ Create the reverse button */
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        jlPrompt = new JLabel("Enter the Text");
        jlContents = new JLabel("");

        jfrm.add(jlPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlContents);

        jfrm.setVisible(true); /** @ Display the Frame */
    }

    /** @ Handle the Event Here */

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Reverse")) {
            String orgStr = jtf.getText();
            String resStr = "";
            /** @ Reverse the String in the text field */
            for (int i = orgStr.length() - 1; i >= 0; i--)
                resStr += orgStr.charAt(i);
            /** @ Store the reversed string in the text feild */
            jtf.setText(resStr);
        } else
            jlContents.setText("You Pressed Enter.Text is =" + jtf.getText());
    }

    public static void main(String srgs[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingTFDemo();
            }
        });
    }

}
