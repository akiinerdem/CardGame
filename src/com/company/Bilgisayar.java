package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Bilgisayar extends Oyuncu {

    // Parametresiz yapilandirici
    Bilgisayar() {
        super();
        System.out.println("Bilgisayar nesne olusturuldu");
    }

    // Parametreli yapilandirici
    Bilgisayar(int OyuncuID, String OyuncuAdi, int skor, ArrayList<Integer> kartListesi) {
        super(OyuncuID, OyuncuAdi, skor, kartListesi);
        System.out.println("Bilgisayar nesne olusturuldu");
    }
    @Override
    public int KartSec(){
        Random random = new Random();
        // kartlistesinden rastgele eleman secilir
        ArrayList<Integer> kartListesi = getKartListesi();
        return kartListesi.get(random.nextInt(kartListesi.size()));
    }
}
