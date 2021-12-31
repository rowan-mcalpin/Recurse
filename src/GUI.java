import javax.swing.*;
import java.awt.event.*;
import javax.swing.plaf.metal.*;

public class GUI extends JFrame implements ActionListener {
    JTextArea t;

    JFrame f;

    GUI() {
        // Create a frame
        f = new JFrame("editor");
 
        try {
            // Set metal look and feel
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
 
            // Set theme to ocean
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch (Exception e) {
            // TODO: Handle UI loading problems
        }
 
        // Text component
        t = new JTextArea();
 
        // Create a menubar
        JMenuBar mb = new JMenuBar();
 
        // Create amenu for menu
        JMenu m1 = new JMenu("File");
 
        // Create menu items
        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");
        JMenuItem mi4 = new JMenuItem("Print");
 
        // Add action listener
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
 
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
 
        // Create amenu for menu
        JMenu m2 = new JMenu("Edit");
 
        // Create menu items
        JMenuItem mi5 = new JMenuItem("Cut");
        JMenuItem mi6 = new JMenuItem("Copy");
        JMenuItem mi7 = new JMenuItem("Paste");
 
        // Add action listener
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        mi7.addActionListener(this);
 
        m2.add(mi5);
        m2.add(mi6);
        m2.add(mi7);
 
        JMenuItem mc = new JMenuItem("Close");
 
        mc.addActionListener(this);
 
        mb.add(m1);
        mb.add(m2);
        mb.add(mc);
 
        setJMenuBar(mb);
        add(t);
        setSize(500, 500);
        
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				String ObjButtons[] = {"Yes", "No"};
            	int promptResult = JOptionPane.showOptionDialog(f, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
            	if (promptResult == JOptionPane.YES_OPTION) {
                	System.exit(0);
            	}
			}
		});
		setVisible(true);
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
            String ObjButtons[] = {"Yes", "No"};
            int promptResult = JOptionPane.showOptionDialog(f, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
            if (promptResult == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
