package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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
    private JButton button16;
    private JButton button15;
    private JButton button14;
    private JButton button13;
    private JButton button12;
    private JButton button11;
    private JButton button10;
    private JButton button9;
    private final JButton[] bButonlari = {button16, button15, button14, button13, button12, button11, button10, button9};
    private JButton button17; // Bilgisayar karti (kart1)
    private JButton button18; // Kullanici karti (kart2)

    private JLabel skor1; // Bilgisayar skoru
    private JLabel skor2; // Kullanici skoru
    private JLabel Pozisyon;
    private final OyunSinifi Oyun = new OyunSinifi();
    private Sporcu kart1;
    private Sporcu kart2;
    private final Bilgisayar bilgisayar = Oyun.getBilgisayar();
    private final Kullanici kullanici = Oyun.getKullanici();
    ImageIcon kart = new ImageIcon("Photos/kart.png");
    ImageIcon bosKart = new ImageIcon("Photos/boskart.png");
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
        kart = new ImageIcon(kart.getImage().getScaledInstance(125, 188, Image.SCALE_DEFAULT));
        bosKart = new ImageIcon(bosKart.getImage().getScaledInstance(125, 188, Image.SCALE_DEFAULT));

        // Kart fotograflari atama
        for (int i = 0; i < len; i++) {
            bButonlari[i].setBorderPainted(false);
            bButonlari[i].setContentAreaFilled(false);
            bButonlari[i].setIcon(kart);
            kButonlari[i].addActionListener(this::kartSec);

            kButonlari[i].setBorderPainted(false);
            kButonlari[i].setContentAreaFilled(false);
            kButonlari[i].setIcon(kKartlari.get(i).getIcon());
        }
        button17.setBorderPainted(false);
        button17.setContentAreaFilled(false);
        button17.setIcon(kart);

        button18.setBorderPainted(false);
        button18.setContentAreaFilled(false);
        button18.setIcon(kart);
    }

    private void kartSec(ActionEvent e) {
        JButton kKart = (JButton) e.getSource();
        int indis = Integer.parseInt(kKart.getName());
        // kart onceden secildiyse bir sey yapma
        if (kullanici.getKartListesi().get(indis).KartKullanildiMi())
            return;
        JButton bKart = bButonlari[7-indis];
        // kartlari sec
        kullanici.setKartIndis(indis);
        kart2 = kullanici.KartSec();
        bilgisayar.setTip(kart2.getTip());
        kart1 = bilgisayar.KartSec();
        button17.setIcon(kart1.getIcon());
        button18.setIcon(kart2.getIcon());
        // goruntuleri degistir
        kKart.setIcon(bosKart);
        kKart.removeActionListener(this::kartSec);
        bKart.setIcon(bosKart);
        bKart.removeActionListener(this::kartSec);

        // Kartlari karsilastir
        // TODO: do the karsilastirma and store it in a variable
        // TODO: change pozisyon label
        // TODO: activate a popup to announce the outcome
        // TODO: change the score labels
        // TODO: change the middle cards to ? cards


    }
}
