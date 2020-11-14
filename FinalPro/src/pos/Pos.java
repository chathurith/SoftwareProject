/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author ADMIN
 */
public class Pos{
     private String InvoiceNo;
     private String adddate;
     private String addtime;
     private String Name;
     private String Address;
     private int TPno;
     private String category;
     private int quatity;
     private float subtot;
     private String estimtaedate;
     private float unprice;
     
public Pos (String Order_id, String Discription, int Quantity,float Unitprice, float Amount, String Order_date,String Order_time,String Cname,int Tpno,String Address,String Esdate )
{
        this.InvoiceNo=Order_id;
        this.Name=Cname;
        this.TPno=Tpno;
        this.Address=Address;
        this.subtot=Amount;
        this.category=Discription;
        this.quatity=Quantity;
        this.unprice=Unitprice;
        this.adddate=Order_date;
        this.addtime=Order_time;
        this.estimtaedate=Esdate;
        

        } 
public String getid()
   {
    return InvoiceNo;
    
}
public String getName()
   {
       return Name;
       
   }
public int getTpno()
   {
       return TPno;
   }
public String getAddress()
   {
       return Address;
   }
public float getsubtot()
   {
       return subtot;
   }
public String category()
   {
       return category;
   }
public int quantity()
   {
       return quatity;
   }
public float getunprice()
   {
       return unprice;
   }
public String getadddate()
   {
       return adddate;
   }
public String getaddtime()
   {
       return addtime;
   }
public String getestimtadate()
   {
       return estimtaedate;
   }
}

