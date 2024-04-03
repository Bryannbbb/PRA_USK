package pra_usk;

import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class CRUD {
    private Double angka1, hasil;
    private String param1, param2;
    private PreparedStatement psmt;
    private Connection koneksi;
    private String query;

    //menyambungkan ke database
    public CRUD() {
        koneksi conn = new koneksi();
        koneksi = conn.getKoneksi();
    }

    //membuat setter dan getter
    public Double getAngka1() {
        return angka1;
    }

    public void setAngka1(Double angka1) {
        this.angka1 = angka1;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    //membuat fungsi insert data
    public void simpanData(Double angka1, String param1, String param2, Double hasil) {
        query = "insert into tbl_jarak (angka1, param1, param2, hasil) values (?, ?, ?, ?)";
        try {
            psmt = koneksi.prepareStatement(query);
            psmt.setDouble(1, angka1);
            psmt.setString(2, param1);
            psmt.setString(3, param2);
            psmt.setDouble(4, hasil);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    
}
}

