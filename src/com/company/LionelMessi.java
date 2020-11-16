package com.company;

public class LionelMessi extends Sporcu {
    private int penalti;
    private int serbestAtis;
    private int  kaleciKarsiKarsiya;
    private boolean kartKullanildiMi = false;


    public LionelMessi(String sporcuIsim, String sporcuTakim, int penalti, int serbestAtis, int kaleciKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
}
