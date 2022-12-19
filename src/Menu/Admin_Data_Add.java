/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import Login.MyCNX;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Admin_Data_Add extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Data_Add
     */
    public Admin_Data_Add() {
        initComponents();
    }

    private void addData() {
        String username = jTextField_Username.getText();
        String fullname = jTextField_Fullname.getText();
        String password = jTextField_Password.getText();
        String job = jTextField_Job.getText();
        String phone = jTextField_Phone.getText();
        String address = jTextField_Address.getText();
        String email = jTextField_Email.getText();

        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "insert into Users(Username,Fullname,Password,Job,Phone,Address,Email,Role) values (?,?,?,?,?,?,?,'User')";

            ps = MyCNX.getConnection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, fullname);
            ps.setString(3, password);
            ps.setString(4, job);
            ps.setString(5, phone);
            ps.setString(6, address);
            ps.setString(7, email);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Your Data Has Been Added");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AdminAdd = new javax.swing.JPanel();
        jPanel_AdminAddHeader = new javax.swing.JPanel();
        jLabel_AdminAddTitle = new javax.swing.JLabel();
        jPanel_AdminAddPanel = new javax.swing.JPanel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Fullname = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_Job = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jTextField_Fullname = new javax.swing.JTextField();
        jTextField_Password = new javax.swing.JTextField();
        jTextField_Job = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(625, 525));

        jPanel_AdminAddHeader.setBackground(new java.awt.Color(248, 148, 6));

        jLabel_AdminAddTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel_AdminAddTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AdminAddTitle.setText("Admin Data Add");

        javax.swing.GroupLayout jPanel_AdminAddHeaderLayout = new javax.swing.GroupLayout(jPanel_AdminAddHeader);
        jPanel_AdminAddHeader.setLayout(jPanel_AdminAddHeaderLayout);
        jPanel_AdminAddHeaderLayout.setHorizontalGroup(
            jPanel_AdminAddHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminAddHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_AdminAddTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AdminAddHeaderLayout.setVerticalGroup(
            jPanel_AdminAddHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminAddHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_AdminAddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel_AdminAddPanel.setBackground(new java.awt.Color(44, 62, 80));

        jLabel_Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("Username");

        jLabel_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Fullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Fullname.setText("Fullname");

        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password");

        jLabel_Job.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Job.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Job.setText("Job");

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setText("Phone");

        jLabel_Address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Address");

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email");

        jButton_Add.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Add.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Add.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add.setText("Add");
        jButton_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_AddMouseClicked(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Cancel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.setToolTipText("");
        jButton_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_AdminAddPanelLayout = new javax.swing.GroupLayout(jPanel_AdminAddPanel);
        jPanel_AdminAddPanel.setLayout(jPanel_AdminAddPanelLayout);
        jPanel_AdminAddPanelLayout.setHorizontalGroup(
            jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminAddPanelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(jPanel_AdminAddPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel_Phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Job, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_Username)
                        .addComponent(jTextField_Fullname, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AdminAddPanelLayout.setVerticalGroup(
            jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminAddPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Fullname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Job))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Address)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel_AdminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout jPanel_AdminAddLayout = new javax.swing.GroupLayout(jPanel_AdminAdd);
        jPanel_AdminAdd.setLayout(jPanel_AdminAddLayout);
        jPanel_AdminAddLayout.setHorizontalGroup(
            jPanel_AdminAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AdminAddHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_AdminAddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_AdminAddLayout.setVerticalGroup(
            jPanel_AdminAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AdminAddLayout.createSequentialGroup()
                .addComponent(jPanel_AdminAddHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_AdminAddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AdminAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AdminAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_AddMouseClicked
        // TODO add your handling code here:
        addData();
    }//GEN-LAST:event_jButton_AddMouseClicked

    private void jButton_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CancelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_CancelMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Data_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Data_Add().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_AdminAddTitle;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Fullname;
    private javax.swing.JLabel jLabel_Job;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JPanel jPanel_AdminAdd;
    private javax.swing.JPanel jPanel_AdminAddHeader;
    private javax.swing.JPanel jPanel_AdminAddPanel;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_Job;
    private javax.swing.JTextField jTextField_Password;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}