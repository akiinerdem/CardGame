package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu {

    // Parametresiz yapilandirici
    Bilgisayar() {
        System.out.println("Bilgisayar nesne olusturuldu");
    }

    // Parametreli yapilandirici
    Bilgisayar(int ID, String adi, int skor, ArrayList<Integer> kartlar) {
        super.oyuncuID = ID;
        super.oyuncuAdi = adi;
        super.Skor = skor;
        super.kartListesi = kartlar;
        System.out.println(oyuncuID + " ID nolu " + oyuncuAdi + " adli Bilgisayar nesne olusturuldu");
    }
    public int KartSec(){
        Random random = new Random();
        // kartlistesinden rastgele eleman secilir
        return kartListesi.get(random.nextInt(kartListesi.size()));
    }
}
