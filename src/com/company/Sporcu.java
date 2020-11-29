package com.company;

import javax.swing.*;

public abstract class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    private Icon icon;
    private boolean kartKullanildi = false;

    Sporcu(String sporcuIsim, String sporcuTakim, String icon) {
        setsporcuIsim(sporcuIsim);
        setsporcuTakim(sporcuTakim);
        setIcon(icon);
    }

    Sporcu() {
    }

    public abstract int[] sporcuPuaniGoster();


    public String getsporcuIsim() {
        return sporcuIsim;
    }

    public void setsporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getsporcuTakim() {
        return sporcuTakim;
    }

    public void setsporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public boolean KartKullanildiMi() {
        return kartKullanildi;
    }

    public void setKartKullanildi(boolean kartKullanildi) {
        this.kartKullanildi = kartKullanildi;
    }

    public abstract int getTip();

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = new ImageIcon(icon);
    }
}