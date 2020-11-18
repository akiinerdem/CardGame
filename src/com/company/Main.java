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
        System.out.println("vvvvvvvvvvvvv-Bilgisayar sinif denemesi-vvvvvvvvvvvvv");
        System.out.println("Parametreli yapilandirmak:");
        Bilgisayar lenovo = new Bilgisayar(52, "Lenovo G50", 24, kartlar);
        System.out.println(lenovo.getOyuncuID() + ". " + lenovo.getOyuncuAdi() + " " + lenovo.getSkor() + " puan");
        System.out.println("Parametresiz yapilandirmak:");
        Bilgisayar dell = new Bilgisayar();
        System.out.println("^^^^^^^^^^^^^-Bilgisayar sinif denemesi-^^^^^^^^^^^^^");
    }
}
