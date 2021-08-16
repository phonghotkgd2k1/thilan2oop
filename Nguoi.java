package com.webchat.webchat.phong;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String quocTich;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String quocTich) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.quocTich = quocTich;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }
}
