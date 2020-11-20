// TODO: siniflari olustur
// TODO: Test sinifini olustur
// TODO: Oyun arayuzunu tasarla

package com.company;

import java.util.ArrayList;

public class Main {

    public static void test() {

    }

    public static void main(String[] args) {
        // OyuncuTest();
        Futbolcu LionelMessi = new Futbolcu("LionelMessi", "Barcelona", 96, 90, 95);
        Futbolcu CristianoRonalo = new Futbolcu("CristianoRonalo", "Juventus", 97, 92, 94);
        Futbolcu TonyKross = new Futbolcu("TonyKross", "RealMadrid", 90, 87, 89);
        Futbolcu MohammedSalah = new Futbolcu("MohammedSalah", "Liverpool", 93, 89, 93);
        Futbolcu RobertLewandowski = new Futbolcu("RobertLewandowski", "BayernMunih", 93, 86, 96);
        Futbolcu MarcoReus = new Futbolcu("MarcoReus", "BorussiaDortmund", 91, 90, 89);
        Futbolcu NeymarJR = new Futbolcu("NeymarJR", "ParisSaintGermain", 95, 95, 94);
        Futbolcu KarimBenzema = new Futbolcu("KarimBenzema", "RealMadrid", 89, 87, 93);
        Basketbolcu KobeBryant = new Basketbolcu("KobeBryant", "Lakers", 99, 99, 99);
        Basketbolcu LebronJames = new Basketbolcu("LebronJames", "Lakers", 97, 93, 95);
        Basketbolcu MichaelJordan = new Basketbolcu("MichaelJordan", "Bulls", 96, 96, 96);
        Basketbolcu StephCurry = new Basketbolcu("StephCurry", "GoldenState", 95, 97, 95);
        Basketbolcu ShaquilleONeal = new Basketbolcu("ShaquilleONeal", "Lakers", 92, 93, 91);
        Basketbolcu ShaneLarkin = new Basketbolcu("ShaneLarkin", "AnadoluEfes", 94, 95, 96);
        Basketbolcu ScottiePippen = new Basketbolcu("ScottiePippen", "Bulls", 93, 91, 90);
        Basketbolcu JamesHarden = new Basketbolcu("JamesHarden", "Houston", 94, 91, 93);
        Futbolcu[] Futbolcular = {LionelMessi, CristianoRonalo, TonyKross, MohammedSalah, RobertLewandowski, MarcoReus, NeymarJR, KarimBenzema};
        for (int i = 0; i < Futbolcular.length; i++) {
            Futbolcular[i].sporcuPuaniGoster();
            System.out.println("isim:" + Futbolcular[i].getsporcuIsim() + "  Takim:" + Futbolcular[i].getsporcuTakim() + "  Penaltı:" + Futbolcular[i].getPenalti() + "  Serbest vurus:" + Futbolcular[i].getSerbestVurus() + "  Kaleci ile karsi karsiya:" + Futbolcular[i].getKaleciKarsiKarsiya());
        }
        Basketbolcu[] Basketbolcular = {KobeBryant,MichaelJordan,StephCurry,ShaquilleONeal,ShaneLarkin,ScottiePippen,JamesHarden};
        for (int i = 0; i < Basketbolcular.length; i++) {
            Basketbolcular[i].sporcuPuaniGoster();
            System.out.println("isim:" + Basketbolcular[i].getsporcuIsim() + "  Takim:" + Basketbolcular[i].getsporcuTakim() + "  Serbest Atış:" + Basketbolcular[i].getSerbestAtis() + "  Ikilik:" + Basketbolcular[i].getIkilik() + "  Ucluk:" + Basketbolcular[i].getUcluk());
        }

    }

  /*  private static void OyuncuTest() {
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
    }*/
}
