/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafetracker;

/**
 *
 * @author HP Nav
 */
public class CategoryModel {
    int id;
    String categoryName;
    
  public  CategoryModel(){
    }
     public CategoryModel(int id,String categoryName){
          this.id = id;
          this.categoryName = categoryName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return categoryName;
    }
    public void setId(int id){
          this.id = id;
       
      }
      public void setName(String categoryName){
          this.categoryName = categoryName;
       
      }
    
}
