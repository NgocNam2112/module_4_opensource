/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class RunMain {
    public static void main(String[] args) {
        ConnectDB db = new ConnectDB();
        db.connectDataBase();
        List<SanPham> listSP =  db.SanPhams();
        title();
        listSP.forEach(e -> e.display());
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--------------------------------");
        System.out.print("Nhập tên loại sản phẩm cần thêm: ");
        String tenLoaiSP = sc.nextLine();
        db.insertLoaiSP(tenLoaiSP);
        List<LoaiSanPham> listLSP = db.LoaiSanPhams();
        System.out.printf("%-15s%-30s\n","Mã loại SP","Tên Loại SP");
        listLSP.forEach(e-> e.display());
    }
     public static void title(){
        System.out.printf("%-15s%-30s%-30s%-30s\n","Mã sản phẩm","Tên sản phẩm","Nhà sản xuất","Loại sản phẩm");
    }
}
