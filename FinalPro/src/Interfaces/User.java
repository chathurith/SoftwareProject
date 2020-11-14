/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import test_int.*;


class User {
    private String Key_ID, Description;
    private double Cost, Sale_Price;

    
    public User (String Key_ID, String Description, double Cost, double Sale_Price){
     
    this.Key_ID=Key_ID;
    this.Description=Description;
    this.Cost=Cost;
    this.Sale_Price=Sale_Price;
   
     }

 
    
    public String getKey_ID(){
    return Key_ID;
    }
    
    public String getDescription(){
    return Description;
    }
    
   public double getCost(){
   return Cost;
   }
    
   public double getSale_price(){
   return Sale_Price;
   }
   
  
}
