package com.denyszhak.training.tncreator.gui;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    private int x;
    private int y;
    private int width;
    private int height;

    public Label(){
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

    public void init(){
        this.setBounds(x, y, width, height);
        this.setForeground(Color.lightGray);
    }
}
