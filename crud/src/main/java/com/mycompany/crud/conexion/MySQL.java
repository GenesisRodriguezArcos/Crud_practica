/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crud.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ángeles
 */
public class MySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hostname = "database.cdkkuwwmwutr.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" +hostname+ ":3306/crud?useSSL=false";
    String username = "admin";
    String password = "admin12345";
    
    Connection con = null;
        try {
          con = DriverManager.getConnection(jdbcUrl,username,password);  
          if(con !=null){
              System.out.println("conexion exitosa");
          }
        } catch (Exception e) {
            System.out.println("error"+ e);
        }
    }
    
}
