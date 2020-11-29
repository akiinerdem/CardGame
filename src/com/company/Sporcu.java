package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

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
        Image image = null;
        try {
            image = ImageIO.read(new File(icon)).getScaledInstance(128, 180, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert image != null;
        this.icon = new ImageIcon(image);
    }
}