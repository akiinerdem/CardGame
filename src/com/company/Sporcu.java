package com.company;

public abstract class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    private boolean kartKullanildi = false;


    Sporcu(String sporcuIsim, String sporcuTakim) {
        setsporcuIsim(sporcuIsim);
        setsporcuTakim(sporcuTakim);
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
}