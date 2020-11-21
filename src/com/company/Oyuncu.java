package com.company;

import java.util.ArrayList;

// Sade oyuncu class olusturulamamasi icin abstract class olarak tanimlandi.
// Abstract olunca sadece inherit edilebilir. Sadece futbolcu ve basketbolcu
// nesneler olacagi icin boyle tanimlandi.
public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuAdi;
    private int skor;
    private ArrayList<Sporcu> kartListesi = new ArrayList<>();

    // Parametresiz yapilandirici
    Oyuncu() {
        System.out.println("Oyuncu sinif yapilandiricisi cagirildi");
    }

    // Parametreli yapilandirici
    Oyuncu(int OyuncuID, String OyuncuAdi, int skor) {
        setOyuncuID(OyuncuID);
        setOyuncuAdi(OyuncuAdi);
        setSkor(skor);
        System.out.println(oyuncuID + " ID nolu " + oyuncuAdi + " adli Oyuncu nesne yapilandirildi");
    }

    // TODO: sporcu sinif olusturulunca,
    //  bu fonksiyon sporcu sinifindan obje dondursun, int degil
    public abstract Sporcu KartSec();

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public ArrayList<Sporcu> getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(ArrayList<Sporcu> kartListesi) {
        this.kartListesi = kartListesi;
    }
}
