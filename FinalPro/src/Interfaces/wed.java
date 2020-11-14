/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;



/**
 *
 * @author pct
 */
class wed {
     private String Customer_name,Location,Wedding_date,Shooting_time;
     private int Wedding_ID,Telephone;  
     
     
      public wed (int Wedding_ID, String Customer_name, String Location, String Wedding_date, int Telephone, String Shooting_time){
    this.Wedding_ID=Wedding_ID;
    this.Customer_name=Customer_name;
    this.Location=Location;
    this.Wedding_date=Wedding_date;
    this.Telephone=Telephone;
    this.Shooting_time=Shooting_time;
      }
      
    public int getWedding_ID(){
    return Wedding_ID;
    }     
    public String getCustomer_name(){
    return Customer_name;
    }
     
    public String getLocation(){
    return Location;
    }  
 
     
   public String getWedding_date(){
    return Wedding_date;
    }    
   public int getTelephone(){
    return Telephone;
    }  
   public String getShooting_time(){
    return Shooting_time;
    }    
}
