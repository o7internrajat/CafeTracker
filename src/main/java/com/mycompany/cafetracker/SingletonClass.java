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
