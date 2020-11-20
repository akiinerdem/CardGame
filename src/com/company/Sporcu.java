package com.company;

public abstract class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    private boolean kartKullanildiMi = false;


    Sporcu(String sporcuIsim, String sporcuTakim) {
        setsporcuIsim(sporcuIsim);
        setsporcuTakim(sporcuTakim);
    }

    Sporcu() {
    }

    public abstract int[] sporcuPuaniGoster();

    public boolean isKartKullanildiMi() {
        return kartKullanildiMi;
    }

    public void setKartKullanildiMi(boolean kartKullanildiMi) {
        this.kartKullanildiMi = kartKullanildiMi;
    }

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

}