/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import sub_interface.Wedding_info;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pos.pos1;
import startup.startt;
import sub_interface.Admin_manage;
import test_int.Product_manage;


public final class Home extends javax.swing.JFrame {
    public String id=null;
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs= null;
        Statement st=null;
      Timer timer;
    public Home() throws SQLException {
        initComponents();
          //show_userwed();
     //Day_Day.getsum();
        Toolkit toolkit = getToolkit();
        Dimension size =toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
          finduserwed();
          show_userproduct();
        jPanel_day_trans.setBackground(new Color(0,0,0,100));
          jPanel_product.setBackground(new Color(0,0,0,100));
            jPanel_Day.setBackground(new Color(0,0,0,100));
            jPanel_Day_past.setBackground(new Color(0,0,0,100));
            jPanel_month.setBackground(new Color(0,0,0,100));
            jPanel_wedd.setBackground(new Color(0,0,0,100));
            jPanel_sidepanel_trans.setBackground(new Color(0,0,0,165));
          jPanel_Day_Day.setBackground(new Color(0,0,0,100));
            jPanel_Month.setBackground(new Color(0,0,0,100));
            jPane_Product.setBackground(new Color(0,0,0,100));
            jPane_Weddings.setBackground(new Color(0,0,0,100));
            jLabel_Date.setBackground(new Color(0,0,0,100));
            
           
             jLabel_Date.setBackground(new Color(0,0,0,100));
           ActionListener actionlistener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Date date = new Date();
              DateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
              String time = timeFormat.format(date);
              jLabel_Date.setText(time);
              
            }
        };
        timer = new Timer (1000, actionlistener);
        timer.setInitialDelay(0);
        timer.start();
        
    }
    //product table
