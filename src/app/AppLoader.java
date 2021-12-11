package app;

import app.menu.OpenFile;
import app.viewPort.BlockstateList;

import javax.swing.*;

public class AppLoader {

    AppLoader me;

    JFrame f;

    OpenFile of;

    BlockstateList bsL;

    public AppLoader(){
        me = this;
        f = new JFrame("Resource pack editor");
        Initialise();
    }
    private void Initialise() {
        MakeMenu();
        f.setSize(800, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void MakeMenu() {
        JMenu menu;
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("File");
        bsL = new BlockstateList(me);
        of = new OpenFile(menu, me);
        of.setUp();

        mb.add(menu);
        f.setJMenuBar(mb);
    }

    public JFrame getF() {
        return this.f;
    }

    public OpenFile getOf() {
        return this.of;
    }

    public BlockstateList getBsL() {
        return this.bsL;
    }
}
