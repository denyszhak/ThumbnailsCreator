package com.denyszhak.training.tncreator.gui.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionListenerButton extends JButton {

    private ActionListener actionListener;

    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public ActionListenerButton(){
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void init() {
        this.setBounds(x, y, width, height);
        this.addActionListener(actionListener);
    }
}
