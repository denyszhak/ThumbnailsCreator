package com.denyszhak.training.tncreator.gui.button;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;

public class AddButtonActionListener extends ListActionListener {

    private JTextField filesList;

    public AddButtonActionListener(){
    }

    public void setFilesList(JTextField filesList) {
        this.filesList = filesList;
    }

    // Adds files to the list and updates the text field
    public void actionPerformed(ActionEvent e) {
        if (list == null){
            list = new ArrayList<File>();
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        int ret = fileChooser.showDialog(null, "Add image(s)");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            for (int i = 0; i < files.length; i++){
                list.add(files[i]);
                filesList.setText(filesList.getText().concat(files[i].getName() + ", "));
            }
        }
    }
}
