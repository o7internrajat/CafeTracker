/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafetracker;

/**
 *
 * @author asus
 */
public class ProductModel {
      int id;
    String name;
    String description;
    Double price;
    
  public  ProductModel(){
    }
     public ProductModel(int id,String name,String description,Double price){
          this.id = id;
          this.name = name;
          this.description = description;
          this.price = price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getPrice(){
        return price.toString();
    }
    public void setId(int id){
          this.id = id;
       
      }
      public void setName(String name){
          this.name = name;
       
      }
        public void setDescription(String description){
          this.description = description;
       
      }
          public void setPrice(Double Price){
          this.price = price.doubleValue();
       
      }
    
}