public ArrayList<User> userlistproduct() throws SQLException{
    ArrayList<User> usersListproduct = new ArrayList<>();
    try{
        // Class.forName("com.mysql.jdbc.Driver");
    con = Mainbase.getConnection();
    String query1="SELECT * FROM products";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    User user;
    while (rs.next()){
    user = new User (rs.getString("Key_ID"), rs.getString("Description"), rs.getDouble("Cost"), rs.getDouble("Sale_Price"));
    usersListproduct.add(user);
    
    }
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
       }
    return usersListproduct;
}
//product table
public void show_userproduct() throws SQLException{
ArrayList<User> listproduct = userlistproduct();
DefaultTableModel model =  (DefaultTableModel)jTable_pro.getModel();
Object [] row= new Object[4];
for(int i=0;i<listproduct.size();i++){
row[0]=listproduct.get(i).getKey_ID();
row[1]=listproduct.get(i).getDescription();
row[2]=listproduct.get(i).getCost();
row[3]=listproduct.get(i).getSale_price();
model.addRow(row);
}
}
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_bg = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel_Day = new javax.swing.JPanel();
        jLabel_Date = new javax.swing.JLabel();
        jLabel_profitday = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel_totaldaycost = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_day_trans = new javax.swing.JTable();
        jButton_showday_trans = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel_totalday = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel_Day_past = new javax.swing.JPanel();
        jButton_searchdate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_dayday = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel_profitdaypast = new javax.swing.JLabel();
        jLabel_cost1 = new javax.swing.JLabel();
        jLabel_totaldaypast = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jDateChooser_searchdate = new com.toedter.calendar.JDateChooser();
        jPanel_month = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_month = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jComboBox_month = new javax.swing.JComboBox<>();
        jLabel_momo = new javax.swing.JLabel();
        jLabel_amount = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel8_monthcost = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel_profitmonth = new javax.swing.JLabel();
        jPanel_product = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pro = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_pro_price = new javax.swing.JTextField();
        jTextField_pro_cost = new javax.swing.JTextField();
        jTextField_Description = new javax.swing.JTextField();
        jTextField_key_id = new javax.swing.JTextField();
        jButton_delete = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jButton_add = new javax.swing.JButton();
        jButton_reset = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel_wedd = new javax.swing.JPanel();
        jLabel_idforq = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_wed = new javax.swing.JTable();
        jTextField_searchnamewed = new javax.swing.JTextField();
        jButton1_searchwed = new javax.swing.JButton();
        jButton_viewweddingtable = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel_sidepanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel_day_trans = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Day_Indicator = new javax.swing.JPanel();
        jPanel_Day_Day = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        Daypast_Indicator = new javax.swing.JPanel();
        jPanel_Month = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        Month_Indicator = new javax.swing.JPanel();
        jPane_Weddings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Weddings_Indicator = new javax.swing.JPanel();
        jPane_Product = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Products_Indicator = new javax.swing.JPanel();
        jPanel_sidepanel_trans = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_settings = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23_backback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel_Day.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Date.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_Date.setForeground(new java.awt.Color(204, 204, 204));
        jPanel_Day.add(jLabel_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 200, 60));

        jLabel_profitday.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_profitday.setForeground(new java.awt.Color(153, 0, 0));
        jPanel_Day.add(jLabel_profitday, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 230, 30));

        jLabel11.setFont(new java.awt.Font("Cataneo BT", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Daily Review");
        jPanel_Day.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 350, -1));

        jLabel_totaldaycost.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_totaldaycost.setForeground(new java.awt.Color(255, 204, 51));
        jPanel_Day.add(jLabel_totaldaycost, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 230, 30));

        jTable_day_trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_ID", "Description", "Quantity", "Amount", "Order_Time", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_day_trans);

        jPanel_Day.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 460, 190));

        jButton_showday_trans.setText("Show");
        jButton_showday_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_showday_transActionPerformed(evt);
            }
        });
        jPanel_Day.add(jButton_showday_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 70, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Total Profit for the day       -");
        jPanel_Day.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 330, 30));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Total Income of the day     -");
        jPanel_Day.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 350, -1));

        jLabel_totalday.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_totalday.setForeground(new java.awt.Color(255, 204, 51));
        jPanel_Day.add(jLabel_totalday, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 230, 30));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Total Cost of the day          -");
        jPanel_Day.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 419, 330, 30));

        jLayeredPane1.add(jPanel_Day, "card2");

        jPanel_Day_past.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_searchdate.setText("Search");
        jButton_searchdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchdateActionPerformed(evt);
            }
        });
        jPanel_Day_past.add(jButton_searchdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jTable_dayday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order_ID", "Description", "Quantity", "Amount", "Order_Time", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_dayday);

        jPanel_Day_past.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 460, 190));

        jLabel14.setFont(new java.awt.Font("Cataneo BT", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Past Day Review");
        jPanel_Day_past.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel_profitdaypast.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_profitdaypast.setForeground(new java.awt.Color(153, 0, 0));
        jPanel_Day_past.add(jLabel_profitdaypast, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 210, 30));

        jLabel_cost1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_cost1.setForeground(new java.awt.Color(255, 204, 51));
        jPanel_Day_past.add(jLabel_cost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 210, 30));

        jLabel_totaldaypast.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_totaldaypast.setForeground(new java.awt.Color(255, 204, 51));
        jPanel_Day_past.add(jLabel_totaldaypast, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 210, 30));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Total Profit for the day       -");
        jPanel_Day_past.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Total Income of the day     -");
        jPanel_Day_past.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Total Cost of the day         -");
        jPanel_Day_past.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));
        jPanel_Day_past.add(jDateChooser_searchdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 190, -1));

        jLayeredPane1.add(jPanel_Day_past, "card3");

        jPanel_month.setLayout(null);

        jTable_month.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Amount", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_month);

        jPanel_month.add(jScrollPane4);
        jScrollPane4.setBounds(150, 150, 460, 190);

        jLabel19.setFont(new java.awt.Font("Cataneo BT", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Monthly Review");
        jPanel_month.add(jLabel19);
        jLabel19.setBounds(20, 10, 370, 39);

        jComboBox_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_monthActionPerformed(evt);
            }
        });
        jPanel_month.add(jComboBox_month);
        jComboBox_month.setBounds(250, 90, 240, 30);
        jPanel_month.add(jLabel_momo);
        jLabel_momo.setBounds(210, 220, 50, 30);

        jLabel_amount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_amount.setForeground(new java.awt.Color(255, 204, 0));
        jPanel_month.add(jLabel_amount);
        jLabel_amount.setBounds(460, 380, 200, 30);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Monthly Profit                        -");
        jPanel_month.add(jLabel28);
        jLabel28.setBounds(80, 460, 360, 29);

        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Total Income for the month   -");
        jPanel_month.add(jLabel33);
        jLabel33.setBounds(80, 380, 370, 29);

        jLabel8_monthcost.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8_monthcost.setForeground(new java.awt.Color(255, 204, 51));
        jPanel_month.add(jLabel8_monthcost);
        jLabel8_monthcost.setBounds(460, 420, 200, 30);

        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Total Cost for the month        -");
        jPanel_month.add(jLabel36);
        jLabel36.setBounds(80, 420, 370, 29);

        jLabel_profitmonth.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_profitmonth.setForeground(new java.awt.Color(153, 0, 0));
        jPanel_month.add(jLabel_profitmonth);
        jLabel_profitmonth.setBounds(460, 460, 200, 30);

        jLayeredPane1.add(jPanel_month, "card5");

        jPanel_product.setLayout(null);

        jTable_pro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key_ID", "Description", "Cost", "Sale_Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_proMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pro);

        jPanel_product.add(jScrollPane1);
        jScrollPane1.setBounds(120, 270, 540, 210);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Price                -");
        jPanel_product.add(jLabel4);
        jLabel4.setBounds(140, 180, 130, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Key ID              -");
        jPanel_product.add(jLabel5);
        jLabel5.setBounds(140, 60, 130, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Description     -");
        jPanel_product.add(jLabel6);
        jLabel6.setBounds(140, 100, 130, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Cost                 -");
        jPanel_product.add(jLabel7);
        jLabel7.setBounds(140, 140, 130, 17);
        jPanel_product.add(jTextField_pro_price);
        jTextField_pro_price.setBounds(280, 170, 130, 30);
        jPanel_product.add(jTextField_pro_cost);
        jTextField_pro_cost.setBounds(280, 130, 130, 30);
        jPanel_product.add(jTextField_Description);
        jTextField_Description.setBounds(280, 90, 130, 30);
        jPanel_product.add(jTextField_key_id);
        jTextField_key_id.setBounds(280, 50, 130, 30);

        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });
        jPanel_product.add(jButton_delete);
        jButton_delete.setBounds(500, 130, 70, 23);

        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });
        jPanel_product.add(jButton_update);
        jButton_update.setBounds(500, 90, 70, 23);

        jButton_add.setText("Add");
        jButton_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_addActionPerformed(evt);
            }
        });
        jPanel_product.add(jButton_add);
        jButton_add.setBounds(500, 50, 70, 23);

        jButton_reset.setText("Reset");
        jButton_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resetActionPerformed(evt);
            }
        });
        jPanel_product.add(jButton_reset);
        jButton_reset.setBounds(500, 170, 70, 23);

        jLabel29.setFont(new java.awt.Font("Cataneo BT", 1, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Products");
        jPanel_product.add(jLabel29);
        jLabel29.setBounds(20, 10, 370, 39);

        jLayeredPane1.add(jPanel_product, "card4");

        jPanel_wedd.setLayout(null);
        jPanel_wedd.add(jLabel_idforq);
        jLabel_idforq.setBounds(110, 170, 80, 20);

        jTable_wed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer_name", "Location", "Wedding_date", "Telephone", "Shooting_time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_wed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_wedMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_wed);

        jPanel_wedd.add(jScrollPane5);
        jScrollPane5.setBounds(120, 230, 530, 200);

        jTextField_searchnamewed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchnamewedActionPerformed(evt);
            }
        });
        jTextField_searchnamewed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_searchnamewedKeyReleased(evt);
            }
        });
        jPanel_wedd.add(jTextField_searchnamewed);
        jTextField_searchnamewed.setBounds(250, 140, 130, 30);

        jButton1_searchwed.setText("Search");
        jButton1_searchwed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_searchwedActionPerformed(evt);
            }
        });
        jPanel_wedd.add(jButton1_searchwed);
        jButton1_searchwed.setBounds(430, 140, 80, 30);

        jButton_viewweddingtable.setText("View");
        jButton_viewweddingtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_viewweddingtableActionPerformed(evt);
            }
        });
        jPanel_wedd.add(jButton_viewweddingtable);
        jButton_viewweddingtable.setBounds(590, 210, 60, 20);

        jLabel30.setFont(new java.awt.Font("Cataneo BT", 1, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Weddings ");
        jPanel_wedd.add(jLabel30);
        jLabel30.setBounds(20, 10, 370, 39);

        jLayeredPane1.add(jPanel_wedd, "card6");

        jPanel_bg.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 730, 530));

        jPanel_sidepanel.setBackground(new java.awt.Color(153, 153, 153));
        jPanel_sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("SARATH PHOTO ");
        jPanel_sidepanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 42));

        jPanel_day_trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_day_transMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_day_transMousePressed(evt);
            }
        });
        jPanel_day_trans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Day");
        jPanel_day_trans.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        Day_Indicator.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout Day_IndicatorLayout = new javax.swing.GroupLayout(Day_Indicator);
        Day_Indicator.setLayout(Day_IndicatorLayout);
        Day_IndicatorLayout.setHorizontalGroup(
            Day_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        Day_IndicatorLayout.setVerticalGroup(
            Day_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_day_trans.add(Day_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));
        Day_Indicator.getAccessibleContext().setAccessibleName("");

        jPanel_sidepanel.add(jPanel_day_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 250, 50));

        jPanel_Day_Day.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Day_DayMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_Day_DayMousePressed(evt);
            }
        });
        jPanel_Day_Day.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Day Past");
        jPanel_Day_Day.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, -1));

        Daypast_Indicator.setOpaque(false);
        Daypast_Indicator.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout Daypast_IndicatorLayout = new javax.swing.GroupLayout(Daypast_Indicator);
        Daypast_Indicator.setLayout(Daypast_IndicatorLayout);
        Daypast_IndicatorLayout.setHorizontalGroup(
            Daypast_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        Daypast_IndicatorLayout.setVerticalGroup(
            Daypast_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_Day_Day.add(Daypast_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));
        Daypast_Indicator.getAccessibleContext().setAccessibleName("");

        jPanel_sidepanel.add(jPanel_Day_Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 50));

        jPanel_Month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_MonthMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_MonthMousePressed(evt);
            }
        });
        jPanel_Month.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Month");
        jPanel_Month.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, -1));

        Month_Indicator.setOpaque(false);
        Month_Indicator.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout Month_IndicatorLayout = new javax.swing.GroupLayout(Month_Indicator);
        Month_Indicator.setLayout(Month_IndicatorLayout);
        Month_IndicatorLayout.setHorizontalGroup(
            Month_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        Month_IndicatorLayout.setVerticalGroup(
            Month_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_Month.add(Month_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jPanel_sidepanel.add(jPanel_Month, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 50));

        jPane_Weddings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPane_WeddingsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPane_WeddingsMousePressed(evt);
            }
        });
        jPane_Weddings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Weddings");
        jPane_Weddings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, -1));

        Weddings_Indicator.setOpaque(false);
        Weddings_Indicator.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout Weddings_IndicatorLayout = new javax.swing.GroupLayout(Weddings_Indicator);
        Weddings_Indicator.setLayout(Weddings_IndicatorLayout);
        Weddings_IndicatorLayout.setHorizontalGroup(
            Weddings_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        Weddings_IndicatorLayout.setVerticalGroup(
            Weddings_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPane_Weddings.add(Weddings_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jPanel_sidepanel.add(jPane_Weddings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 250, 50));

        jPane_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPane_ProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPane_ProductMousePressed(evt);
            }
        });
        jPane_Product.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Products");
        jPane_Product.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, -1));

        Products_Indicator.setOpaque(false);
        Products_Indicator.setPreferredSize(new java.awt.Dimension(5, 50));

        javax.swing.GroupLayout Products_IndicatorLayout = new javax.swing.GroupLayout(Products_Indicator);
        Products_Indicator.setLayout(Products_IndicatorLayout);
        Products_IndicatorLayout.setHorizontalGroup(
            Products_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        Products_IndicatorLayout.setVerticalGroup(
            Products_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPane_Product.add(Products_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 50));

        jPanel_sidepanel.add(jPane_Product, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 250, 50));

        jPanel_sidepanel_trans.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("AND");
        jPanel_sidepanel_trans.add(jLabel1);
        jLabel1.setBounds(10, 50, 60, 30);

        jLabel_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_settings_filled_20px.png"))); // NOI18N
        jLabel_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_settingsMouseClicked(evt);
            }
        });
        jPanel_sidepanel_trans.add(jLabel_settings);
        jLabel_settings.setBounds(10, 140, 30, 30);

        jLabel_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_exit_20px.png"))); // NOI18N
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseEntered(evt);
            }
        });
        jPanel_sidepanel_trans.add(jLabel_logout);
        jLabel_logout.setBounds(220, 140, 20, 20);
        jPanel_sidepanel_trans.add(jSeparator1);
        jSeparator1.setBounds(10, 170, 231, 2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("VIDEO PRODUCTION");
        jPanel_sidepanel_trans.add(jLabel2);
        jLabel2.setBounds(10, 80, 196, 42);

        jPanel_sidepanel.add(jPanel_sidepanel_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 530));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/B_W_weddings1-300x217.jpg"))); // NOI18N
        jPanel_sidepanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 530));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("AND");
        jPanel_sidepanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel_bg.add(jPanel_sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 530));

        jLabel23_backback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ed.jpg"))); // NOI18N
        jPanel_bg.add(jLabel23_backback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //product table
    private void jTable_proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_proMouseClicked
        int i = jTable_pro.getSelectedRow();
        TableModel model =jTable_pro.getModel();
        jTextField_key_id.setText(model.getValueAt(i,0).toString());
        jTextField_Description.setText(model.getValueAt(i,1).toString());
        jTextField_pro_cost.setText(model.getValueAt(i,2).toString());
        jTextField_pro_price.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable_proMouseClicked
//product table
    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        try{
            String query ="DELETE FROM products WHERE Key_ID=?";
            con = Mainbase.getConnection();
            pst =con.prepareStatement(query);
            pst.setString(1, jTextField_key_id.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_pro.getModel();
            model.setRowCount(0);
            show_userproduct();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            jTextField_key_id.setText("");
            jTextField_Description.setText("");
            jTextField_pro_cost.setText("");
            jTextField_pro_price.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Product_manage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Unsuccessfull");
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed
//product table
    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        try{

            // int row = jTable_pro.getSelectedRow();
            // String value =(jTable_pro.getModel().getValueAt(row, 0).toString());
            String query ="UPDATE products SET Description=?,Cost=?,Sale_Price=? WHERE Key_ID=?";
            con = Mainbase.getConnection();
            pst =con.prepareStatement(query);
            pst.setString(4, jTextField_key_id.getText());
            pst.setString(1, jTextField_Description.getText());
            pst.setString(2,jTextField_pro_cost.getText());
            pst.setString(3,jTextField_pro_price.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_pro.getModel();
            model.setRowCount(0);
            show_userproduct();
            JOptionPane.showMessageDialog(null, "Update successfully");
            jTextField_key_id.setText("");
            jTextField_Description.setText("");
            jTextField_pro_cost.setText("");
            jTextField_pro_price.setText("");
            
        } catch (SQLException ex) {
            Logger.getLogger(Product_manage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Unsuccessfull");
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_updateActionPerformed
//product table
    private void jButton_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_addActionPerformed
        try{
            String sql ="INSERT INTO products"
            +"(Key_ID, Description, Cost, Sale_Price)"
            +"VALUES (?,?,?,?)";
            con = Mainbase.getConnection();
            pst =con.prepareStatement(sql);
            pst.setString(1, jTextField_key_id.getText());
            pst.setString(2, jTextField_Description.getText());
            pst.setString(3, jTextField_pro_cost.getText());
            pst.setString(4, jTextField_pro_price.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable_pro.getModel();
            model.setRowCount(0);
            show_userproduct();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            jTextField_key_id.setText("");
            jTextField_Description.setText("");
            jTextField_pro_cost.setText("");
            jTextField_pro_price.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Product_manage.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error");
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_addActionPerformed
//product table
    private void jButton_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resetActionPerformed
        jTextField_key_id.setText("");
        jTextField_Description.setText("");
        jTextField_pro_cost.setText("");
        jTextField_pro_price.setText("");
    }//GEN-LAST:event_jButton_resetActionPerformed

    private void jPanel_day_transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_day_transMouseClicked
        switchPanels(jPanel_Day);
        finduserdaytrans();
        getsumday();
           setColor(jPanel_day_trans);
        Day_Indicator.setOpaque(true);
        resetColor(new JPanel[]{jPanel_Day_Day,jPanel_Month,jPane_Product,jPane_Weddings},new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
      /*Day_Indicator.setOpaque(true);
     Daypast_Indicator.setOpaque(false);
    Month_Indicator.setOpaque(false);
    Products_Indicator.setOpaque(false);
     Weddings_Indicator.setOpaque(false);*/
    }//GEN-LAST:event_jPanel_day_transMouseClicked

    private void jPanel_Day_DayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Day_DayMouseClicked
       switchPanels(jPanel_Day_past);
      /*  Day_Indicator.setOpaque(false);
     Daypast_Indicator.setOpaque(true);
    Month_Indicator.setOpaque(false);
    Products_Indicator.setOpaque(false);
     Weddings_Indicator.setOpaque(false);*/
    }//GEN-LAST:event_jPanel_Day_DayMouseClicked

    private void jPanel_MonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MonthMouseClicked
        switchPanels(jPanel_month);
    }//GEN-LAST:event_jPanel_MonthMouseClicked

    private void jPane_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_ProductMouseClicked
        switchPanels(jPanel_product);
    }//GEN-LAST:event_jPane_ProductMouseClicked

//search by date    
    public ArrayList<dayday> userlistdaysearch(String dada) 
{
    ArrayList<dayday> usersListdaysearch = new ArrayList<>();

    try{
        
       // Class.forName("com.mysql.jdbc.Driver");
        con = Mainbase.getConnection();
        st = con.createStatement();
        String query2="SELECT `Order_ID`,`Description`,`Quantity`,`Amount`,`Order_Time`,`Cost` FROM `order_de` WHERE  `Order_Date` LIKE '%"+dada+"%'";
        rs = st.executeQuery(query2);
     
    dayday day1;
    while (rs.next()){
    day1 = new dayday (rs.getString("Order_ID"), rs.getString("Description"), rs.getInt("Quantity"), rs.getDouble("Amount"),rs.getString("Order_Time"),rs.getDouble("Cost"));
    usersListdaysearch.add(day1);
    
    }
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
       }
    return usersListdaysearch;
}
public void finduserday(){
  
         ArrayList<dayday> list = userlistdaysearch (((JTextField)jDateChooser_searchdate.getDateEditor().getUiComponent()).getText());
         DefaultTableModel model2 = new DefaultTableModel();
         model2.setColumnIdentifiers(new Object[]{"Order_ID","Description","Quantity","Amount","Order_Time","Cost"});
         Object [] row= new Object[6];
         for(int i=0;i<list.size();i++){
             
             row[0]=list.get(i).getOrder_ID();
             row[1]=list.get(i).getDescription();
             row[2]=list.get(i).getQuantity();
             row[3]=list.get(i).getAmount();
             row[4]=list.get(i).getOrder_Time();
              row[5]=list.get(i).getCost();
             model2.addRow(row);
         }
         jTable_dayday.setModel(model2);

       


}
    private void jButton_searchdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchdateActionPerformed
 
     finduserday();
     getsumdaypast();  
     getsumpastdaycost(); 
     setprofitpastday();
    }//GEN-LAST:event_jButton_searchdateActionPerformed

    private void jPane_WeddingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_WeddingsMouseClicked
     switchPanels(jPanel_wedd);
    }//GEN-LAST:event_jPane_WeddingsMouseClicked

    private void jButton1_searchwedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_searchwedActionPerformed
    finduserwed();
      
    }//GEN-LAST:event_jButton1_searchwedActionPerformed

    private void jTable_wedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_wedMouseClicked
        int i = jTable_wed.getSelectedRow();
        TableModel model =jTable_wed.getModel();
        jTextField_searchnamewed.setText(model.getValueAt(i,1).toString());
    }//GEN-LAST:event_jTable_wedMouseClicked

    private void jButton_showday_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_showday_transActionPerformed
     finduserdaytrans();
     getsumday();
     getsumdaytranscost();
     setprofitday();
    }//GEN-LAST:event_jButton_showday_transActionPerformed

    private void jLabel_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_settingsMouseClicked
     try {
         new Admin_manage().setVisible(true);
     } catch (SQLException ex) {
         Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jLabel_settingsMouseClicked

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        new startt().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel_logoutMouseClicked

    private void jComboBox_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_monthActionPerformed
      sheshe();
      findusermonth();
      getsumdaymonth();
      getsummonthcost();
      setprofitmonth();
    }//GEN-LAST:event_jComboBox_monthActionPerformed

    private void jButton_viewweddingtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_viewweddingtableActionPerformed
     new Wedding_info().setVisible(true);
    //  int i = jTable_wed.getSelectedRow();
      //  TableModel model =jTable_wed.getModel();
       //id =model.getValueAt(i, 0).toString();
