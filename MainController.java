package com.webchat.webchat.phong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<VanDongVien> vanDongVienList = new ArrayList<>();
        for(int i = 0;i<5;i++){
            System.out.println("Nhập vận động viên thứ " + (i+1));
            System.out.print("Nhập họ tên: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int tuoi = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập quốc tịch: ");
            String quocTich = sc.nextLine();
            System.out.print("Nhập môn thi đấu: ");
            String monThiDau = sc.nextLine();
            System.out.print("Nhập chiều cao: ");
            double chieuCao = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập cân nặng: ");
            double canNang = Double.parseDouble(sc.nextLine());
            VanDongVien vanDongVien = new VanDongVien(hoTen, tuoi, quocTich, monThiDau, chieuCao, canNang);
            vanDongVienList.add(vanDongVien);
        }

//        vanDongVienList.forEach((vanDongVien) -> {
//            System.out.println(vanDongVien.thongTinChiTiet());
//        });

        vanDongVienList.sort((v1, v2) -> {
            return v1.getChieuCao() < v2.getChieuCao() ? 1 : -1;
        });

        vanDongVienList.forEach((vanDongVien) -> {
            System.out.println(vanDongVien.thongTinChiTiet());
        });
        System.out.println("");
        System.out.println("Vận động viên có chiều cao tốt nhất: ");
        System.out.println(vanDongVienList.get(0).thongTinChiTiet());
    }
}
