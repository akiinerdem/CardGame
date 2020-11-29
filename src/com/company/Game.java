package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Game extends JFrame {
    public JPanel panelMain;

    // KULLANICI FUTBOLCULARI
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // KULLANICI BASKETBOLCULARI
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private final JButton[] kButonlari = {button1, button2, button3, button4, button5, button6, button7, button8};

    // BILGISAYAR KARTLARI
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private final JButton[] bButonlari = {button9, button10, button11, button12, button13, button14, button15, button16};
    private JButton button17; // Bilgisayar karti (kart1)
    private JButton button18; // Kullanici karti (kart2)

    private JLabel skor1; // Bilgisayar skoru
    private JLabel skor2; // Kullanici skoru
    private JLabel Pozisyon;
    private final OyunSinifi Oyun = new OyunSinifi();
    // TODO: create setup method
    //  Create action for button press to begin game

    Game() {
        setup();
    }

    private void setup() {
        int temp = Oyun.oyunuBaslat();
        if (temp == 1)
            System.exit(1);
        ArrayList<Sporcu> bKartlari = Oyun.getBilgisayar().getKartListesi();
        ArrayList<Sporcu> kKartlari = Oyun.getKullanici().getKartListesi();
        int len = bKartlari.size();
        panelMain.setBackground(Color.lightGray);
        // TODO: daha uygun bir kart fotografi sec
        ImageIcon card = new ImageIcon("Photos/kart.png");
        card = new ImageIcon(card.getImage().getScaledInstance(125, 188, Image.SCALE_DEFAULT));
        for (int i = 0; i < len; i++) {
            bButonlari[i].setBorderPainted(false);
            kButonlari[i].setBorderPainted(false);
            kButonlari[i].setContentAreaFilled(false);
            bButonlari[i].setContentAreaFilled(false);
            bButonlari[i].setIcon(card);
            kButonlari[i].setIcon(kKartlari.get(i).getIcon());
        }
    }
}
