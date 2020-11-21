package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Kullanici extends Oyuncu {
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
    public Sporcu KartSec(int tip) {
        // TODO: arayuz bitince, arayuzle calisacak sekilde yaz
        System.out.println("oynamak istedigin kartin indisini yazin: ");
        Scanner scanner = new Scanner(System.in);
        int kartIndis = scanner.nextInt();
        // TODO: kart girdisinin dogru araliginda olmasini kontrol et

        ArrayList<Sporcu> kartListesi = getKartListesi();
        Sporcu kart = kartListesi.get(kartIndis);
        while (kart.getTip() != tip) {
            System.out.println("Yanlis sporcu tipinden bir kart sectiniz. Lutfen baska bir kart secin: ");
            kartIndis = scanner.nextInt();
            kart = kartListesi.get(kartIndis);
        }
        return kart;
    }
}
