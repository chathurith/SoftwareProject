/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class pos2 {
    public static Connection getConnection(){
     Connection con=null;
     try{
         
             Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/sarath_photo_video","root","");
            
           
         } catch (ClassNotFoundException | SQLException ex){
        System.out.println(ex.getMessage());
         }
     return con;
     
    }
       
            
    }

        
    


   
