/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub_interface;

/**
 *
 * @author pct
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_day_trans = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Day_Indicator = new javax.swing.JPanel();
        jPanel_Day_Day = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        Daypast_Indicator = new javax.swing.JPanel();
        jPanel_Month = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        Month_Indicator = new javax.swing.JPanel();
        jPane_Product = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Products_Indicator = new javax.swing.JPanel();
        jPane_Weddings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Weddings_Indicator = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel_day_trans.setBackground(new java.awt.Color(0, 204, 204));
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

        Day_Indicator.setPreferredSize(new java.awt.Dimension(7, 50));

        javax.swing.GroupLayout Day_IndicatorLayout = new javax.swing.GroupLayout(Day_Indicator);
        Day_Indicator.setLayout(Day_IndicatorLayout);
        Day_IndicatorLayout.setHorizontalGroup(
            Day_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        Day_IndicatorLayout.setVerticalGroup(
            Day_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_day_trans.add(Day_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 7, 50));

        jPanel_Day_Day.setBackground(new java.awt.Color(0, 153, 204));
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
        Daypast_Indicator.setPreferredSize(new java.awt.Dimension(7, 50));

        javax.swing.GroupLayout Daypast_IndicatorLayout = new javax.swing.GroupLayout(Daypast_Indicator);
        Daypast_Indicator.setLayout(Daypast_IndicatorLayout);
        Daypast_IndicatorLayout.setHorizontalGroup(
            Daypast_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        Daypast_IndicatorLayout.setVerticalGroup(
            Daypast_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_Day_Day.add(Daypast_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 7, 50));

        jPanel_Month.setBackground(new java.awt.Color(255, 153, 153));
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

        javax.swing.GroupLayout Month_IndicatorLayout = new javax.swing.GroupLayout(Month_Indicator);
        Month_Indicator.setLayout(Month_IndicatorLayout);
        Month_IndicatorLayout.setHorizontalGroup(
            Month_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        Month_IndicatorLayout.setVerticalGroup(
            Month_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel_Month.add(Month_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 7, 50));

        jPane_Product.setBackground(new java.awt.Color(204, 255, 153));
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
        Products_Indicator.setPreferredSize(new java.awt.Dimension(7, 50));

        javax.swing.GroupLayout Products_IndicatorLayout = new javax.swing.GroupLayout(Products_Indicator);
        Products_Indicator.setLayout(Products_IndicatorLayout);
        Products_IndicatorLayout.setHorizontalGroup(
            Products_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        Products_IndicatorLayout.setVerticalGroup(
            Products_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPane_Product.add(Products_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 7, 50));

        jPane_Weddings.setBackground(new java.awt.Color(102, 153, 255));
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

        javax.swing.GroupLayout Weddings_IndicatorLayout = new javax.swing.GroupLayout(Weddings_Indicator);
        Weddings_Indicator.setLayout(Weddings_IndicatorLayout);
        Weddings_IndicatorLayout.setHorizontalGroup(
            Weddings_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        Weddings_IndicatorLayout.setVerticalGroup(
            Weddings_IndicatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPane_Weddings.add(Weddings_Indicator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 7, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_day_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel_Day_Day, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPane_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPane_Weddings, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel_day_trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel_Day_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPane_Product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPane_Weddings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_day_transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_day_transMouseClicked
     //   switchPanels(jPanel_Day);
//        finduserdaytrans();
     //   getsumday();
        /*Day_Indicator.setOpaque(true);
        Daypast_Indicator.setOpaque(false);
        Month_Indicator.setOpaque(false);
        Products_Indicator.setOpaque(false);
        Weddings_Indicator.setOpaque(false);*/
    }//GEN-LAST:event_jPanel_day_transMouseClicked

    private void jPanel_day_transMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_day_transMousePressed
        //        setColor(jPanel_day_trans);
        Day_Indicator.setOpaque(true);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
        Daypast_Indicator.setOpaque(false);
        Month_Indicator.setOpaque(false);
        Products_Indicator.setOpaque(false);
        Weddings_Indicator.setOpaque(false);
    }//GEN-LAST:event_jPanel_day_transMousePressed

    private void jPanel_Day_DayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Day_DayMouseClicked
        //switchPanels(jPanel_Day_past);
        /*  Day_Indicator.setOpaque(false);
        Daypast_Indicator.setOpaque(true);
        Month_Indicator.setOpaque(false);
        Products_Indicator.setOpaque(false);
        Weddings_Indicator.setOpaque(false);*/
    }//GEN-LAST:event_jPanel_Day_DayMouseClicked

    private void jPanel_Day_DayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Day_DayMousePressed
        //         setColor(jPanel_Day_Day);
        Daypast_Indicator.setOpaque(true);
        Day_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
        // Daypast_Indicator.setOpaque(false);
        Month_Indicator.setOpaque(false);
        Products_Indicator.setOpaque(false);
        Weddings_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Day_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
    }//GEN-LAST:event_jPanel_Day_DayMousePressed

    private void jPanel_MonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MonthMouseClicked
        //switchPanels(jPanel_month);
    }//GEN-LAST:event_jPanel_MonthMouseClicked

    private void jPanel_MonthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MonthMousePressed
        //   setColor(jPanel_Month);
        Month_Indicator.setOpaque(true);
        Day_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
        Daypast_Indicator.setOpaque(false);
        //Month_Indicator.setOpaque(false);
        Products_Indicator.setOpaque(false);
        Weddings_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Day_Indicator,Products_Indicator,Weddings_Indicator});
    }//GEN-LAST:event_jPanel_MonthMousePressed

    private void jPane_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_ProductMouseClicked
        //switchPanels(jPanel_product);
    }//GEN-LAST:event_jPane_ProductMouseClicked

    private void jPane_ProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_ProductMousePressed
        // setColor(jPane_Product);
        Products_Indicator.setOpaque(true);
        Day_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
        Daypast_Indicator.setOpaque(false);
        Month_Indicator.setOpaque(false);
        // Products_Indicator.setOpaque(false);
        Weddings_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Day_Indicator,Weddings_Indicator});
    }//GEN-LAST:event_jPane_ProductMousePressed

    private void jPane_WeddingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_WeddingsMouseClicked
       // switchPanels(jPanel_wedd);
    }//GEN-LAST:event_jPane_WeddingsMouseClicked

    private void jPane_WeddingsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPane_WeddingsMousePressed
        //setColor(jPane_Weddings);
        Weddings_Indicator.setOpaque(true);
        Day_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator,Weddings_Indicator});
        Daypast_Indicator.setOpaque(false);
        Month_Indicator.setOpaque(false);
        Products_Indicator.setOpaque(false);
        //Weddings_Indicator.setOpaque(false);
        // resetColor(new JPanel[]{Daypast_Indicator,Month_Indicator,Products_Indicator, Day_Indicator});
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Day_Indicator;
    private javax.swing.JPanel Daypast_Indicator;
    private javax.swing.JPanel Month_Indicator;
    private javax.swing.JPanel Products_Indicator;
    private javax.swing.JPanel Weddings_Indicator;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPane_Product;
    private javax.swing.JPanel jPane_Weddings;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Day_Day;
    private javax.swing.JPanel jPanel_Month;
    private javax.swing.JPanel jPanel_day_trans;
    // End of variables declaration//GEN-END:variables
}