//jLabel_idforq.setText(model.getValueAt(i, 0).toString());
//Wedding_ijPane_Productnfo.jLabel_wedid.setText(model.getValueAt(i, 0).toString());
      //Wedding_info.jLabel_wedid.getText(jLabel_idforq);
    }//GEN-LAST:event_jButton_viewweddingtableActionPerformed

    private void jLabel_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_logoutMouseEntered

    private void jTextField_searchnamewedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchnamewedActionPerformed

    }//GEN-LAST:event_jTextField_searchnamewedActionPerformed

    private void jTextField_searchnamewedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_searchnamewedKeyReleased
        finduserwed();
    }//GEN-LAST:event_jTextField_searchnamewedKeyReleased

    private void jPanel_day_transMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_day_transMousePressed
        /*setColor(jPanel_day_trans);
        Day_Indicator.setOpaque(true);
        resetColor(new JPanel[]{jPanel_Day_Day,jPanel_Month,jPane_Product,jPane_Weddings},new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
      //Daypast_Indicator.setOpaque(false);
     // Month_Indicator.setOpaque(false);
     // Products_Indicator.setOpaque(false);
     // Weddings_Indicator.setOpaque(false);*/
    }//GEN-LAST:event_jPanel_day_transMousePressed

    private void jPanel_Day_DayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Day_DayMousePressed
        setColor(jPanel_Day_Day);
        Daypast_Indicator.setOpaque(true);
        //  Day_Indicator.setOpaque(false);
      // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
     // Daypast_Indicator.setOpaque(false);
    //  Month_Indicator.setOpaque(false);
     // Products_Indicator.setOpaque(false);
      //Weddings_Indicator.setOpaque(false);
       resetColor(new JPanel[]{jPanel_day_trans,jPanel_Month,jPane_Product,jPane_Weddings},new JPanel[]{Day_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
    }//GEN-LAST:event_jPanel_Day_DayMousePressed

    private void jPanel_MonthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MonthMousePressed
        setColor(jPanel_Month);
        Month_Indicator.setOpaque(true);
        //  Day_Indicator.setOpaque(false);
    //    resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
    //  Daypast_Indicator.setOpaque(false);
      //Month_Indicator.setOpaque(false);
     // Products_Indicator.setOpaque(false);
     // Weddings_Indicator.setOpaque(false);
       resetColor(new JPanel[]{jPanel_day_trans,jPanel_Day_Day,jPane_Product,jPane_Weddings},new JPanel[]{Daypast_Indicator,Day_Indicator,Products_Indicator,Weddings_Indicator});
    }//GEN-LAST:event_jPanel_MonthMousePressed

    private void jPane_ProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_ProductMousePressed
        setColor(jPane_Product);
        Products_Indicator.setOpaque(true);
        //  Day_Indicator.setOpaque(false);
       // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
     // Daypast_Indicator.setOpaque(false);
     // Month_Indicator.setOpaque(false);
     // Products_Indicator.setOpaque(false);
      //Weddings_Indicator.setOpaque(false);
       resetColor(new JPanel[]{jPanel_day_trans,jPanel_Month,jPanel_Day_Day,jPane_Weddings},new JPanel[]{Daypast_Indicator,Month_Indicator,Day_Indicator,Weddings_Indicator});
    }//GEN-LAST:event_jPane_ProductMousePressed

    private void jPane_WeddingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_WeddingsMousePressed
       setColor(jPane_Weddings);
       Weddings_Indicator.setOpaque(true);
         //Day_Indicator.setOpaque(false);
      // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
     /// Daypast_Indicator.setOpaque(false);
     // Month_Indicator.setOpaque(false);
      //Products_Indicator.setOpaque(false);
      //Weddings_Indicator.setOpaque(false);
        resetColor(new JPanel[]{jPanel_day_trans,jPanel_Month,jPane_Product,jPanel_Day_Day},new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator, Day_Indicator});
    }//GEN-LAST:event_jPane_WeddingsMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
