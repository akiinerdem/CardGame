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
//        OyuncuTest();
//        test();
//        test2();
        testSinifiTest();
    }

    private static void OyuncuTest() {
        ArrayList<Sporcu> kartlar = new ArrayList<>();
        Basketbolcu KevinDurant = new Basketbolcu();
        Futbolcu Neymar = new Futbolcu();
        kartlar.add(KevinDurant);
        kartlar.add(Neymar);
        System.out.println("vvvvvvvvvvvvv-Bilgisayar sinif denemesi-vvvvvvvvvvvvv");
        System.out.println("Parametreli yapilandirmak:");
        Bilgisayar lenovo = new Bilgisayar(52, "Lenovo G50", 24);
        System.out.println(lenovo.getOyuncuID() + ". " + lenovo.getOyuncuAdi() + " " + lenovo.getSkor() + " puan");
        System.out.println("Parametresiz yapilandirmak:");
        Bilgisayar dell = new Bilgisayar();
        System.out.println("^^^^^^^^^^^^^-Bilgisayar sinif denemesi-^^^^^^^^^^^^^");
    }
    private static void testSinifiTest(){
        TestSinifi testSinifi = new TestSinifi();
        int temp = testSinifi.oyunuBaslat();
        System.out.println(temp);
    }
}
