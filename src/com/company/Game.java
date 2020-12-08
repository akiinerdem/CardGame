package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class Game extends JFrame {
    private JPanel panelMain;

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
    private JButton button17; // Kullanici karti (kart2)
    private JButton button18; // Bilgisayar karti (kart1)

    private JLabel skor1; // Bilgisayar skoru
    private JLabel skor2; // Kullanici skoru
    private JLabel Pozisyon;
    private JLabel Kullanici;
    private JLabel Bilgisayar;
    private JLabel Sonuc;
    private final OyunSinifi Oyun = new OyunSinifi();
    private final Bilgisayar bilgisayar = Oyun.getBilgisayar();
    private JButton bKart;
    private JButton kKart;
    private int bSkor = bilgisayar.getSkor();
    private final Kullanici kullanici = Oyun.getKullanici();
    private int kSkor = kullanici.getSkor();
    private ImageIcon kart = new ImageIcon("Photos/kart.png");
    private ImageIcon bosKart = new ImageIcon("Photos/boskart.png");
    private Icon tempIcon;
    private int tip = -1;
    private final int[] kalan = new int[] {bButonlari.length / 2, bButonlari.length / 2};
    private int[] karsilastirma;
    private boolean bekle = false;


    Game() {
    }

    public void setup() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Kart Oyunu");
        setContentPane(panelMain);
        int temp = Oyun.oyunuBaslat();
        if (temp == 1)
            System.exit(1);
        ArrayList<Sporcu> bKartlari = Oyun.getBilgisayar().getKartListesi();
        ArrayList<Sporcu> kKartlari = Oyun.getKullanici().getKartListesi();
        int len = bKartlari.size();
        Color bg = new Color(137, 207, 240);
        panelMain.setBackground(bg);
        kart = new ImageIcon(kart.getImage().getScaledInstance(125, 188, Image.SCALE_DEFAULT));
        bosKart = new ImageIcon(bosKart.getImage().getScaledInstance(125, 188, Image.SCALE_DEFAULT));

        // Kart fotograflari atama
        for (int i = 0; i < len; i++) {
            bButonlari[i].setBorderPainted(false);
            bButonlari[i].setContentAreaFilled(false);
            bButonlari[i].setIcon(kart);
            kButonlari[i].addActionListener(this::sec);

            kButonlari[i].setBorderPainted(false);
            kButonlari[i].setContentAreaFilled(false);
            kButonlari[i].setIcon(kKartlari.get(i).getIcon());
        }
        skor1.setText("Skor: 0");
        skor2.setText("Skor: 0");
        Pozisyon.setText("Lutfen bir kart secin");
        button17.setBorderPainted(false);
        button17.setContentAreaFilled(false);
        button17.setIcon(kart);

        button18.setBorderPainted(false);
        button18.setContentAreaFilled(false);
        button18.setIcon(kart);
        pack();
        setVisible(true);
    }

    private void reset() {
        // Her turun sonunda calisacak bir fonksiyon
        String[] tipler = new String[]{"Futbolcu", "Basketbolcu"};
        // gecen el esitlik ile bitmediyse tipi degistir
        // ve oynanmis kart tipinin kalan sayisini indir
        if (karsilastirma[1] != 2) {
            kalan[tip]--;
        }
        else { // oynanmis olan kartlarin fotolari geri ver
            kKart.setIcon(tempIcon);
            bKart.setIcon(kart);
        }
        tip = tip == 0 ? 1 : 0;
        // oynanmasi gereken kart tipinden kart kalmadiysa tipi tekrar degistir
        if (kalan[tip] == 0) {
            tip = tip == 0 ? 1 : 0;
        }

        // kalan kart yoksa oyunu sonlandir ve pencereyi kapat
        if (kalan[0] == 0 && kalan[1] == 0) {
            sonlandir();
        }


        // goruntuleri ve yazilari sifirla
        Pozisyon.setText("Lutfen bir " + tipler[tip] + " karti secin");
        Sonuc.setText(null);
        button17.setIcon(kart);
        button18.setIcon(kart);
        // bekleme suresini bitirir
        bekle = false;
    }

    private void sonlandir() {
        String sonDurum;
        String mesaj = "\nGAME OVER\n-Akın ve Ali";
        if (bSkor > kSkor)
            sonDurum = "Bilgisayar " + bSkor + " puan ile kazandi";
        else if (kSkor > bSkor)
            sonDurum = "Kullanici " + kSkor + " puan ile kazandi";
        else
            sonDurum = "Bilgisayar: " + bSkor + "\nKullanici: " + kSkor + "\nEsitlik";
        JOptionPane.showMessageDialog(this, sonDurum + mesaj);
        System.exit(0);
    }

    private void sec(ActionEvent e) {
        // fonksiyon cagirilmamasi gerekirse (bekleme suresinde ise) bir sey yapma ve fonksiyondan cik
        if (bekle)
            return;
        kKart = (JButton) e.getSource();
        tempIcon = kKart.getIcon();
        int indis = Integer.parseInt(kKart.getName());
        // kart onceden secildiyse bir sey yapma ve fonksiyondan cik
        if (kullanici.getKartListesi().get(indis).KartKullanildiMi())
            return;
        // secilen kartin tipi istenilen degilse
        // bir sey yapma ve fonksiyondan cik
        if (kullanici.getKartListesi().get(indis).getTip() != tip && tip != -1)
            return;

        bKart = bButonlari[7 - indis];
        // kartlari sec
        kullanici.setKartIndis(indis);
        Sporcu kart2 = kullanici.KartSec();
        tip = kart2.getTip();
        bilgisayar.setTip(tip);
        Sporcu kart1 = bilgisayar.KartSec();
        button17.setIcon(kart2.getIcon());
        button18.setIcon(kart1.getIcon());
        // goruntuleri degistir
        kKart.setIcon(bosKart);
//        kKart.removeActionListener(this::sec);
        bKart.setIcon(bosKart);
//        bKart.removeActionListener(this::sec);

        // Kartlari karsilastir
        String[][] pozisyonlar = new String[2][3];
        String[] sonuclar = new String[3];
        pozisyonlar[0][0] = "Penalti pozisyon secildi";
        pozisyonlar[0][1] = "Serbest vurus pozisyon secildi";
        pozisyonlar[0][2] = "Kaleci karsi karsiya pozisyon secildi";

        pozisyonlar[1][0] = "Serbest atis pozisyon secildi";
        pozisyonlar[1][1] = "Ikilik pozisyon secildi";
        pozisyonlar[1][2] = "Ucluk pozisyon secildi";

        sonuclar[0] = "Bilgisayar kazandi. Bilgisayar 10 puan alir";
        sonuclar[1] = "Kullanici kazandi. Kullanici 10 puan alir";
        sonuclar[2] = "Esitlik. Kartlar geri verilir";
        karsilastirma = Oyun.kartlariKarsilastir(kart1, kart2);
        String pozisyon = pozisyonlar[tip][karsilastirma[0]];
        String sonuc = sonuclar[karsilastirma[1]];

        // Karsilastirma sonuclarini ekrana yaz
        Pozisyon.setText(pozisyon);
        Sonuc.setText(sonuc);
        // sonuca gore puanlari dagit
        if (karsilastirma[1] == 0)
            bSkor += 10;
        else if (karsilastirma[1] == 1)
            kSkor += 10;
        skor1.setText("Skor: " + bSkor);
        skor2.setText("Skor: " + kSkor);
        // 4 saniye bekle
        Timer t = new Timer(4000, (e1 -> reset()));
        t.setRepeats(false);
        // fonksiyonun beklerken calismamasi icin bekle deger true'ya donusturulur
        bekle = true;
        t.start();
    }
}
