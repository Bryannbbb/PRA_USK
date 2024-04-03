/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra_usk;

import java.sql.*;

/**
 *
 * @author asus
 */
public class koneksi {
    private Connection connect; //untuk koneksi ke database
    private String username = "root"; //username localhost
    private String password = ""; //password localhost
    private String jdbc = "jdbc:mysql://localhost:3306/koversi_jarak"; //link untuk memnyambungkan ke database
    public Connection getKoneksi(){
        if(connect == null){
            try{
                connect = DriverManager.getConnection(jdbc, username, password); //koneksi ke database menggunakan driver manager
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }
        return connect;
    }    
    public static void main(String[] args) {
        koneksi k = new koneksi();
        Connection c = k.getKoneksi();
    }
    
}
