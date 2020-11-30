package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu {
    private int tip;

    // Parametresiz yapilandirici
    Bilgisayar() {
        super();
        System.out.println("Parametresiz Bilgisayar sinif yapilandiricisi cagirildi");
    }

    // Parametreli yapilandirici
    Bilgisayar(int OyuncuID, String OyuncuAdi, int skor) {
        super(OyuncuID, OyuncuAdi, skor);
        System.out.println("Parametreli Bilgisayar sinif yapilandiricisi cagirildi");
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    @Override
    public Sporcu KartSec() {
        Random random = new Random();
        // kartlistesinden rastgele eleman secilir
        ArrayList<Sporcu> kartListesi = getKartListesi();
        int kartIndis = random.nextInt(kartListesi.size());
        Sporcu kart = kartListesi.get(kartIndis);
        // istenilen tipinden kart bulana kadar donuyor
        while (kart.getTip() != tip || kart.KartKullanildiMi()) {
            kartIndis = random.nextInt(kartListesi.size());
            kart = kartListesi.get(kartIndis);
        }
        kart.setKartKullanildi(true);
        return kart;
    }
}