//switch panel method    
public void switchPanels(JPanel pane){
    
    jLayeredPane1.removeAll();
    jLayeredPane1.add(pane);
    jLayeredPane1.repaint();
    jLayeredPane1.revalidate();
    
    }



public void getsum(){
    double sum = 0;
    for (int i = 0; i<jTable_dayday.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_dayday.getValueAt(i, 3).toString());
   //double make
    }
    jLabel_totaldaycost.setText(Integer.toString((int) (sum)));
    }

public ArrayList<wed> userlistwed(String wed)
{
    ArrayList<wed> usersListwed = new ArrayList<>();

    try{
        
        //Class.forName("com.mysql.jdbc.Driver");
        con = Mainbase.getConnection();
        Statement st = con.createStatement();
        String query2="SELECT `Wedding_ID`,`Customer_name`,`Location`,`Wedding_date`,`Telephone`,`Shooting_time` FROM `weddings` WHERE `Customer_name` LIKE '%"+wed+"%'";
        rs = st.executeQuery(query2);
     
    wed wed1;
    while (rs.next()){
    wed1 = new wed (rs.getInt("Wedding_ID"),rs.getString("Customer_name"), rs.getString("Location"), rs.getString("Wedding_date"), rs.getInt("Telephone"),rs.getString("Shooting_time"));
    usersListwed.add(wed1);
    
    }
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
       }
    return usersListwed;
}

