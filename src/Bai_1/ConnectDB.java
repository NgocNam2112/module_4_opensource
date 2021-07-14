/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author ADMIN
 */
public class ConnectDB {
    private static Connection con = null;
    private final String user = "sa";
    private final String password = "123456";
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=SP";

    public void connectDataBase() {
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connect success");
        } catch (SQLException throwables) {
            System.out.println("connect error: " + throwables.getMessage());
        }
    }
    public void insertLoaiSP(String tenLoaiSP){
        String query = "insert into LoaiSanPham values(?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,tenLoaiSP);
            boolean flag = preparedStatement.execute();

        } catch (SQLException throwables) {
            System.out.println("error: " + throwables.getMessage());
        }

    }
    public List<SanPham> SanPhams() {
        List<SanPham> list = new ArrayList<>();
        String query = "select * from SanPham";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int MaSP = rs.getInt("MaSP");
                String TenSanPham = rs.getString("TenSP");
                String NhaSanXuat = rs.getString("NhaSanXuat");
                int MaLoaiSP = rs.getInt("MaLoaiSP");
                list.add(new SanPham(MaSP, TenSanPham, NhaSanXuat, getName(MaLoaiSP)));
            }
        } catch (SQLException throwables) {
            System.out.println("error: " + throwables.getMessage());
        }
        return list;
    }

    public List<LoaiSanPham> LoaiSanPhams() {
        List<LoaiSanPham> list = new ArrayList<>();
        String query = "select * from LoaiSanPham";
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int MaLoaiSP = rs.getInt("MaLoaiSP");
                String TenLoaiSP = rs.getString("TenLoaiSP");
                list.add(new LoaiSanPham(MaLoaiSP, TenLoaiSP));
            }
            statement.close();
        } catch (SQLException throwables) {
            System.out.println("error: " + throwables.getMessage());
        }
        return list;
    }
    public String getName(int id){
        String result = null;
        String query = "select * from LoaiSanPham where MaLoaiSP = "+id;
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                result = rs.getString("TenLoaiSP");
                break;
            }
            statement.close();
        } catch (SQLException throwables) {
            System.out.println("error: " + throwables.getMessage());
        }
        return result;
    }
    public String getCatagorynameById(int id) {
        AtomicReference<String> result = new AtomicReference<>();
        LoaiSanPhams().forEach(e -> {
            if (e.getMaLoaiSP() == id) {
                result.set(e.getTenLoaiSP());
            }
        });
        return result.get();
    }
}
