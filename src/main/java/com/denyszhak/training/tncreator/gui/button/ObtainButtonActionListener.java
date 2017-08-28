package com.denyszhak.training.tncreator.gui.button;

import com.denyszhak.training.tncreator.func.ConversionThread;
import com.denyszhak.training.tncreator.func.Converter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class ObtainButtonActionListener extends ListActionListener {

    private JTextField widthF, heightF, newFormat;
    private Converter converter;

    public ObtainButtonActionListener(){
    }

    public void setWidthF(JTextField widthF) {
        this.widthF = widthF;
    }

    public void setHeightF(JTextField heightF) {
        this.heightF = heightF;
    }

    public void setNewFormat(JTextField newFormat) {
        this.newFormat = newFormat;
    }

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    // Creates new thumbnails to the folder with original image
    public void actionPerformed(ActionEvent e) {
        int w = Integer.parseInt(widthF.getText());
        int h = Integer.parseInt(heightF.getText());
        String fileType = newFormat.getText();
        File[] listOfFiles = new File[list.size()];
        listOfFiles = list.toArray(listOfFiles);
        converter.setFiles(listOfFiles);
        converter.setType(fileType);
        converter.setWidth(w);
        converter.setHeight(h);
        Thread thread = new Thread(new ConversionThread(converter));
        thread.start();
    }
}