public void finduserwed(){
ArrayList<wed> list = userlistwed(jTextField_searchnamewed.getText());
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(new Object[]{"ID","Customer_name","Location","Wedding_date","Telephone","Shooting_time"});
Object [] row= new Object[6];
for(int i=0;i<list.size();i++){
row[0]=list.get(i).getWedding_ID();
row[1]=list.get(i).getCustomer_name();
row[2]=list.get(i).getLocation();
row[3]=list.get(i).getWedding_date();
row[4]=list.get(i).getTelephone();
row[5]=list.get(i).getShooting_time();
model.addRow(row);
}
jTable_wed.setModel(model);
}

public ArrayList<DayDay_trans> userlistdaytrans(String mama)
{
    ArrayList<DayDay_trans> usersListdaytrans = new ArrayList<>();

    try{
        
       // Class.forName("com.mysql.jdbc.Driver");
        con = Mainbase.getConnection();
        st = con.createStatement();
        String query3="SELECT `Order_ID`,`Description`,`Quantity`,`Amount`,`Order_Time`,`Cost` FROM `order_de` WHERE  `Order_Date` LIKE '%"+mama+"%'";
        rs = st.executeQuery(query3);
     
    DayDay_trans daypresent;
    while (rs.next()){
    daypresent = new DayDay_trans(rs.getString("Order_ID"), rs.getString("Description"), rs.getInt("Quantity"), rs.getDouble("Amount"),rs.getString("Order_Time"),rs.getDouble("Cost"));
    usersListdaytrans.add(daypresent);
    
    }
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
       }
    return usersListdaytrans;
}

