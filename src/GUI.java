import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;

public class GUI extends JFrame implements ActionListener {
    JTextArea t;

    JFrame f;

    GUI() {
        f = new JFrame("Recursive Text Editor V0.0.1");

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch (Exception e) {
            // TODO: Restart Program if UI setup doesn't work?
        }

        t = new JTextArea();

        JMenuBar mb = new JMenuBar();

        JMenu m1 = new JMenu("File");

        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");
        JMenuItem mi9 = new JMenuItem("Print");

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi9.addActionListener(this);

        JMenu m2 = new JMenu("Edit");

        JMenuItem mi4 = new JMenuItem("Cut");
        JMenuItem mi5 = new JMenuItem("Copy");
        JMenuItem mi6 = new JMenuItem("Paste");

        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        m2.add(mi4);
        m2.add(mi5);
        m2.add(mi6);

        JMenuItem mc = new JMenuItem("Close");

        mc.addActionListener(this);

        mb.add(m1);
        mb.add(m2);
        mb.add(mc);

        f.setJMenuBar(mb);
        f.add(t);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.equals("Cut")) {
            t.cut();
        }
        else if (s.equals("Copy")) {
            t.copy();
        }
        else if (s.equals("Paste")) {
            t.paste();
        }
        else if (s.equals("Save")) {
            // TODO: Save functionality
        }
        else if (s.equals("Print")) {
            try {
                t.print();
            }
            catch (Exception evt) {
                JOptionPane.showMessageDialog(f, evt.getMessage(), "Print Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (s.equals("Open")) {
            // TODO: Open Functionality
        }
        else if (s.equals("New")) {
            t.setText("");
        }
        else if (s.equals("Close")) {
            f.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
