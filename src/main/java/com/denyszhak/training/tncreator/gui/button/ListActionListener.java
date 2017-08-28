package com.denyszhak.training.tncreator.gui.button;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;


public abstract class ListActionListener extends JButton implements ActionListener {

    protected ArrayList<File> list;

    public void setList(ArrayList list) {
        this.list = (ArrayList<File>) list;
    }
}
