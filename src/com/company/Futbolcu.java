package com.company;

public class Futbolcu extends Sporcu {
    private String futbolcuAdi;
    private String futbolcuTakim;
    private int penalti;
    private int serbestVurus;
    private int kaleciKarsiKarsiya;

    public Futbolcu(){

    }

    public Futbolcu(String futbolcuAdi,String futbolcuTakim,int penalti,int serbestVurus,int kaleciKarsiKarsiya) {
        this.futbolcuAdi = futbolcuAdi;
        this.futbolcuTakim= futbolcuTakim;
        this.kaleciKarsiKarsiya=kaleciKarsiKarsiya;
        this.penalti=penalti;
        this.serbestVurus=serbestVurus;
    }
    public Futbolcu(String sporcuIsim, String sporcuTakim) {
        super(sporcuIsim, sporcuTakim);
    }


    Futbolcu LionelMessi= new Futbolcu();
    Futbolcu CristianoRonalo = new Futbolcu();
    Futbolcu TonyKross= new Futbolcu();
    Futbolcu MohammedSalah= new Futbolcu();
    Futbolcu RobertLewandowski= new Futbolcu();
    Futbolcu MarcoReus= new Futbolcu();
    Futbolcu Neymar= new Futbolcu();
    Futbolcu KarimBenzema= new Futbolcu();






    public int getSerbestVurus() {
        return serbestVurus;
    }

    public void setSerbestVurus(int serbestVurus) {
        this.serbestVurus = serbestVurus;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }
}