public void finduserdaytrans(){
ArrayList<DayDay_trans> list = userlistdaytrans(jLabel_Date.getText());
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(new Object[]{"Order_ID","Description","Quantity`","Amount","Order_Time","Cost"});
Object [] row= new Object[6];
for(int i=0;i<list.size();i++){

row[0]=list.get(i).getOrder_ID();
row[1]=list.get(i).getDescription();
row[2]=list.get(i).getQuantity();
row[3]=list.get(i).getAmount();
row[4]=list.get(i).getOrder_Time();
row[5]=list.get(i).getCost();
model.addRow(row);
}
jTable_day_trans.setModel(model);
}

public void getsumday(){
    double sum = 0;
    for (int i = 0; i<jTable_day_trans.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_day_trans.getValueAt(i, 3).toString());
   //double make
    }
jLabel_totalday.setText(Integer.toString((int) (sum)));
}
public void sheshe(){
 String pkg;
            pkg = jComboBox_month.getSelectedItem().toString();
            if(null != pkg)switch (pkg) {
         case "January":
             jLabel_momo.setText("1");
             break;
         case "February":
             jLabel_momo.setText("2");
             break;
         case "March":
             jLabel_momo.setText("3");
             break;
         case "April":
             jLabel_momo.setText("4");
             break;
         case "May":
             jLabel_momo.setText("5");
             break;
         case "June":
             jLabel_momo.setText("6");
             break;
         case "July":
             jLabel_momo.setText("7");
             break;
         case "August":
             jLabel_momo.setText("8");
             break;
         case "September":
             jLabel_momo.setText("9");
             break;
         case "October":
             jLabel_momo.setText("10");
             break;
         case "November":
             jLabel_momo.setText("11");
             break;
         case "December":
             jLabel_momo.setText("12");
             break;
         default:
             break;
     }
    }


