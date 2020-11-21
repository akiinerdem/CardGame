package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TestSinifi {
    private Futbolcu[] futbolcular;
    private Basketbolcu[] basketbolcular;
    private ArrayList<Sporcu> kartlar1; // Bilgisayar kartlari
    private ArrayList<Sporcu> kartlar2; // Kullanici kartlari
    private Random random = new Random();

    TestSinifi(Futbolcu[] futbolcular, Basketbolcu[] basketbolcular){
        this.futbolcular = futbolcular;
        this.basketbolcular = basketbolcular;
        kartlariKaristir();
    }
    void kartlariKaristir(){
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
    void kartlariDagit(){


    }
    int oyunDongusu(){

        return 0;
    }
    Sporcu kartiSec(){
        return null;
    }
    void kartTipiniDegistir(){}
}
