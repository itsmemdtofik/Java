import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing_JList implements ListSelectionListener {
    JList<String> jlist;
    JLabel jl;
    JScrollPane jScrollPane;

    /** @Create an Array of names */

    String names[] = { "Tofik", "Khan Alam", "Sufiyan", "Danish Eqbal", "Panday", "Rithesh", "Kumar Shanu", "HafizArif",
            "Allen", "Manjula"

    };

    Swing_JList() {

        JFrame jfrm = new JFrame("Java Application");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /** @Create a Jlist */
        jlist = new JList<String>(names);

        /** Set the list selection moode to the single selection */
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        /** Add list to the scroll pane */
        jScrollPane = new JScrollPane(jlist);

        /** Set the prefrred size to scrol pane */
        jScrollPane.setPreferredSize(new Dimension(120, 90));

        /** Make label that dispaly the selection */
        jl = new JLabel("Please choose a name !");
        jlist.addListSelectionListener(this);

        /** Add the list and label to content pane */
        jfrm.add(jScrollPane);
        jfrm.add(jl);

        /** @Display the Frame */
        jfrm.setVisible(true);

    }

    /** Handel list Selection Event */
    public void valueChanged(ListSelectionEvent le) {

        int idx = jlist.getSelectedIndex();

        /** Display the selection */
        if (idx != -1)
            jl.setText("Current Selection   =   " + names[idx]);
        else
            jl.setText("Please choose a name !");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Swing_JList();
            }
        });
    }

}
