package com.company;

public class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;


    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
    }

    public Sporcu() {
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