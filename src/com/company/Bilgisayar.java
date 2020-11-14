package com.company;

import java.util.ArrayList;

public class Bilgisayar extends Oyuncu {

    // Parametresiz yapici
    public Bilgisayar() {
        super();
        System.out.println("Bilgisayar nesne olusturuldu");
    }

    // Parametreli yapici
    public void BilinenBilgisayar(int ID, String adi, int skor, ArrayList<Integer> kartlar) {
        super.oyuncuID = ID;
        super.oyuncuAdi = adi;
        super.Skor = skor;
        super.kartListesi = kartlar;
        System.out.println(oyuncuID + " ID nolu " + oyuncuAdi + " adli Bilgisayar");
    }
}
