/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

import Interfaces.Login;
import pos.pos1;

/**
 *
 * @author pct
 */
public class startt extends javax.swing.JFrame {

  
    public startt() {
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

        pos = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        adminlabel1 = new javax.swing.JLabel();
        poslabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(335, 145));
        setPreferredSize(new java.awt.Dimension(335, 145));
        setResizable(false);
        getContentPane().setLayout(null);

        pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_us_dollar_filled_100px_3.png"))); // NOI18N
        pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posMouseClicked(evt);
            }
        });
        getContentPane().add(pos);
        pos.setBounds(0, 0, 110, 100);

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_male_circle_filled_100px_1.png"))); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        getContentPane().add(admin);
        admin.setBounds(230, 0, 100, 100);

        adminlabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adminlabel1.setForeground(new java.awt.Color(204, 204, 204));
        adminlabel1.setText("POS");
        adminlabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminlabel1MouseClicked(evt);
            }
        });
        getContentPane().add(adminlabel1);
        adminlabel1.setBounds(30, 90, 50, 30);

        poslabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        poslabel.setForeground(new java.awt.Color(51, 51, 51));
        poslabel.setText("ADMIN");
        poslabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poslabelMouseClicked(evt);
            }
        });
        getContentPane().add(poslabel);
        poslabel.setBounds(250, 90, 70, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/four-people-gathered-around-a-table-working_gettyimages-520543612_afIOFSP.jpg"))); // NOI18N
        getContentPane().add(back);
        back.setBounds(0, 0, 330, 120);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posMouseClicked
        new pos1().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_posMouseClicked

    private void adminlabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminlabel1MouseClicked
        new pos1().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminlabel1MouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminMouseClicked

    private void poslabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poslabelMouseClicked
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_poslabelMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(startt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                {
                Thread.sleep(10000);
                }
                catch(Exception e){
                
                }
                
                
                new startt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel adminlabel1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel poslabel;
    // End of variables declaration//GEN-END:variables
}
