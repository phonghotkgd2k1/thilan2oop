package com.webchat.webchat.phong;

public class VanDongVien extends Nguoi{
    private String monThiDau;
    private double chieuCao;
    private double canNang;


    public VanDongVien(String monThiDau, double chieuCao, double canNang) {
        this.monThiDau = monThiDau;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }

    public VanDongVien(String hoTen, int tuoi, String quocTich, String monThiDau, double chieuCao, double canNang) {
        super(hoTen, tuoi, quocTich);
        this.monThiDau = monThiDau;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }

    public String getMonThiDau() {
        return monThiDau;
    }

    public void setMonThiDau(String monThiDau) {
        this.monThiDau = monThiDau;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

   public String thongTinChiTiet(){
       String ttct = "Họ tên: "+this.getHoTen()+", "+"Tuổi: "+this.getTuoi()+", "+"Môn thi đấu: "+this.getMonThiDau()+", "+"Chiều cao: "+this.getChieuCao()+", "+ "Cân nặng: "+ this.getCanNang()+", "+ "Quốc tịch: "+this.getQuocTich();
        return ttct;
    }
}
