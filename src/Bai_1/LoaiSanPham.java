/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

/**
 *
 * @author ADMIN
 */
public class LoaiSanPham {
     private int MaLoaiSP;
    private String TenLoaiSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int maLoaiSP, String tenLoaiSP) {
        MaLoaiSP = maLoaiSP;
        TenLoaiSP = tenLoaiSP;
    }

    public int getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(int maLoaiSP) {
        MaLoaiSP = maLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        TenLoaiSP = tenLoaiSP;
    }
    public void display(){
        System.out.printf("%-15s%-30s\n",getMaLoaiSP(),getTenLoaiSP());
    }
    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "MaLoaiSP=" + MaLoaiSP +
                ", TenLoaiSP='" + TenLoaiSP + '\'' +
                '}';
    }
}
