package com.company;

public class Basketbolcu extends Sporcu {


    private int serbestAtis;
    private int ucluk;
    private int ikilik;


    Basketbolcu() {
        super();
        System.out.println("Basketbolccu olusturuldu");
    }

    Basketbolcu(String sporcuTakim, String sporcuIsim, int serbestAtis, int ucluk, int ikilik) {
        super(sporcuTakim, sporcuIsim);
        setSerbestAtis(serbestAtis);
        setIkilik(ikilik);
        setUcluk(ucluk);
        System.out.println("Parametreli bir basketbolcu olusturuldu");
    }


    @Override
    public int[] sporcuPuaniGoster() {
        return new int[]{getSerbestAtis(), getIkilik(), getUcluk()};
    }


    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }


}
