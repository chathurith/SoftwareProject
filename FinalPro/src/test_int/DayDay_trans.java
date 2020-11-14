/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_int;

/**
 *
 * @author pct
 */
public class DayDay_trans {
    private String Order_ID,Description, Order_Time;
    private int Quantity;
    private double Amount;
    
    public DayDay_trans (String Order_ID, String Description, int Quantity, double Amount , String Order_Time){
    
    this.Order_ID=Order_ID;
    this.Description=Description;
    this.Quantity=Quantity;
    this.Amount=Amount;
    this.Order_Time=Order_Time;
    }
    
      public String getOrder_ID(){
    return Order_ID ;
    }
      
      public String getDescription(){
    return Description ;
    }
       public int getQuantity(){
    return Quantity ;
    }
       
         public double getAmount(){
    return Amount ;
    }
       public String getOrder_Time(){
    return Order_Time ;
    }  


}
