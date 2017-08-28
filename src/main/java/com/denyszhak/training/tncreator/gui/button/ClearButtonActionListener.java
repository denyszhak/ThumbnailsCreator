package com.denyszhak.training.tncreator.gui.button;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearButtonActionListener extends ListActionListener {

    private JTextField filesList;

    public ClearButtonActionListener(){
    }

    public void setFilesList(JTextField filesList) {
        this.filesList = filesList;
    }

    // Clears the text field from the file list
    public void actionPerformed(ActionEvent e) {
        list.clear();
        filesList.setText("");
    }
}
