package viewPort;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class BlockstateList<AppLoader> {
    AppLoader appLoader;
    JTree jt;

    public BlockstateList(AppLoader appLoader){
        this.appLoader = appLoader;
    }
    public void SetUp(){
        jt = new JTree();
    }
    public static void Update(){
        DefaultMutableTreeNode test = new DefaultMutableTreeNode("test");
    }
}