public ArrayList<month> userlistmonth(String num)
{
    ArrayList<month> usersListmonth = new ArrayList<>();

    try{
        
        //Class.forName("com.mysql.jdbc.Driver");
        con = Mainbase.getConnection();
        st = con.createStatement();
        String query3="SELECT DATE_FORMAT(Order_Date, \"%d-%m-%Y\") AS `Date`, SUM(Amount) AS `Amount`, SUM(Cost) AS `Cost` FROM order_de WHERE MONTH(Order_Date)="+num+" GROUP BY DATE_FORMAT(Order_Date, \"%d-%m-%Y\")";
        rs = st.executeQuery(query3);
        
    month month1;
    while (rs.next()){
    month1 = new month(rs.getString("Date"), rs.getInt("Amount"),rs.getInt("Cost"));
    usersListmonth.add(month1);
    
    }
    }
    catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
       }
    return usersListmonth;
}

public void findusermonth(){
ArrayList<month> list = userlistmonth(jLabel_momo.getText());
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(new Object[]{"Date","Amount","Cost"});
Object [] row= new Object[3];
for(int i=0;i<list.size();i++){

row[0]=list.get(i).getDate();
row[1]=list.get(i).getAmount();
row[2]=list.get(i).getCost();
model.addRow(row);
}
jTable_month.setModel(model);
}
public void getsumdaypast(){
    double sum = 0;
    for (int i = 0; i<jTable_dayday.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_dayday.getValueAt(i, 3).toString());
   //double make
    }
