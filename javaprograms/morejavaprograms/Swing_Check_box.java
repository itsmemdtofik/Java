import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing_Check_box implements ItemListener {
    JLabel jlSelected;
    JLabel jlChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGama;

    Swing_Check_box() {

        JFrame jfrm = new JFrame("Java Aplication");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /** @ Craete empty Label */

        jlSelected = new JLabel("");
        jlChanged = new JLabel("");

        /** @ Make Check Boxex */

        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGama = new JCheckBox("Gama");

        /** @Add to the listener */
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGama.addItemListener(this);

        /** Add to the label and Checkboxex to content pane or JFrame */

        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGama);
        jfrm.add(jlSelected);
        jfrm.add(jlChanged);

        /** @Display the JFrame */
        jfrm.setVisible(true);
    }

    /** Add the handler for the checkboxex */

    public void itemStateChanged(ItemEvent ie) {
        String str = "";

        /** @Obtain the reference to the checkboxex */

        JCheckBox cb = (JCheckBox) ie.getItem();

        if (cb.isSelected())
            jlChanged.setText(cb.getText() + "Was just selected");
        else
            jlChanged.setText(cb.getText() + "was just cleared");

        /** @Report to the selected Box */

        if (jcbAlpha.isSelected()) {
            str = str + "Alpha";
        }
        if (jcbBeta.isSelected()) {
            str += "Beta";

        }
        if (jcbGama.isSelected()) {
            str += "Gamma";
        }
        jlSelected.setText("Selected CheckBoxex" + str);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swing_Check_box();
            }
        });
    }

}
