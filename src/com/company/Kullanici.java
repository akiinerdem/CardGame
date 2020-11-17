package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Kullanici extends Oyuncu {
    // Parametresiz yapilandirici
    Kullanici() {
        System.out.println("Kullanici nesne olusturuldu");
    }

    // Parametreli yapilandirici
    Kullanici(int ID, String adi, int skor, ArrayList<Integer> kartlar) {
        super.oyuncuID = ID;
        super.oyuncuAdi = adi;
        super.Skor = skor;
        super.kartListesi = kartlar;
        System.out.println(oyuncuID + " ID nolu " + oyuncuAdi + " adli Kullanici nesne olusturuldu");
    }
    public int KartSec(){
        // TODO: arayuz bitince, arayuzle calisacak sekilde yaz
        System.out.println("oynamak istedigin kartin indisini yaz: ");
        Scanner scanner = new Scanner(System.in);
        int kart = scanner.nextInt();
        return kartListesi.get(kart);
    }
}
