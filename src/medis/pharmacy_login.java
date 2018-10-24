/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medis;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author KHSCI5MCA16126
 */
public class pharmacy_login extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
    
     */
    public pharmacy_login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pharmacistId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pharmacistPassword = new javax.swing.JPasswordField();
        pharmacistLogin = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel2.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/icons/pharm_logo1.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 100, 160, 160);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PHARMACY ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 260, 123, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/icons/dialo_background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 300, 400);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 300, 400);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 40, 300, 50);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Pharmacist ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 110, 110, 30);

        pharmacistId.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        pharmacistId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        jPanel1.add(pharmacistId);
        pharmacistId.setBounds(330, 140, 190, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 210, 140, 30);

        pharmacistPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 2, true));
        pharmacistPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacistPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pharmacistPassword);
        pharmacistPassword.setBounds(330, 240, 190, 40);

        pharmacistLogin.setBackground(new java.awt.Color(204, 204, 255));
        pharmacistLogin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pharmacistLogin.setText("Login");
        pharmacistLogin.setBorder(null);
        pharmacistLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacistLoginActionPerformed(evt);
            }
        });
        jPanel1.add(pharmacistLogin);
        pharmacistLogin.setBounds(400, 320, 90, 40);

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("X");
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_button(evt);
            }
        });
        jPanel1.add(closeBtn);
        closeBtn.setBounds(560, 0, 40, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medis/icons/dialo_background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 0, 300, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(600, 397));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pharmacistPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacistPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pharmacistPasswordActionPerformed

    private void close_button(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_button
        dispose();
    }//GEN-LAST:event_close_button

    private void pharmacistLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacistLoginActionPerformed
        // TODO add your handling code here:

        con=my_sql_connect.connectdb();
        String sq="Select * from pharmacy where pharmacistID = ?";
        
        String pharmacist_id=pharmacistId.getText();
        String pharmacist_password= String.copyValueOf(pharmacistPassword.getPassword());     
                              
            try
            {
                pst=con.prepareStatement(sq);
                pst.setString(1,pharmacist_id);
                rs=pst.executeQuery();

                if(rs.next()) 
                {
                    if(pharmacist_id.equals(rs.getString(1)) && pharmacist_password.equals(rs.getString(2)))
                    {
                        //JOptionPane.showMessageDialog(null,"WELCOME ");
                        Adminlogin_page a=new Adminlogin_page();
                        a.setVisible(true);
                    } 
                }                   
                else
                {
                     JOptionPane.showMessageDialog(null,"INVALID USERNAME/PASSWORD","Access denied...",JOptionPane.ERROR_MESSAGE);   
                }
 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }        
    }//GEN-LAST:event_pharmacistLoginActionPerformed

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
            java.util.logging.Logger.getLogger(pharmacy_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacy_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacy_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacy_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacy_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pharmacistId;
    private javax.swing.JButton pharmacistLogin;
    private javax.swing.JPasswordField pharmacistPassword;
    // End of variables declaration//GEN-END:variables
}
