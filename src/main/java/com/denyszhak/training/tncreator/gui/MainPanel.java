package com.denyszhak.training.tncreator.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Iterator;

public class MainPanel extends JPanel{

    private List panelComponents;

    public MainPanel(){
    }

    public void setPanelComponents(List panelComponents) {
        this.panelComponents = panelComponents;
    }

    public void init(){
        setBackground(Color.darkGray);
        setLayout(null);

        for (Iterator iter = panelComponents.iterator(); iter.hasNext();) {
            Component component = (Component) iter.next();
            add(component);
        }
    }
}
