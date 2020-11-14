package com.company;

import java.util.ArrayList;

public class Oyuncu {
    int oyuncuID;
    String oyuncuAdi;
    int Skor;
    // TODO: sporcu tipinden ArrayList olarak belirle
    ArrayList<Integer> kartListesi;

    // Parametresiz yapici
    public Oyuncu() {
        System.out.println("oyuncu nesne olusturuldu");
    }

    // Parametreli yapici
    public void BilinenOyuncu(int ID, String adi, int skor, ArrayList<Integer> kartlar) {
        this.oyuncuID = ID;
        this.oyuncuAdi = adi;
        this.Skor = skor;
        this.kartListesi = kartlar;
        System.out.println(oyuncuID + " ID nolu" + oyuncuAdi + " adli oyuncu nesne olusturuldu");
    }

    public int SkorGoster() {
        return Skor;
    }

    // TODO: sporcu sinif olusturulunca,
    //  bu fonksiyon sporcu sinifindan obje dondursun, int degil
    public int KartSec() {
        return 0;
    }

}
