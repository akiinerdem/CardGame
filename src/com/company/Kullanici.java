package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Kullanici extends Oyuncu {
    int kartIndis;
    // Parametresiz yapilandirici
    Kullanici() {
        super();
        System.out.println("Parametresiz Kullanici sinif yapilandiricisi cagirildi");
    }

    // Parametreli yapilandirici
    Kullanici(int OyuncuID, String OyuncuAdi, int skor) {
        super(OyuncuID, OyuncuAdi, skor);
        System.out.println("Parametreli Kullanici sinif yapilandiricisi cagirildi");
    }

    @Override
    public Sporcu KartSec() {
        // TODO: arayuz bitince, arayuzle calisacak sekilde yaz
        ArrayList<Sporcu> kartListesi = getKartListesi();
        return kartListesi.get(kartIndis);
    }

    public int getKartIndis() {
        return kartIndis;
    }

    public void setKartIndis(int kartIndis) {
        this.kartIndis = kartIndis;
    }
}
