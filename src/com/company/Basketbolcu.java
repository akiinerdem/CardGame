package com.company;

public class Basketbolcu extends Sporcu {

    private String basketbolcuTakim;
    private String basketbolcuIsim;
    private int serbestAtis;
    private int ucluk;
    private int ikilik;



    public Basketbolcu(){

    }

    public Basketbolcu(int serbestAtis,int ucluk, int ikilik,String basketbolcuIsim, String basketbolcuTakim) {
        this.serbestAtis = serbestAtis;
        this.ucluk=ucluk;
        this.ikilik=ikilik;
        this.basketbolcuIsim=basketbolcuIsim;
        this.basketbolcuTakim=basketbolcuTakim;
    }

    public Basketbolcu(String sporcuTakim,String sporcuIsim) {
     super(sporcuTakim,sporcuIsim);
    }

    Basketbolcu KobeBryant = new Basketbolcu();
    Basketbolcu LebronJames = new Basketbolcu();
    Basketbolcu MichaelJordan = new Basketbolcu();
    Basketbolcu StephCurry = new Basketbolcu();
    Basketbolcu ShaquilleONeal = new Basketbolcu();
    Basketbolcu AnthonyDavis = new Basketbolcu();
    Basketbolcu KevinDurant = new Basketbolcu();
    Basketbolcu JamesHarden = new Basketbolcu();





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
