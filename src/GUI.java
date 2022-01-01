import javax.swing.*;

import java.awt.Insets;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.plaf.metal.*;

public class GUI extends JFrame implements ActionListener {
    JTextArea t;

    JFrame f;

    GUI() {
        // Create a frame
        f = new JFrame();
 
        try {
            // Set metal look and feel
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
 
            // Set theme to ocean
            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch (Exception e) {
            // TODO: Handle UI loading problems
        }
        
        t = new JTextArea();
        t.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane sp = new JScrollPane(t, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
 
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
 
        f.setJMenuBar(mb);
        f.getContentPane().add(sp);
        f.setSize(1000, 1000);
        f.setTitle("Recursion - A lightweight text editor | Untitled Document");

    	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				String ObjButtons[] = {"Yes", "No"};
            	int promptResult = JOptionPane.showOptionDialog(f, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
            	if (promptResult == JOptionPane.YES_OPTION) {
                	System.exit(0);
            	}
			}
		});
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
            JFileChooser j = new JFileChooser("f:");
            int r = j.showSaveDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                    FileWriter wr = new FileWriter(fi, false);

                    BufferedWriter w = new BufferedWriter(wr);

                    w.write(t.getText());

                    w.flush();
                    w.close();
                    f.setTitle("Recursion - A lightweight text editor | "+j.getSelectedFile());
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(f, evt.getMessage(), "Error Saving File", JOptionPane.ERROR_MESSAGE);
                }
            }
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
            JFileChooser j = new JFileChooser("f:");

            int r = j.showOpenDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                File fi = new File(j.getSelectedFile().getAbsolutePath());

                try {
                    String s1 = "", sl = "";
                    FileReader fr = new FileReader(fi);

                    BufferedReader br = new BufferedReader(fr);

                    sl = br.readLine();

                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }

                    t.setText(sl);
                    br.close();
                    f.setTitle("Recursion - A lightweight text editor | "+j.getSelectedFile());
                }
                catch (Exception evt) {
                    JOptionPane.showMessageDialog(f, evt.getMessage(), "Error Reading File", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if (s.equals("New")) {
            t.setText("");
            
            f.setTitle("Recursion - A lightweight text editor | Untitled Document");
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
