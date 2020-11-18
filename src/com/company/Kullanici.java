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
    Kullanici(int OyuncuID, String OyuncuAdi, int skor, ArrayList<Integer> kartListesi) {
        super(OyuncuID, OyuncuAdi, skor, kartListesi);
        System.out.println("Parametreli Kullanici sinif yapilandiricisi cagirildi");
    }
    @Override
    public int KartSec(){
        // TODO: arayuz bitince, arayuzle calisacak sekilde yaz
        System.out.println("oynamak istedigin kartin indisini yaz: ");
        Scanner scanner = new Scanner(System.in);
        int kart = scanner.nextInt();
        ArrayList<Integer> kartListesi = getKartListesi();
        return kartListesi.get(kart);
    }
}
