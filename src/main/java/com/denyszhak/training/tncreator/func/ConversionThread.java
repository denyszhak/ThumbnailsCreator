package com.denyszhak.training.tncreator.func;

import javax.swing.*;

public class ConversionThread implements Runnable{

    private Converter converter;

    public ConversionThread(){
    }

    public ConversionThread(Converter converter) {
        this.converter = converter;
    }

    public void run() {
        JOptionPane.showMessageDialog(null, converter.convertTo());

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            return;
        }
    }
}