jLabel_totaldaypast.setText(Integer.toString((int) (sum)));
}
public void getsumdaymonth(){
    double sum = 0;
    for (int i = 0; i<jTable_month.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_month.getValueAt(i, 1).toString());
   //double make
    }
jLabel_amount.setText(Integer.toString((int) (sum)));
}

    public String getMessage(){
        return jLabel_idforq.getText();
    }
private void setColor(JPanel pane){
 pane.setBackground(new Color(85,65,80,113));
}

private void resetColor(JPanel[] pane,JPanel[] indicators){

for(int i=0;i<pane.length;i++){
pane[i].setBackground(new Color(0,0,0,100));
}
for(int i=0;i<indicators.length;i++){
indicators[i].setOpaque(false);
}
}

public void getsumdaytranscost(){
    double sum = 0;
    for (int i = 0; i<jTable_day_trans.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_day_trans.getValueAt(i, 5).toString());
   //double make
    }
jLabel_totaldaycost.setText(Integer.toString((int) (sum)));
}

public void getsumpastdaycost(){
    double sum = 0;
    for (int i = 0; i<jTable_dayday.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_dayday.getValueAt(i, 5).toString());
   //double make
    }
jLabel_cost1.setText(Integer.toString((int) (sum)));
}

public void getsummonthcost(){
    double sum = 0;
    for (int i = 0; i<jTable_month.getRowCount(); i++)
    {
    sum = sum + Double.parseDouble(jTable_month.getValueAt(i, 2).toString());
   //double make
    }
jLabel8_monthcost.setText(Integer.toString((int) (sum)));
}

public void setprofitday(){
int  dayincome = Integer.parseInt(jLabel_totalday.getText()); 
int  daycost = Integer.parseInt(jLabel_totaldaycost.getText()); 
       int y = dayincome-daycost;
       String str =String.valueOf(y);
       jLabel_profitday.setText(str);
}

public void setprofitpastday(){
int  dayincome = Integer.parseInt(jLabel_totaldaypast.getText()); 
int  daycost = Integer.parseInt(jLabel_cost1.getText()); 
       int y = dayincome-daycost;
       String str =String.valueOf(y);
       jLabel_profitdaypast.setText(str);
}

public void setprofitmonth(){
int  dayincome = Integer.parseInt(jLabel_amount.getText()); 
int  daycost = Integer.parseInt(jLabel8_monthcost.getText()); 
       int y = dayincome-daycost;
       String str =String.valueOf(y);
       jLabel_profitmonth.setText(str);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Day_Indicator;
    private javax.swing.JPanel Daypast_Indicator;
    private javax.swing.JPanel Month_Indicator;
    private javax.swing.JPanel Products_Indicator;
    private javax.swing.JPanel Weddings_Indicator;
    private javax.swing.JButton jButton1_searchwed;
    private javax.swing.JButton jButton_add;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_reset;
    private javax.swing.JButton jButton_searchdate;
    private javax.swing.JButton jButton_showday_trans;
    private javax.swing.JButton jButton_update;
    private javax.swing.JButton jButton_viewweddingtable;
    private javax.swing.JComboBox<String> jComboBox_month;
    private com.toedter.calendar.JDateChooser jDateChooser_searchdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel23_backback;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8_monthcost;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_amount;
    private javax.swing.JLabel jLabel_cost1;
    private javax.swing.JLabel jLabel_idforq;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JLabel jLabel_momo;
    private javax.swing.JLabel jLabel_profitday;
    private javax.swing.JLabel jLabel_profitdaypast;
    private javax.swing.JLabel jLabel_profitmonth;
    private javax.swing.JLabel jLabel_settings;
    private javax.swing.JLabel jLabel_totalday;
    private javax.swing.JLabel jLabel_totaldaycost;
    private javax.swing.JLabel jLabel_totaldaypast;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPane_Product;
    private javax.swing.JPanel jPane_Weddings;
    private javax.swing.JPanel jPanel_Day;
    private javax.swing.JPanel jPanel_Day_Day;
    private javax.swing.JPanel jPanel_Day_past;
    private javax.swing.JPanel jPanel_Month;
    private javax.swing.JPanel jPanel_bg;
    private javax.swing.JPanel jPanel_day_trans;
    private javax.swing.JPanel jPanel_month;
    private javax.swing.JPanel jPanel_product;
    private javax.swing.JPanel jPanel_sidepanel;
    private javax.swing.JPanel jPanel_sidepanel_trans;
    private javax.swing.JPanel jPanel_wedd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable_day_trans;
    private javax.swing.JTable jTable_dayday;
    private javax.swing.JTable jTable_month;
    private javax.swing.JTable jTable_pro;
    private javax.swing.JTable jTable_wed;
    private javax.swing.JTextField jTextField_Description;
    private javax.swing.JTextField jTextField_key_id;
    private javax.swing.JTextField jTextField_pro_cost;
    private javax.swing.JTextField jTextField_pro_price;
    private javax.swing.JTextField jTextField_searchnamewed;
    // End of variables declaration//GEN-END:variables
}
