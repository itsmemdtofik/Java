import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jm = new JFrame("Desktop Apllication");
        jm.setSize(500, 500);
        jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Hello to Swing Application\n");
        jl.setIconTextGap(23);
        jm.add(jl);
        jm.setVisible(true);
    
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}