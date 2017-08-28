package com.denyszhak.training.tncreator;

import javax.swing.*;

public class ToDo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                Launcher launcher = new Launcher();
                launcher.launch();
            }
        });
    }
}
