/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub_interface;


class admin_login {
    
    private String username;
    private int ID;
    
    public admin_login (int ID, String username){
    
        this.ID=ID;
        this.username=username;
    }
    
     public int getID(){
    return ID;
    }   
     
     public String getusername(){
     return username;
     }
}
