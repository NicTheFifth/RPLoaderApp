import menu.OpenFile;

import javax.swing.*;

public class MainApplet {
    public static void main(String[] args) {
        JFrame f = new JFrame("Resource pack editor");
        Initialise(f);
    }

    private static void Initialise(JFrame f) {
        MakeMenu(f);
        f.setSize(800, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void MakeMenu(JFrame f) {
        JMenu menu;
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("File");

        OpenFile of = new OpenFile(f, menu);
        of.setUp();

        mb.add(menu);
        f.setJMenuBar(mb);
    }
}
