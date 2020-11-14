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
class month {
    private String Date;
    private int Amount,Cost;
    
    public month (String Date, int Amount, int Cost){
    this.Date=Date;
    this.Amount=Amount;
    this.Cost=Cost;
    }
    
    public String getDate(){
    return Date;
    }
    
    public int getAmount(){
    return Amount;
    }
    public int getCost(){
return Cost;
}
}
