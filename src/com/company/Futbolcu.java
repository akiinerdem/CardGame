package com.company;

public class Futbolcu extends Sporcu {
    private String futbolcuAdi;
    private String futbolcuTakim;
    private int penalti;
    private int serbestVurus;
    private int kaleciKarsiKarsiya;

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


 




}
