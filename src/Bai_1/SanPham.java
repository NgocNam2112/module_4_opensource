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
public class SanPham {
    private int MaSP;
    private String TenSP;
    private String NhaSanXuat;
    private String TenLoaiSP;

    public SanPham(int maSP, String tenSP, String nhaSanXuat, String tenLoaiSP) {
        MaSP = maSP;
        TenSP = tenSP;
        NhaSanXuat = nhaSanXuat;
        TenLoaiSP = tenLoaiSP;
    }

    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    public void setTenLoaiSP(String tenLoaiSP) {
        TenLoaiSP = tenLoaiSP;
    }

    private int MaLoaiSP;

    public SanPham() {
    }

    public SanPham(String tenSP, String nhaSanXuat, int maLoaiSP) {
        TenSP = tenSP;
        NhaSanXuat = nhaSanXuat;
        MaLoaiSP = maLoaiSP;
    }

    public SanPham(int maSP, String tenSP, String nhaSanXuat, int maLoaiSP) {
        MaSP = maSP;
        TenSP = tenSP;
        NhaSanXuat = nhaSanXuat;
        MaLoaiSP = maLoaiSP;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int maSP) {
        MaSP = maSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String tenSP) {
        TenSP = tenSP;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        NhaSanXuat = nhaSanXuat;
    }

    public int getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(int maLoaiSP) {
        MaLoaiSP = maLoaiSP;
    }

    public void display(){
        System.out.printf("%-15s%-30s%-30s%-30s\n",getMaSP(),getTenSP(),getNhaSanXuat(),getTenLoaiSP());
    }
    @Override
    public String toString() {
        return "SanPham{" +
                "MaSP=" + MaSP +
                ", TenSP='" + TenSP + '\'' +
                ", NhaSanXuat='" + NhaSanXuat + '\'' +
                ", TenLoaiSP=" + TenLoaiSP +
                '}';
    }
}
