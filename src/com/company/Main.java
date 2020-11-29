// TODO: butonlarin fotograflarini degistir
//  kart secildiginde:
//      ortadaki kartlarin resimlerini degistir
//      random pozisyon sec ve ortadaki labeli degistir
//      karsilastir ve karsilastirma sonucu bir popup'ta yaz (blg veya kullanici kazandi)
//      karsilastirma sonucuna gore alt ve ustteki skor labellerini degistir
//      secilen kart, transparent resime donustur
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
