// TODO: siniflari olustur
// TODO: Test sinifini olustur
// TODO: Oyun arayuzunu tasarla

package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        testSinifiTest();
    }

    private static void testSinifiTest() {
        TestSinifi testSinifi = new TestSinifi();
        int temp = testSinifi.oyunuBaslat();
        System.out.println(temp);
    }
}
