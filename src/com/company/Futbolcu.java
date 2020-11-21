package com.company;

public class Futbolcu extends Sporcu {

    private int penalti;
    private int serbestVurus;
    private int kaleciKarsiKarsiya;

    Futbolcu() {
        super();
        System.out.println("futbolcu olusturuldu");
    }

    @Override
    public int[] sporcuPuaniGoster() {

        return new int[]{getPenalti(), getSerbestVurus(), getKaleciKarsiKarsiya()};
    }

    @Override
    public int getTip() {
        // class tipini belirlemek icin. Futbolcunun tipi 0'dir
        return 0;
    }

    Futbolcu(String sporcuIsim, String sporcuTakim, int penalti, int serbestVurus, int kaleciKarsiKarsiya) {
        super(sporcuIsim, sporcuTakim);
        setKaleciKarsiKarsiya(kaleciKarsiKarsiya);
        setPenalti(penalti);
        setSerbestVurus(serbestVurus);
        System.out.println("parametreli futbolcu olusturuldu");
    }


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
