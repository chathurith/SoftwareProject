/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub_interface;
//`Wedding_ID`, `Customer_name`, `Location`, `Package`, `Type`, `Wedding_date`, `Homecomming_date`, `Shooting_time`, `Poruwa_time`, `Address`, `Telephone`, `Homecomming_location`, `Homecomming_shootingtime`
/**
 *
 * @author pct
 */
class wed_info {
 private String Customer_name,Location, Package,Type,Wedding_date,Homecomming_date,Shooting_time,Poruwa_time,Address,Homecomming_location,Homecomming_shootingtime;   
 private int Wedding_ID,Telephone;

public wed_info(int Wedding_ID,String Customer_name,String Location, String Package, String Type, String Wedding_date, String Homecomming_date, String Shooting_time, String Poruwa_time, String Address, int Telephone,String Homecomming_location, String Homecomming_shootingtime ){

this.Wedding_ID=Wedding_ID;
this.Customer_name=Customer_name;
this.Location=Location;
this.Package=Package;
this.Type=Type;
this.Wedding_date=Wedding_date;
this.Homecomming_date=Homecomming_date;
this.Shooting_time=Shooting_time;
this.Poruwa_time=Poruwa_time;
this.Address=Address;
this.Telephone=Telephone;
this.Homecomming_location=Homecomming_location;
this.Homecomming_shootingtime=Homecomming_shootingtime;

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
 
     public String getType(){
    return Type;
    }  
   public String getWedding_date(){
    return Wedding_date;
    }    
    public String getHomecomming_date(){
    return Homecomming_date;
    }   
    public String getShooting_time(){
    return Shooting_time;
    }    

     public String getPoruwa_time(){
    return Poruwa_time;
    }    

    
     public String getAddress(){
    return Address;
    }    
      public int getTelephone(){
    return Telephone;
    }  
  

public String getHomecomming_location(){
    return  Homecomming_location;
    }   
    public String getHomecomming_shootingtime(){
    return  Homecomming_shootingtime;
    }   
    
    
  
}
