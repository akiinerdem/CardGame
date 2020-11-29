package com.company;

import javax.swing.Icon;

public class Basketbolcu extends Sporcu {

    private int serbestAtis;
    private int ucluk;
    private int ikilik;


    Basketbolcu() {
        super();
        System.out.println("Basketbolccu olusturuldu");
    }

    Basketbolcu(String sporcuIsim, String sporcuTakim, int serbestAtis, int ucluk, int ikilik, String icon) {
        super(sporcuIsim, sporcuTakim, icon);
        setSerbestAtis(serbestAtis);
        setIkilik(ikilik);
        setUcluk(ucluk);
        System.out.println("Parametreli bir basketbolcu olusturuldu");
    }

    @Override
    public int[] sporcuPuaniGoster() {
        return new int[]{getSerbestAtis(), getIkilik(), getUcluk()};
    }

    @Override
    public int getTip() {
        // class tipini belirlemek icin. basketbolcunun tipi 1'dir
        return 1;
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
