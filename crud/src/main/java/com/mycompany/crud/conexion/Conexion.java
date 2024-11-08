/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ángeles
 */
public class Conexion {
    String hostname = "database.cdkkuwwmwutr.us-east-1.rds.amazonaws.com";
    
    String jdbcUrl = "jdbc:mysql://" +hostname+ ":3306/crud?useSSL=false";
    String username = "admin";
    String password = "admin12345";

    Connection con;
    public Conexion() {
        try {
            
            con = DriverManager.getConnection(jdbcUrl,username,password);
            
        } catch (Exception e) {
            System.out.println("error en la clase conexion" + e);
        }
    }
    
    public Connection getConexion(){
    return con; 
    }
    
    
    
}
