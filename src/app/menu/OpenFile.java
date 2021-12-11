package app.menu;

import app.AppLoader;
import app.viewPort.BlockstateList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class OpenFile implements ActionListener {
    AppLoader appLoader;
    JMenu bar;
    JMenuItem open;

    public OpenFile(JMenu bar, AppLoader appLoader){
        this.appLoader = appLoader;
        this.bar = bar;
    }

    public void setUp(){
        open = new JMenuItem("Open File");
        open.addActionListener(this);
        bar.add(open);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==open){
            JFileChooser fc = new JFileChooser();
            int i=fc.showOpenDialog(appLoader.getF());
            if(i==JFileChooser.APPROVE_OPTION){
                File f = fc.getSelectedFile();
                String[] subFiles = f.list();
                if(subFiles != null){
                    BlockstateList.Update();
                }
            }
        }
    }
}
