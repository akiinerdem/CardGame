package com.company;

import java.util.Arrays;
import java.util.Random;

public class OyunSinifi {
    private Futbolcu[] futbolcular;
    private Basketbolcu[] basketbolcular;
    private final Bilgisayar bilgisayar = new Bilgisayar();
    private final Kullanici kullanici = new Kullanici();
    private final Random random = new Random();
    private int len;
    private int kalanKartlar;
    private Sporcu kart1;
    private Sporcu kart2;

    OyunSinifi() {
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

    public int[] kartlariKarsilastir(Sporcu kart1, Sporcu kart2) {
        // take 2 cards
        // return randomly selected position, and who won as strings
        // TODO: use the skor in the oyuncu objects instead of local attribute
        int[] ozellikler1 = kart1.sporcuPuaniGoster();
        int[] ozellikler2 = kart2.sporcuPuaniGoster();
        int tip = kart1.getTip();
        int pozisyon = random.nextInt(3);
        int sonuc;
        System.out.println(pozisyon + " ozellik kontrol ediliyor");
        // Futbolcu ise
        if (ozellikler1[pozisyon] > ozellikler2[pozisyon]) {
            sonuc = 0; // Bilgisayar kazandi. Bilgisayar 10 puan alir
        } else if (ozellikler1[pozisyon] < ozellikler2[pozisyon]) {
            sonuc = 1; // Kullanici kazandi. Kullanici 10 puan alir
        } else {
            sonuc = 2; // Esitlik. Hic kimse puan almaz
        }
        return new int[]{tip, pozisyon, sonuc};
    }

    private void sporculariTanimla() {
        Futbolcu LionelMessi = new Futbolcu("LionelMessi", "Barcelona", 96, 90, 95, "Photos/Messi.png");
        Futbolcu CristianoRonalo = new Futbolcu("CristianoRonalo", "Juventus", 97, 92, 94, "Photos/Ronaldo.png");
        Futbolcu TonyKross = new Futbolcu("TonyKross", "RealMadrid", 90, 87, 89, "Photos/Kroos.png");
        Futbolcu MohammedSalah = new Futbolcu("MohammedSalah", "Liverpool", 93, 89, 93, "Photos/Salah.png");
        Futbolcu RobertLewandowski = new Futbolcu("RobertLewandowski", "BayernMunih", 93, 86, 96, "Photos/Lewandowski.png");
        Futbolcu MarcoReus = new Futbolcu("MarcoReus", "BorussiaDortmund", 91, 90, 89, "Photos/Reus.png");
        Futbolcu NeymarJR = new Futbolcu("NeymarJR", "ParisSaintGermain", 95, 95, 94, "Photos/neymar.png");
        Futbolcu KarimBenzema = new Futbolcu("KarimBenzema", "RealMadrid", 89, 87, 93, "Photos/Benzema.png");
        Basketbolcu KobeBryant = new Basketbolcu("KobeBryant", "Lakers", 99, 99, 99, "Photos/kobe.png");
        Basketbolcu LebronJames = new Basketbolcu("LebronJames", "Lakers", 95, 93, 97, "Photos/lebron.png");
        Basketbolcu MichaelJordan = new Basketbolcu("MichaelJordan", "Bulls", 96, 96, 96, "Photos/Jordan.png");
        Basketbolcu StephCurry = new Basketbolcu("StephCurry", "GoldenState", 95, 97, 95, "Photos/Curry .png");
        Basketbolcu ShaquilleONeal = new Basketbolcu("ShaquilleONeal", "Lakers", 92, 93, 91, "Photos/O'neal.png");
        Basketbolcu RussellWestbrook = new Basketbolcu("RussellWestbrook", "Houston", 94, 95, 96, "Photos/westbrook.png");
        Basketbolcu ScottiePippen = new Basketbolcu("ScottiePippen", "Bulls", 93, 91, 90, "Photos/pippen.png");
        Basketbolcu JamesHarden = new Basketbolcu("JamesHarden", "Houston", 94, 91, 93, "Photos/harden.png");
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
        for (int i = 0; i < len / 2; i++) {
            bilgisayar.getKartListesi().add(futbolcular[i]);
            kullanici.getKartListesi().add(basketbolcular[i]);
        }
        for (int i = len / 2; i < len; i++) {
            kullanici.getKartListesi().add(futbolcular[i]);
            bilgisayar.getKartListesi().add(basketbolcular[i]);
        }
    }

    public int oyunuBaslat() {
        sporculariTanimla();
        kartlariDagit();
        return 0;
    }

    public Futbolcu[] getFutbolcular() {
        return futbolcular;
    }

    public void setFutbolcular(Futbolcu[] futbolcular) {
        this.futbolcular = futbolcular;
    }

    public Basketbolcu[] getBasketbolcular() {
        return basketbolcular;
    }

    public void setBasketbolcular(Basketbolcu[] basketbolcular) {
        this.basketbolcular = basketbolcular;
    }

    public Bilgisayar getBilgisayar() {
        return bilgisayar;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public Random getRandom() {
        return random;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getKalanKartlar() {
        return kalanKartlar;
    }

    public void setKalanKartlar(int kalanKartlar) {
        this.kalanKartlar = kalanKartlar;
    }

    public Sporcu getKart1() {
        return kart1;
    }

    public void setKart1(Sporcu kart1) {
        this.kart1 = kart1;
    }

    public Sporcu getKart2() {
        return kart2;
    }

    public void setKart2(Sporcu kart2) {
        this.kart2 = kart2;
    }

}
