import lombok.Getter;
import menu.OpenFile;
import viewPort.BlockstateList;

import javax.swing.*;

public class AppLoader {

    @Getter
    JFrame f;
    @Getter
    OpenFile<AppLoader> of;
    @Getter
    BlockstateList<AppLoader> bsL;

    public AppLoader(){
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
        bsL = new BlockstateList<>(this);
        of = new OpenFile<>(menu, this);
        of.setUp();

        mb.add(menu);
        f.setJMenuBar(mb);
    }
}
