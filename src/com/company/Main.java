package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        arayuzTest();
    }

    private static void arayuzTest() {
        JFrame frame = new JFrame("Game");
        frame.setContentPane(new Game().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
