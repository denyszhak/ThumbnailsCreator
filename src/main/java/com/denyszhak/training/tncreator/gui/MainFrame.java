package com.denyszhak.training.tncreator.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{

    private MainPanel panel;

    public MainFrame(){
    }

    public void setPanel(MainPanel panel) {
        this.panel = panel;
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(550, 225));

        setResizable(false);
        setVisible(true);
        setState(Frame.NORMAL);
    }
}
