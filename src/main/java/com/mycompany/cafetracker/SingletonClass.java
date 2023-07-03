/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafetracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP Nav
 */
public class SingletonClass {
    Connection connection = null;
    private static SingletonClass singletonClass = null;
    
    private SingletonClass(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_tracker", "root", "");
            if(connection != null){
                String createCategory = "CREATE TABLE IF NOT EXISTS category(id INT AUTO_INCREMENT, name VARCHAR(255), PRIMARY KEY(id))";
                PreparedStatement ps = connection.prepareStatement(createCategory);
            ps.execute();
            
             String createProduct = "CREATE TABLE IF NOT EXISTS product(id INT AUTO_INCREMENT,cat_id INT, name VARCHAR(255), description VARCHAR(255), price DOUBLE, PRIMARY KEY(id),  FOREIGN KEY(cat_id) REFERENCES category(id))";
             PreparedStatement psProduct = connection.prepareStatement(createProduct);
            psProduct.execute();
            }
        }
        catch(SQLException sqlException){
        System.out.print("sqlException "+sqlException);
        }
    }
     public static SingletonClass getInstance(){
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
  
}
