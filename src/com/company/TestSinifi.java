package com.company;

import java.util.Arrays;
import java.util.Random;

public class TestSinifi {
    private Futbolcu[] futbolcular;
    private Basketbolcu[] basketbolcular;
    private final Bilgisayar bilgisayar = new Bilgisayar();
    private final Kullanici kullanici = new Kullanici();
    private final Random random = new Random();
    private int len;
    private int kalanKartlar;

    TestSinifi() {
    }

    private void kartlariKaristir() {
        // Richard Durstenfeld dizi karistirma algoritmasi
        int j;
        Basketbolcu tempBasketbolcu;
        for (int i = basketbolcular.length - 1; i > 0; i--) {
            j = random.nextInt(i);
            tempBasketbolcu = basketbolcular[i];
            basketbolcular[i] = basketbolcular[j];
            basketbolcular[j] = tempBasketbolcu;
        }
        Futbolcu tempFutbolcu;
        for (int i = futbolcular.length - 1; i > 0; i--) {
            j = random.nextInt(i);
            tempFutbolcu = futbolcular[i];
            futbolcular[i] = futbolcular[j];
            futbolcular[j] = tempFutbolcu;
        }
    }
    private void kartlariKarsilastir(Sporcu kart1,Sporcu kart2,int tip){
        int[] ozellikler1=kart1.sporcuPuaniGoster();
        int[] ozellikler2= kart2.sporcuPuaniGoster();
        int prandom = random.nextInt(3);
        System.out.println(prandom+" ozellik kontrol ediliyor");
        if(tip==0){
          
            if(ozellikler1[prandom]>ozellikler2[prandom]){
                System.out.println("Kart1 kazandi");
                
            }
           else if(ozellikler1[prandom]<ozellikler2[prandom]){
                System.out.println("Kart2 kazandi");
            }
            else{
                System.out.println("Esitlik");
            }
            
        }
    else if(tip==1){
            
           
            if(ozellikler1[prandom]>ozellikler2[prandom]){
                System.out.println("Kart1 kazandi");

            }
            else if(ozellikler1[prandom]<ozellikler2[prandom]){
                System.out.println("Kart2 kazandi");
            }
            else{
                System.out.println("Esitlik");
            }
        
        }



    }
    private void sporculariTanimla() {
        Futbolcu LionelMessi = new Futbolcu("LionelMessi", "Barcelona", 96, 90, 95);
        Futbolcu CristianoRonalo = new Futbolcu("CristianoRonalo", "Juventus", 97, 92, 94);
        Futbolcu TonyKross = new Futbolcu("TonyKross", "RealMadrid", 90, 87, 89);
        Futbolcu MohammedSalah = new Futbolcu("MohammedSalah", "Liverpool", 93, 89, 93);
        Futbolcu RobertLewandowski = new Futbolcu("RobertLewandowski", "BayernMunih", 93, 86, 96);
        Futbolcu MarcoReus = new Futbolcu("MarcoReus", "BorussiaDortmund", 91, 90, 89);
        Futbolcu NeymarJR = new Futbolcu("NeymarJR", "ParisSaintGermain", 95, 95, 94);
        Futbolcu KarimBenzema = new Futbolcu("KarimBenzema", "RealMadrid", 89, 87, 93);
        Basketbolcu KobeBryant = new Basketbolcu("KobeBryant", "Lakers", 99, 99, 99);
        Basketbolcu LebronJames = new Basketbolcu("LebronJames", "Lakers", 95, 93, 97);
        Basketbolcu MichaelJordan = new Basketbolcu("MichaelJordan", "Bulls", 96, 96, 96);
        Basketbolcu StephCurry = new Basketbolcu("StephCurry", "GoldenState", 95, 97, 95);
        Basketbolcu ShaquilleONeal = new Basketbolcu("ShaquilleONeal", "Lakers", 92, 93, 91);
        Basketbolcu RussellWestbrook= new Basketbolcu("RussellWestbrook", "Houston", 94, 95, 96);
        Basketbolcu ScottiePippen = new Basketbolcu("ScottiePippen", "Bulls", 93, 91, 90);
        Basketbolcu JamesHarden = new Basketbolcu("JamesHarden", "Houston", 94, 91, 93);
        futbolcular = new Futbolcu[]{LionelMessi, CristianoRonalo, TonyKross, MohammedSalah, RobertLewandowski, MarcoReus, NeymarJR, KarimBenzema};
        basketbolcular = new Basketbolcu[]{KobeBryant, LebronJames, MichaelJordan, StephCurry, ShaquilleONeal, RussellWestbrook, ScottiePippen, JamesHarden};
        kartlariKontrolEt();
    }

    private void kartlariKontrolEt() {
        // Kart sayisi kontrolu
        if (basketbolcular.length == futbolcular.length) {
            len = basketbolcular.length;
            kalanKartlar = len;
        } else {
            System.out.println("kart sayisi ayni degil. Lutfen oyunu tekrardan baslatin.");
            System.exit(1);
        }
    }

    private void kartlariDagit() {
        kartlariKaristir();
        for (int i = 0; i < len; i += 2) {
            bilgisayar.getKartListesi().add(futbolcular[i]);
            bilgisayar.getKartListesi().add(basketbolcular[i]);
            kullanici.getKartListesi().add(futbolcular[i + 1]);
            kullanici.getKartListesi().add(basketbolcular[i + 1]);
        }
    }

    public int oyunuBaslat() {
        sporculariTanimla();
        kartlariDagit();
        oyunDongusu();
        return 0;
    }

    private void oyunDongusu() {
        Sporcu kart1;
        Sporcu kart2;
        int tip = 0; // 0 ise futbolcu, 1 ise basketbolcu
        while (kalanKartlar != 0) {
            kart1 = bilgisayar.KartSec(tip);
            kart2 = kullanici.KartSec(tip);
            System.out.println(kart1.getsporcuIsim() + ": " + kart1.getsporcuTakim() + " :" + Arrays.toString(kart1.sporcuPuaniGoster()));
            System.out.println(kart2.getsporcuIsim() + ": " + kart2.getsporcuTakim() + " :" + Arrays.toString(kart2.sporcuPuaniGoster()));
            kartlariKarsilastir(kart1,kart2,tip);
            kart1.setKartKullanildi(true);
            kart2.setKartKullanildi(true);
            kalanKartlar--;
            // kart tipini degistiriyor
            tip = tip == 0 ? 1 : 0;
        }
    }
}
