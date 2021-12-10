import menu.OpenFile;

import javax.swing.*;

public class MainApplet {

    static JFrame f;

    public static void main(String[] args) {
        f = new JFrame("Resource pack editor");
        Initialise();
    }

    private static void Initialise() {
        MakeMenu();
        f.setSize(800, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void MakeMenu() {
        JMenu menu;
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("File");

        OpenFile of = new OpenFile(f, menu);
        of.setUp();

        mb.add(menu);
        f.setJMenuBar(mb);
    }
}
