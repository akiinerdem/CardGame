// TODO: siniflari olustur
//  Akin:   Sporcu, Futbolcu ve Basketbolcu siniflarini yaz
// TODO: Test sinifini olustur
// TODO: Oyun arayuzunu tasarla

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        OyuncuTest();
    }

    private static void OyuncuTest() {
        ArrayList<Integer> kartlar = new ArrayList<>();
        kartlar.add(2);
        kartlar.add(5);
        System.out.println("deneme 1 2 3");
        Bilgisayar lenovo = new Bilgisayar();
        lenovo.BilinenBilgisayar(52, "Lenovo G50", 24, kartlar);
        System.out.println(lenovo.oyuncuID + ". " + lenovo.oyuncuAdi + " " + lenovo.Skor + " puan");
        System.out.println();
    }
}
