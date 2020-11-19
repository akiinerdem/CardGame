// TODO: siniflari olustur
// TODO: Test sinifini olustur
// TODO: Oyun arayuzunu tasarla

package com.company;

import java.util.ArrayList;

public class Main {

    public static void test() {
        Futbolcu LionelMessi = new Futbolcu();
        Futbolcu CristianoRonalo = new Futbolcu();
        Futbolcu TonyKross = new Futbolcu();
        Futbolcu MohammedSalah = new Futbolcu();
        Futbolcu RobertLewandowski = new Futbolcu();
        Futbolcu MarcoReus = new Futbolcu();
        Futbolcu Neymar = new Futbolcu();
        Futbolcu KarimBenzema = new Futbolcu();
    }

    public static void test2() {
        Basketbolcu KobeBryant = new Basketbolcu();
        Basketbolcu LebronJames = new Basketbolcu();
        Basketbolcu MichaelJordan = new Basketbolcu();
        Basketbolcu StephCurry = new Basketbolcu();
        Basketbolcu ShaquilleONeal = new Basketbolcu();
        Basketbolcu AnthonyDavis = new Basketbolcu();
        Basketbolcu KevinDurant = new Basketbolcu();
        Basketbolcu JamesHarden = new Basketbolcu();
    }

    public static void main(String[] args) {
        OyuncuTest();
        test();
        test2();
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
