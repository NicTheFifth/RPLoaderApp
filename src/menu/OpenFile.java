package menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class OpenFile implements ActionListener {
    JFrame f;
    JMenu bar;
    JMenuItem open;

    public OpenFile(JFrame f, JMenu bar){
        this.f = f;
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
            int i=fc.showOpenDialog(f);
            if(i==JFileChooser.APPROVE_OPTION){
                File f = fc.getSelectedFile();

            }
        }
    }
}
